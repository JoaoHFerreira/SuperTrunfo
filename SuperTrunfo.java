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
  void Intro(){
    System.out.println("\n\n----------BEM VINDO AO SUPER TRUNFO DO PRAZER----------\n\n\n\n");
  }
                                                      //Classe criada para visualização das jogadas/cartas
  void SuaCarta(ArrayList<Carta> jogador_cartas, Carta jogador, Carta computador){                      //método criado para imprimir a carta de escolha da rodada
     System.out.printf("  Voce tem %d cartas   \n\n", jogador_cartas.size());
    System.out.println("       Sua Carta       ");
    System.out.println("||-------------------||");
    System.out.println("||   SUPER TRUNFO    ||");
    System.out.println("||-------------------||");
    System.out.println("|| Pleasure Warriors ||");
    System.out.println("||-------------------||");
    System.out.println("||-------------------||");
     System.out.printf("||Inteligencia: %d   ||\n", jogador.itg);
     System.out.println("||-------------------||");
     System.out.printf("||Agilidade   : %d   ||\n", jogador.agl);
     System.out.println("||-------------------||");
     System.out.printf("||Stamina     : %d   ||\n", jogador.sta);
     System.out.println("||-------------------||")  ;
     System.out.printf("||Forca       : %d   ||\n", jogador.frc);
     System.out.println("||-------------------||");
     System.out.println("||-------------------||");
    System.out.println("|| Pleasure Warriors ||");
    System.out.println("||-------------------||\n\n");
  }

  void Compara(Carta jogador, Carta computador){                   //método criado para verificação da carta da rodada do jogador e computador, respectivamente
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

  public static boolean Jogada(Carta jogador, Carta computador){
    int escolha;
     do {
       System.out.println("\n\nEscolha seu melhor atributo para vencer esta rodada:\n");
       System.out.println("Inteligencia, Digite   1");
       System.out.println("Agilidade,    Digite   2");
       System.out.println("Stamina,      Digite   3");
       System.out.println("Forca,        Digite   4\n");
       escolha = op.nextInt();
     } while (escolha<1 || escolha>4);

     if (escolha==1) {
        a_jogador=jogador.itg;
        a_computador=computador.itg;
      }
      else if (escolha==2) {
        a_jogador=jogador.agl;
        a_computador=computador.agl;
      }
      else if (escolha==3) {
        a_jogador=jogador.sta;
        a_computador=computador.sta;
      }
      else {
        a_jogador=jogador.frc;
        a_computador=computador.frc;
      }

      return eh_maior(a_jogador, a_computador);

  }

  public static boolean eh_maior(int a_jogador, int a_computador){
      return a_jogador>a_computador;
  }

  void AlteraQtdCartas(boolean jogador_comeca, ArrayList<Carta> jogador, ArrayList<Carta> computador, int cont){
    if (jogador_comeca) {
      System.out.println("Voce venceu esta rodada");
      jogador.add(computador.get(cont));
      computador.remove(computador.get(cont));
    }
    else {
      System.out.println("Se fudeu...  computador levou essa...\n\n");
      computador.add(jogador.get(cont));
      jogador.remove(jogador.get(cont));
    }
    System.out.println("Digite qualquer numero para continuar");
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
          System.out.printf("%d, eh par, voce comeca !", resultado);
        }
        else{
          System.out.printf("%d, eh par, computador comeca !", resultado);
        }
      }
      else{
        if(verif) {
          System.out.printf("%d, eh impar, voce comeca !", resultado);
        }
        else {
          System.out.printf("%d, eh impar, computador comeca !", resultado);
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
    for (int i = 0; i < (this.baralho.size())-16; i++) {
      jogador.add(baralho.get(i));
      computador.add(baralho.get(i+16));
    }
  }

}


class Rodada{
  int numero;
  Imprime imp=new Imprime();                       //Ojeto que traz informações visuais sobre andamento do jogo
  Valida  ck=new Valida();                      //Ojeto que faz validações par andamento do jogo
  boolean eh_jogador;                           // 0 se computador ganhou par impar, 1 se jogador.

    void ParImpar(){
    Scanner var = new Scanner(System.in);
    Random rand = new Random();
    int    parimpar;

    do {
      System.out.printf("Par ou impar para definir quem inicia o jogo:\nDigite 0 para 'Par' ou 1 para 'Impar' !\n\n");
      parimpar= var.nextInt();                             //recebe solicitação de par e impar do usuário
    } while (parimpar<0 || parimpar>1);

    int p_i = rand.nextInt(10);                        //gera número aleatório entre 0 e 10;
    this.eh_jogador=ck.Par_Impar(parimpar,p_i);                 //Função para validar par impar e indicar quem começa jogo

    System.out.println("\n\nDigite qualquer numero para continuar....\n");
    int tempo=var.nextInt();

  }

  void IniciaPartida(ArrayList<Carta> jogador, ArrayList<Carta> computador){
    imp.Intro();
    int cont=0;
    boolean jogador_comeca;
    Scanner pause = new Scanner(System.in);
    int stop;

    do {
      imp.SuaCarta(jogador,jogador.get(cont), computador.get(cont));
      jogador_comeca=ck.Jogada(jogador.get(cont), computador.get(cont));
      imp.Compara(jogador.get(cont), computador.get(cont));
      ck.AlteraQtdCartas(jogador_comeca, jogador, computador, cont);
      stop= pause.nextInt();
      System.out.println("\n\n");
      cont++;
    } while (jogador.size()>0 || computador.size()>0);

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
