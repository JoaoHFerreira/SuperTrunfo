import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class Baralho {
  ArrayList<Carta> baralho = new ArrayList<Carta>();

  void adicionaCartas(Carta[] cartas, int[] inteligencia, int[] agilidade, int[] stamina, int[] forca){
    for (int i=0;i<cartas.length ;i++ ) {
      cartas[i]=new Carta(inteligencia[i], agilidade[i], stamina[i], forca[i]);
      this.baralho.add(cartas[i]);
       }
  }

  void misturaCartas(){
    Collections.shuffle(this.baralho);
  }

  void distribuiCartas(ArrayList<Carta>  jogador, ArrayList<Carta> computador){
    for (int i = 0; i < (this.baralho.size())-16; i++) { //Alternativamente poderis incremento poderia ser i+2
      jogador.add(baralho.get(i));
      computador.add(baralho.get(i+16));
    }
  }

}
