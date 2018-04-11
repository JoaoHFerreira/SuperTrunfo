import  java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class Carta{                              //Classe que define atributos das cartas
  int itg;
  int sta;
  int agl;
  int frc;

  public Carta(int a, int b, int c ,int d){  // Construtor que inicializa as variáveis
      this.itg=a;
      this.sta=b;
      this.agl=c;
      this.frc=d;
  }
}
