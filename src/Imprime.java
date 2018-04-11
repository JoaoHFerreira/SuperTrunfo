import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class Imprime{
  ArrayList<String> f_negativa= new ArrayList<String>();
  ArrayList<String> f_positiva= new ArrayList<String>();

  void adiciona(){
    this.f_negativa.add("\t\t\t\t\t\t\tPERDEU A RODADA\n..Se ferra otario.... bem ruim tu hein!!!");
    this.f_negativa.add("\t\t\t\t\t\t\tPERDEU A RODADA\n..Carai.... nem na sorte tu manda bem!!");
    this.f_negativa.add("\t\t\t\t\t\t\tPERDEU A RODADA\n..Desiste da vida, melhor que tu faz...");
    this.f_negativa.add("\t\t\t\t\t\t\tPERDEU A RODADA\n..Nem tua mae gosta de ti... pc levou essa");
    this.f_positiva.add("\t\t\t\t\t\t\tGANHOU A RODADA\n..Uau.. voce eh um guerreiro do prazer sabia?");
    this.f_positiva.add("\t\t\t\t\t\t\tGANHOU A RODADA\n..Nosssa.. que golpe, voce eh especial!!");
    this.f_positiva.add("\t\t\t\t\t\t\tGANHOU A RODADA\n..Na rima tu me ganha.. no SuperTrunfo se Arreganha chuuuupa pc....!");
    this.f_positiva.add("\t\t\t\t\t\t\tGANHOU A RODADA\n..Demais, a vida pode estar ruim, mas o superTrunfo vai bem !");
  }

  void frasesDeImpacto(boolean eh_jogador){
    adiciona();
    if (eh_jogador) {
      Collections.shuffle(f_positiva);
      System.out.println(f_positiva.get(0));
    }
    else{
      Collections.shuffle(f_negativa);
      System.out.println(f_negativa.get(0));
    }
  }

  void intro(){
    System.out.println("\n\n----------BEM VINDO AO SUPER TRUNFO DO PRAZER----------\n\n\n\n");
  }

  void final_jogo(ArrayList<Carta> jogador, ArrayList<Carta> computador){
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
  void cartaDeQuemComeca(Carta jogador_que_comeca, String jog_que_comeca,String ent, ArrayList<Carta> jogador_q_comeca_cartas){                      //método criado para imprimir a carta de escolha da rodada
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

  void compara(Carta jogador, ArrayList<Carta> jogador_bar, Carta computador, ArrayList<Carta> computador_bar){                   //método criado para verificação da carta da rodada do jogador e computador, respectivamente
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

  void escolha_Computador(int atr){
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
   System.out.println("\n\n");// Para dar espaço entre informações
 }

 void msg_par_Impar(int resultado, boolean verif){
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
