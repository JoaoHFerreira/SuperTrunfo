import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

// class FrasesDeImpacto{
//   ArrayList<String> f_negativa= new ArrayList<String>();
//   ArrayList<String> f_positiva= new ArrayList<String>();
//   String a="Se fudeu...Se continuar assim vai perder";
//   f_negativa.add(a);
//   // f_negativa.add('");
//   // f_negativa.add("Você é bem imprestável sabia ? Aposto que nem tua mãe gosta de ti");
//   // f_negativa.add("PQP.... vai ser ruim assim na casa do capeta");
//   // f_negativa.add("Nem nisso tu é bom/boa.. desiste da vida que é mais fácil");
//   // f_positiva.add("Parabéns você venceu esta rodada !");
//   // f_positiva.add("Que bacana, você esta indo muito bem !");
//   // f_positiva.add("Aposto que você é demais em tudo que faz !");
//   // f_positiva.add("Demais!!!!! Continua assim e o mundo vai ser teu !");
// }

class Imprime{
  ArrayList<String> f_negativa= new ArrayList<String>();
  ArrayList<String> f_positiva= new ArrayList<String>();

  void Adiciona(){
    this.f_negativa.add("                       PERDEU A RODADA\n..Se fude otario.... bem ruim tu hein!!!");
    this.f_negativa.add("                       PERDEU A RODADA\n..Carai.... nem na sorte tu manda bem!!");
    this.f_negativa.add("                       PERDEU A RODADA\n..Desiste da vida, melhor que tu faz...");
    this.f_negativa.add("                       PERDEU A RODADA\n..Nem tua mae gosta de ti... pc levou essa");
    this.f_positiva.add("                       GANHOU A RODADA\n..Uau.. voce eh um guerreiro do prazer sabia?");
    this.f_positiva.add("                       GANHOU A RODADA\n..Nosssa.. que golpe, voce eh especial!!");
    this.f_positiva.add("                       GANHOU A RODADA\n..Na rima tu me ganha.. no SuperTrunfo se Arreganha chuuuupa pc....!");
    this.f_positiva.add("                       GANHOU A RODADA\n..Demais, a vida pode estar ruim, mas o superTrunfo vai bem !");
  }

  void FrasesDeImpacto(boolean eh_jogador){
    Adiciona();
    if (eh_jogador) {
      Collections.shuffle(f_positiva);
      System.out.println(f_positiva.get(0));
    }
    else{
      Collections.shuffle(f_negativa);
      System.out.println(f_negativa.get(0));
    }
  }

  void Intro(){
    System.out.println("\n\n----------BEM VINDO AO SUPER TRUNFO DO PRAZER----------\n\n\n\n");
  }

  void Final(ArrayList<Carta> jogador, ArrayList<Carta> computador){
    if (jogador.size()>computador.size()) {
      System.out.println("||----------------------------------------------||");
      System.out.println("||                                              ||");
      System.out.println("||    VOCE  EH PICA.... NINGUEM PODE CONTIGO !! ||");
      System.out.println("||   PARABENS POR ESTA CONQUSITA NA SUA VIDA !! ||");
      System.out.println("||                                              ||");
      System.out.println("||----------------------------------------------||");
    }
    else {
      System.out.println("||----------------------------------------------||");
      System.out.println("||                                              ||");
      System.out.println("||           VOCE  EH UM IMPRESTAVEL..       !! ||");
      System.out.println("||      NASCER DE VOLTA PODE SER UMA SOLUCAO !! ||");
      System.out.println("||                                              ||");
      System.out.println("||----------------------------------------------||");
    }
  }

