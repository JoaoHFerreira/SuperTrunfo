import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class Rodada extends Imprime{
  int numero=0;
  // Imprime imp=new Imprime();                       //Ojeto que traz informações visuais sobre andamento do jogo
  Valida  ck=new Valida();                      //Ojeto que faz validações par andamento do jogo
  boolean eh_jogador;                           // 0 se computador ganhou par impar, 1 se jogador.

    void parImpar(){
    Scanner var = new Scanner(System.in);
    Random rand = new Random();
    int    parImpar;

    do {
      System.out.printf("\n\nPar ou impar para definir quem inicia o jogo:\nDigite 0 para 'Par' ou 1 para 'Impar' !\n\n");
      parImpar= var.nextInt();                             //recebe solicitação de par e impar do usuário
    } while (parImpar<0 || parImpar>1);

    int p_i = rand.nextInt(10);                        //gera número aleatório entre 0 e 10;
    this.eh_jogador=ck.par_Impar(parImpar,p_i);                 //Função para validar par impar e indicar quem começa jogo

    System.out.println("\n\nDigite qualquer numero para continuar....\n");
    int tempo=var.nextInt();

  }

  void iniciaPartida(ArrayList<Carta> jogador, ArrayList<Carta> computador){
    /*imp.*/intro();
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
        /*imp.*/cartaDeQuemComeca(jogador.get(vetor_pos[0]),joga,vc, jogador);
      }
      // else{
      //   /*imp.*/cartaDeQuemComeca(computador.get(pos),comp,pc, computador);  // De cara esta condição apresentaria a carta do computador... porém.. caso fosse um jogo o adversário não teria acesso as informações, por isso foi definido deixar esta informação oculta
      // }
      // ck.Eh_empate(this.eh_jogador,jogador, computador, vetor_pos);
      if (this.eh_jogador) {
        this.eh_jogador=ck.jogada_Jogador(this.eh_jogador,jogador.get(vetor_pos[0]), computador.get(vetor_pos[1]));
      }
      else {
        this.eh_jogador=ck.jogada_Computador(this.eh_jogador,jogador.get(vetor_pos[0]), computador.get(vetor_pos[1]));
      }

      /*imp.*/compara(jogador.get(vetor_pos[0]),jogador, computador.get(vetor_pos[1]), computador);
      vetor_pos=ck.alteraQtdCartas(this.eh_jogador, jogador, computador, vetor_pos);
      stop= pause.nextInt();
      System.out.println("\n\n");
    }
    /*imp.*/final_jogo(jogador, computador);
  }
}
