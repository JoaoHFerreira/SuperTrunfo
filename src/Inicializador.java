import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class Inicializador{
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

  baralho.adicionaCartas(cartas, iitg, aagl, ssta, ffrc);
  baralho.misturaCartas();
  baralho.distribuiCartas(jogador.cartas, computador.cartas);

  rodada.parImpar();
  rodada.iniciaPartida(jogador.cartas, computador.cartas);


  }
}