                                                      //Classe criada para visualização das jogadas/cartas
  void CartaDeQuemComeca(Carta jogador_que_comeca, String jog_que_comeca,String ent, ArrayList<Carta> jogador_q_comeca_cartas){                      //método criado para imprimir a carta de escolha da rodada
     System.out.printf("  %s tem %d cartas   \n",ent, jogador_q_comeca_cartas.size());
    System.out.printf("       %s       \n\n", jog_que_comeca);
    System.out.println("||-------------------||");
    System.out.println("||   SUPER TRUNFO    ||");
    System.out.println("||-------------------||");
    System.out.println("|| Pleasure Warriors ||");
    System.out.println("||-------------------||");
    System.out.println("||-------------------||");
     System.out.printf("||Inteligencia: %d   ||\n", jogador_que_comeca.itg);
     System.out.println("||-------------------||");
     System.out.printf("||Agilidade   : %d   ||\n", jogador_que_comeca.agl);
     System.out.println("||-------------------||");
     System.out.printf("||Stamina     : %d   ||\n", jogador_que_comeca.sta);
     System.out.println("||-------------------||")  ;
     System.out.printf("||Forca       : %d   ||\n", jogador_que_comeca.frc);
     System.out.println("||-------------------||");
     System.out.println("||-------------------||");
    System.out.println("|| Pleasure Warriors ||");
    System.out.println("||-------------------||\n\n");
  }

  void Compara(Carta jogador, ArrayList<Carta> jogador_bar, Carta computador, ArrayList<Carta> computador_bar){                   //método criado para verificação da carta da rodada do jogador e computador, respectivamente
      System.out.printf("   Voce tem %d cartas                 Computador tem %d cartas\n",jogador_bar.size(), computador_bar.size());
      System.out.println("       Sua Carta                        Computador      ");
      System.out.println("||-------------------||          ||-------------------||");
      System.out.println("||   SUPER TRUNFO    ||          ||   SUPER TRUNFO    ||");
      System.out.println("||-------------------||          ||-------------------||");
      System.out.println("|| Pleasure Warriors ||          || Pleasure Warriors ||");
      System.out.println("||-------------------||          ||-------------------||");
      System.out.println("||-------------------||          ||-------------------||");
       System.out.printf("||Inteligencia: %d   ||          ||Inteligencia: %d   ||\n", jogador.itg,computador.itg);
       System.out.println("||-------------------||          ||-------------------||");
       System.out.printf("||Agilidade   : %d   ||          ||Agilidade   : %d   ||\n", jogador.agl,computador.agl);
       System.out.println("||-------------------||          ||-------------------||");
       System.out.printf("||Stamina     : %d   ||          ||Stamina     : %d   ||\n", jogador.sta,computador.sta);
       System.out.println("||-------------------||          ||-------------------||");
       System.out.printf("||Forca       : %d   ||          ||Forca       : %d   ||\n", jogador.frc,computador.frc);
       System.out.println("||-------------------||          ||-------------------||");
       System.out.println("||-------------------||          ||-------------------||");
      System.out.println("|| Pleasure Warriors ||          || Pleasure Warriors ||");
      System.out.println("||-------------------||          ||-------------------||\n\n");
  }
}


class Valida{
  public static Scanner op = new Scanner(System.in);
  public static int a_jogador;
  public static int a_computador;
  public static int escolha;
  Imprime imp= new Imprime();

  public static ArrayList<Carta> cemiterio=new ArrayList<Carta>() ;

    public static void Eh_empate(boolean eh_jogador, ArrayList<Carta> jogador,ArrayList<Carta> computador, int[] vetor_pos){
      escolha=DefineAtributo(eh_jogador,jogador.get(vetor_pos[0]), computador.get(vetor_pos[1]));

      int[] vetor_computador={computador.get(vetor_pos[1]).itg, computador.get(vetor_pos[1]).agl, computador.get(vetor_pos[1]).sta, computador.get(vetor_pos[1]).frc};
      int[] vetor_jogador={jogador.get(vetor_pos[0]).itg, jogador.get(vetor_pos[0]).agl, jogador.get(vetor_pos[0]).sta, jogador.get(vetor_pos[0]).frc};

      if (vetor_computador[escolha]==vetor_jogador[escolha]) {
        System.out.println("\n\nDEU EMPATE, SITUACAO SE RESOLVE NA PROXIMA JOGADA\n\n");
        cemiterio.add(jogador.get(vetor_pos[0]));
        cemiterio.add(computador.get(vetor_pos[1]));
        jogador.remove(vetor_pos[0]);
        computador.remove(vetor_pos[1]);
        Eh_empate(eh_jogador, jogador, computador, vetor_pos);
      }
      return eh_maior(vetor_jogador[escolha],vetor_computador[escolha]);
  }

