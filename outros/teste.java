import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



class Imprime{                                                       //Classe criada para visualização das jogadas/cartas
  void Cabec(Carta jogador, Carta computador){                      //método criado para imprimir a carta de escolha da rodada
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

  void Comp(Carta jogador, Carta computador){                   //método criado para verificação da carta da rodada do jogador e computador, respectivamente
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
  public static int Verifica(int a_jogador, int a_computador){
    if (eh_maior( a_jogador,  a_computador)) {
      return 1;
    }
    else {
      return 0;
    }
  }

  public static boolean eh_maior(int a_jogador, int a_computador){
      return a_jogador>a_computador;
  }

}



class Jogador{
  ArrayList<Carta> cartas = new ArrayList<Carta>();
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
  ArrayList<Carta> baralho = new ArrayList<Carta>();  //Cria objeto baralho
  Jogador jogador=new Jogador();                      //Inicializa jogador
  Jogador computador=new Jogador();                   //Inicializa computador
  Imprime compet=new Imprime();                       //Ojeto que traz informações visuais sobre andamento do jogo
  Valida  check=new Valida();                         //Ojeto que faz validações par andamento do jogo
  int a_jogador, a_computador;


  class Embaralha {

  }


  for (int i=0;i<cartas.length ;i++ ) {
    cartas[i]=new Carta();
    cartas[i].Constr(iitg[i], aagl[i], ssta[i], ffrc[i]);
    baralho.add(cartas[i]);
     }


   Collections.shuffle(baralho); //embaralha cartas

   for (int i = 0; i < (baralho.size())-16; i++) {
     // baralho.get(i).Cabec();
     jogador.cartas.add(baralho.get(i));
     computador.cartas.add(baralho.get(i+16));
   }

   compet.Cabec(jogador.cartas.get(0),computador.cartas.get(0));


   Scanner sc = new Scanner(System.in);
   int escolha;
   do {
     System.out.println("Escolha seu melhor atributo para vencer esta rodada:\n");
     System.out.println("Inteligencia, Digite   1");
     System.out.println("Agilidade,    Digite   2");
     System.out.println("Stamina,      Digite   3");
     System.out.println("Forca,        Digite   4");
     escolha = sc.nextInt();
   } while (escolha<1 || escolha>4);

   if (escolha==1) {
     a_jogador=jogador.cartas.get(0).itg;
     a_computador=computador.cartas.get(0).itg;
   }
   else if (escolha==2) {
     a_jogador=jogador.cartas.get(0).sta;
     a_computador=computador.cartas.get(0).sta;
   }
   else if (escolha==3) {
     a_jogador=jogador.cartas.get(0).agl;
     a_computador=computador.cartas.get(0).agl;
   }
   else {
     a_jogador=jogador.cartas.get(0).frc;
     a_computador=computador.cartas.get(0).frc;
   }

  compet.Comp(jogador.cartas.get(0),computador.cartas.get(0));
  int a=check.Verifica( a_jogador,a_computador);


  if (a==1) {
    System.out.println("Jogador ganhou a rodada");
  }
  else{
    System.out.println("Computador ganhou a rodada");
  }

  }
}



// 	public static void main(String args[])
// 	{
// 		Scanner sc = new Scanner(System.in); // object for scanner
// 		System.out.printl("Enter your No: ");
// 		int no = sc.nextInt(); // similiarli Float,Double can be added to it as per the data type.
// 		System.out.printl("you entered : "+no);
// 	}
// }
