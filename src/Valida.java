import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;



public class Valida extends Imprime {
  public Scanner op = new Scanner(System.in);
  public int a_jogador;
  public int a_computador;
  public int escolha;
  // Imprime imp= new Imprime();
  ArrayList<Carta> cemiterio=new ArrayList<Carta>() ;

  //   void Eh_empate(boolean eh_jogador, ArrayList<Carta> jogador,ArrayList<Carta> computador, int[] vetor_pos){
  //     escolha=defineAtributo(eh_jogador,jogador.get(vetor_pos[0]), computador.get(vetor_pos[1]));
  //
  //     int[] vetor_computador={computador.get(vetor_pos[1]).itg, computador.get(vetor_pos[1]).agl, computador.get(vetor_pos[1]).sta, computador.get(vetor_pos[1]).frc};
  //     int[] vetor_jogador={jogador.get(vetor_pos[0]).itg, jogador.get(vetor_pos[0]).agl, jogador.get(vetor_pos[0]).sta, jogador.get(vetor_pos[0]).frc};
  //
  //     if (vetor_computador[escolha]==vetor_jogador[escolha]) {
  //       System.out.println("\n\nDEU EMPATE, SITUACAO SE RESOLVE NA PROXIMA JOGADA\n\n");
  //       cemiterio.add(jogador.get(vetor_pos[0]));
  //       cemiterio.add(computador.get(vetor_pos[1]));
  //       jogador.remove(vetor_pos[0]);
  //       compudador.remove(vetor_pos[1]);
  //       Eh_empate(eh_jogador, jogador, computador, vetor_pos);
  //     }
  //
  // }

  public int defineAtributo(boolean eh_jogador, Carta jogador, Carta computador){
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
        /*imp.*/escolha_Computador(a_jogador);             //Método para informar qual atributo computador escolheu
        return a_jogador;
    }
  }


  public boolean jogada_Jogador(boolean eh_jogador, Carta jogador, Carta computador){

     escolha=defineAtributo(eh_jogador,jogador, computador);

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


  public  boolean jogada_Computador(boolean eh_jogador,Carta jogador, Carta computador){
    int[] vetor_computador={computador.itg, computador.agl, computador.sta, computador.frc};
    int[] vetor_jogador={jogador.itg, jogador.agl, jogador.sta, jogador.frc};
    int[] compara= {0,0};
    a_jogador=0;
    a_computador=0;

    for (int x=0;x<vetor_computador.length ;x++ ) {         //Loop para verificar maior atributo da máquina
      if (vetor_computador[x]>a_computador) {
        a_computador=vetor_computador[x];                 //Guarda maior atributo da máquina
        a_jogador=x;                                      //Guarda  atributo do joagador na posição concorrente
      }
      }
      /*imp.*/escolha_Computador(a_jogador);             //Método para informar qual atributo computador escolheu
      escolha = op.nextInt();
      return eh_maior(vetor_jogador[a_jogador], a_computador);         //retorna false se computaror venceu rodada e true se jogador venceu
  }

  public boolean eh_maior(int a_jogador, int a_computador){
      return a_jogador>a_computador;
  }

  public int[] alteraQtdCartas(boolean eh_jogador, ArrayList<Carta> jogador, ArrayList<Carta> computador, int[] vetor_pos){
    if (eh_jogador) {
      /*imp.*/frasesDeImpacto(eh_jogador);
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
      /*imp.*/frasesDeImpacto(eh_jogador);
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

  public boolean par_Impar(int escolha, int resultado){            //verfica se deu par ou impar
      if (  (escolha==0 && resultado%2==0)  ||  (escolha==1 && resultado%2==1) ) {   //Se escolha for para par e valor for par, ou se escolha for para impar e valor for impar retorna TRUE
        /*imp.*/msg_par_Impar(resultado, true);
        return true;
      }
      else{
        /*imp.*/msg_par_Impar(resultado, false);
        return false; //caso jogador nao tenha acertado retorna falso.
      }
  }

}