  public static int DefineAtributo(boolean eh_jogador, Carta jogador, Carta computador){
    int[] vetor_computador={computador.itg, computador.agl, computador.sta, computador.frc};
    int[] vetor_jogador={jogador.itg, jogador.agl, jogador.sta, jogador.frc};
    int[] compara= {0,0};
    a_jogador=0;
    a_computador=0;


    if (eh_jogador) {
      do {
        System.out.println("\n\nEscolha seu melhor atributo para vencer esta rodada:\n");
        System.out.println("Inteligencia, Digite   1");
        System.out.println("Agilidade,    Digite   2");
        System.out.println("Stamina,      Digite   3");
        System.out.println("Forca,        Digite   4\n");
        escolha = op.nextInt();
        System.out.println("\n\n");
      } while (escolha<1 || escolha>4);
      return escolha;
    }
    else{
      for (int x=0;x<vetor_computador.length ;x++ ) {         //Loop para verificar maior atributo da máquina
        if (vetor_computador[x]>a_computador) {
          a_computador=vetor_computador[x];                 //Guarda maior atributo da máquina
          a_jogador=x;                                      //Guarda  atributo do joagador na posição concorrente
        }
        }
        Escolha_Computador(a_jogador);             //Método para informar qual atributo computador escolheu
        return a_jogador;
    }
  }


  public static boolean Jogada_Jogador(boolean eh_jogador, ArrayList<Carta> jogador, ArrayList<Carta> computador, int[] vetor_pos){

     escolha=DefineAtributo(eh_jogador,jogador.get(vetor_pos[0]), computador.get(vetor_pos[1]));

     if (escolha==1) {
        a_jogador=jogador.get(vetor_pos[0]).itg;
        a_computador=computador.get(vetor_pos[1]).itg;
      }
      else if (escolha==2) {
        a_jogador=jogador.get(vetor_pos[0]).agl;
        a_computador=computador.get(vetor_pos[1]).agl;
      }
      else if (escolha==3) {
        a_jogador=jogador.get(vetor_pos[0]).sta;
        a_computador=computador.get(vetor_pos[1]).sta;
      }
      else {
        a_jogador=jogador.get(vetor_pos[0]).frc;
        a_computador=computador.get(vetor_pos[1]).frc;
      }

      if (a_jogador==a_computador) {
        Eh_empate(eh_jogador, jogador, computador, vetor_pos);
        if (eh_maior(a_jogador, a_computador)) {
          AddFromCemiterio(jogador);
        }
        else {
          AddFromCemiterio(computador);
        }
      }

      return eh_maior(a_jogador, a_computador);

  }

  public static void AddFromCemiterio(ArrayList<Carta> jogador){
    for (int i = 0; i < cemiterio.size(); i++) { //Alternativamente poderis incremento poderia ser i+2
      jogador.add(cemiterio.get(i));
    }
  }

  public  static void Escolha_Computador(int atr){
    System.out.println("\n******************************************\n");
    if (atr==0) {
      System.out.printf("\nComputador escolheu o atributo INTELIGENCIA\n");
    }
    else if (atr==1) {
      System.out.printf("\nComputador escolheu o atributo AGILIDADE\n");
    }
    else if (atr==2) {
      System.out.printf("\nComputador escolheu o atributo STAMINA\n");
    }
    else{
      System.out.printf("\nComputador escolheu o atributo FORCA\n");
    }
    System.out.println("\n******************************************\n\n");
    System.out.println("Digite qualquer numero para comparar as cartas da rodada\n\n");
    escolha = op.nextInt();
    System.out.println("\n\n");// Para dar espaço entre informações
  }

  public static boolean Jogada_Computador(boolean eh_jogador,ArrayList<Carta> jogador, ArrayList<Carta> computador,int[] vetor_pos){
    int[] vetor_computador={computador.get(vetor_pos[1]).itg, computador.get(vetor_pos[1]).agl, computador.get(vetor_pos[1]).sta, computador.get(vetor_pos[1]).frc};
    int[] vetor_jogador={jogador.get(vetor_pos[0]).itg, jogador.get(vetor_pos[0]).agl, jogador.get(vetor_pos[0]).sta, jogador.get(vetor_pos[0]).frc};
    int[] compara= {0,0};
    a_jogador=0;
    a_computador=0;

    for (int x=0;x<vetor_computador.length ;x++ ) {         //Loop para verificar maior atributo da máquina
      if (vetor_computador[x]>a_computador) {
        a_computador=vetor_computador[x];                 //Guarda maior atributo da máquina
        a_jogador=x;                                      //Guarda  atributo do joagador na posição concorrente
      }
      }
      Escolha_Computador(a_jogador);             //Método para informar qual atributo computador escolheu


      if (vetor_jogador[a_jogador]==a_computador) {
        Eh_empate(eh_jogador, jogador, computador, vetor_pos);
        if (eh_maior(a_jogador, a_computador)) {
          AddFromCemiterio(jogador);
        }
        else {
          AddFromCemiterio(computador);
        }
      }

      return eh_maior(vetor_jogador[a_jogador], a_computador);         //retorna false se computaror venceu rodada e true se jogador venceu
  }

  public static boolean eh_maior(int a_jogador, int a_computador){
      return a_jogador>a_computador;
  }

  public int[] AlteraQtdCartas(boolean eh_jogador, ArrayList<Carta> jogador, ArrayList<Carta> computador, int[] vetor_pos){
    if (eh_jogador) {
      imp.FrasesDeImpacto(eh_jogador);
      System.out.println("\n\n");
      jogador.add(computador.get(vetor_pos[1]));
      computador.remove(computador.get(vetor_pos[1]));
      vetor_pos[0]++;                             //Pula para próxima carta apenas se vencer
      if (computador.size()==vetor_pos[1]) {
        vetor_pos[1]=0;
      }
      System.out.println("Digite qualquer numero para continuar");
      return vetor_pos;
    }
    else {
      imp.FrasesDeImpacto(eh_jogador);
      System.out.println("\n\n");
      computador.add(jogador.get(vetor_pos[0]));
      jogador.remove(jogador.get(vetor_pos[0]));
      vetor_pos[1]++;                                  //Pula para próxima carta apenas se vencer
      if (jogador.size()==vetor_pos[0]) {
        vetor_pos[0]=0;
      }
      System.out.println("Digite qualquer numero para continuar");
      return vetor_pos;
    }
  }

  public static boolean Par_Impar(int escolha, int resultado){            //verfica se deu par ou impar
      if (  (escolha==0 && resultado%2==0)  ||  (escolha==1 && resultado%2==1) ) {   //Se escolha for para par e valor for par, ou se escolha for para impar e valor for impar retorna TRUE
        Msg_Par_impar(resultado, true);
        return true;
      }
      else{
        Msg_Par_impar(resultado, false);
        return false; //caso jogador nao tenha acertado retorna falso.
      }
  }

  public static void Msg_Par_impar(int resultado, boolean verif){
      if (resultado%2==0) {
        if(verif) {
          System.out.printf("\n\n%d, eh par, voce comeca !", resultado);
        }
        else{
          System.out.printf("\n\n%d, eh par, computador comeca !", resultado);
        }
      }
      else{
        if(verif) {
          System.out.printf("\n\n%d, eh impar, voce comeca !", resultado);
        }
        else {
          System.out.printf("\n\n%d, eh impar, computador comeca !", resultado);
        }
      }
  }

}


class Jogador{
  ArrayList<Carta> cartas = new ArrayList<Carta>();
}



class Baralho {
  ArrayList<Carta> baralho = new ArrayList<Carta>();

  void AdicionaCartas(Carta[] cartas, int[] inteligencia, int[] agilidade, int[] stamina, int[] forca){
    for (int i=0;i<cartas.length ;i++ ) {
      cartas[i]=new Carta();
      cartas[i].Constr(inteligencia[i], agilidade[i], stamina[i], forca[i]);
      this.baralho.add(cartas[i]);
       }
  }

  void MisturaCartas(){
    Collections.shuffle(this.baralho);
  }

  void DistribuiCartas(ArrayList<Carta>  jogador, ArrayList<Carta> computador){
    for (int i = 0; i < (this.baralho.size())-16; i++) { //Alternativamente poderis incremento poderia ser i+2
      jogador.add(baralho.get(i));
      computador.add(baralho.get(i+16));
    }
  }

}


class Rodada{
  int numero=0;
  Imprime imp=new Imprime();                       //Ojeto que traz informações visuais sobre andamento do jogo
  Valida  ck=new Valida();                      //Ojeto que faz validações par andamento do jogo
  boolean eh_jogador;                           // 0 se computador ganhou par impar, 1 se jogador.

    void ParImpar(){
    Scanner var = new Scanner(System.in);
    Random rand = new Random();
    int    parimpar;

    do {
      System.out.printf("\n\nPar ou impar para definir quem inicia o jogo:\nDigite 0 para 'Par' ou 1 para 'Impar' !\n\n");
      parimpar= var.nextInt();                             //recebe solicitação de par e impar do usuário
    } while (parimpar<0 || parimpar>1);

    int p_i = rand.nextInt(10);                        //gera número aleatório entre 0 e 10;
    this.eh_jogador=ck.Par_Impar(parimpar,p_i);                 //Função para validar par impar e indicar quem começa jogo

    System.out.println("\n\nDigite qualquer numero para continuar....\n");
    int tempo=var.nextInt();

  }

  void IniciaPartida(ArrayList<Carta> jogador, ArrayList<Carta> computador){
    imp.Intro();
    int[] vetor_pos={0,0} ;    //primeiro posicao jogador, segundo computador
    int pos=0;
    Scanner pause = new Scanner(System.in);
    int stop;
    String comp="Computador";
    String joga="Sua Carta";
    String vc="Voce";
    String pc="Pc";

    while (jogador.size()>0 && computador.size()>0) {
      System.out.printf("Essa eh a rodada %d\n\n", numero+1);
      numero++;
      if (this.eh_jogador) {                                  //Valida qual carta ira aparcer
        imp.CartaDeQuemComeca(jogador.get(vetor_pos[0]),joga,vc, jogador);
      }
      // else{
      //   imp.CartaDeQuemComeca(computador.get(pos),comp,pc, computador);  // De cara esta condição apresentaria a carta do computador... porém.. caso fosse um jogo o adversário não teria acesso as informações, por isso foi definido deixar esta informação oculta
      // }
      // ck.Eh_empate(this.eh_jogador,jogador, computador, vetor_pos);
      if (this.eh_jogador) {
        this.eh_jogador=ck.Jogada_Jogador(this.eh_jogador,jogador, computador, vetor_pos);
      }
      else {
        this.eh_jogador=ck.Jogada_Computador(this.eh_jogador,jogador, computador, vetor_pos);
      }

      imp.Compara(jogador.get(vetor_pos[0]),jogador, computador.get(vetor_pos[1]), computador);
      vetor_pos=ck.AlteraQtdCartas(this.eh_jogador, jogador, computador, vetor_pos);
      stop= pause.nextInt();
      System.out.println("\n\n");
    }
    imp.Final(jogador, computador);
  }
}


class Carta{                              //Classe que define atributos das cartas
  int itg;
  int sta;
  int agl;
  int frc;

  void Constr(int a, int b, int c ,int d){  // Método que inicializa as variáveis
      this.itg=a;
      this.sta=b;
      this.agl=c;
      this.frc=d;
  }
}

class Inicializador{
  public static void main(String[] args) {
  int[] iitg ={97, 89, 96,86,86,91,99,87,79,86,76,76,81,89,90,77,69,76,66,66,71,79,80,67,59,66,56,56,61,69,70,57};
  int[]	 aagl={93, 88, 96,93,99,10, 0,88,83,78,86,83,89,90,78,79,73,68,76,73,79,80,68,78,63,58,66,63,69,70,58,59};
  int[]  ssta={93, 85, 96,99,94,89,92,83,75,86,89,84,79,82,83,73,65,76,79,74,69,72,73,63,55,66,69,64,59,62,63,61};
  int[]  ffrc={97,100, 93,89,85,86,91,87,90,83,79,75,76,81,82,77,80,73,69,65,66,71,72,67,70,63,59,55,56,61,62,60};

  Carta[] cartas = new Carta[32];                     //Cria vetor com cartas
  Baralho baralho= new Baralho();
  Jogador jogador=new Jogador();                      //Inicializa jogador
  Jogador computador=new Jogador();                   //Inicializa computador
  Rodada rodada=new Rodada();

  baralho.AdicionaCartas(cartas, iitg, aagl, ssta, ffrc);
  baralho.MisturaCartas();
  baralho.DistribuiCartas(jogador.cartas, computador.cartas);

  rodada.ParImpar();
  rodada.IniciaPartida(jogador.cartas, computador.cartas);


  }
}
