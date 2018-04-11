import  java.util.Scanner;

class Direction{
  int x;
  int y;
  String pos;
  int acum=0;


  void Construct(int x,int y, String pos ){
    this.x=x;
    this.y=y;
    this.pos=pos;
  }

  void MostraCoord(){
      System.out.printf("%d %d %s", this.x, this.y, this.pos);
  }
  void Movimenta(){
    if (this.pos.equals("N")) {
      this.y=this.y+1;
    }
    else if (this.pos.equals("S")) {
      this.y=this.y-1;
    }
    else if (this.pos.equals("E")) {
      this.x=this.x+1;
    }
    else if (this.pos.equals("W")) {
        this.x=this.x-1;
    }
    else{
      System.out.println("Coordenada direcional invalida, aceito apenas: N, S, E e W");
    }
  }

  void MudaDirecao(char dir){


    if   ((dir=='R' && this.pos.equals("N")) || (dir=='L' && this.pos.equals("S")) ){
      this.pos="E";
    }
    else if (   (dir=='R' && this.pos.equals("E"))   ||    (dir=='L' && this.pos.equals("W"))   ) {
      this.pos="S";
    }
    else if (   (dir=='R' && this.pos.equals("S"))   ||    (dir=='L' && this.pos.equals("N"))   ) {
      this.pos="W";
    }
    else if (   (dir=='R' && this.pos.equals("W"))   ||    (dir=='L' && this.pos.equals("E"))   ) {
      this.pos="N";
    }

  }


}

class Principal{
  public static void main(String[] args) {

    Scanner a = new Scanner(System.in);
    Direction coord= new Direction();
    int x = a.nextInt();
    int y = a.nextInt();
    String pos = a.next();
    String instr=a.next();

    System.out.printf("\n\n\n");
    coord.Construct(x, y, pos);


    for (int i=0;i<instr.length() ;i++ ) {
      if (instr.charAt(i)=='M') {
        coord.Movimenta();
      }
      else if (instr.charAt(i)=='R' || instr.charAt(i)=='L') {
        coord.MudaDirecao(instr.charAt(i));
        System.out.println(coord.pos);
      }
      else{
        System.out.println("Este nao eh um comando aceito, utilize apenas R, L  e M");
      }
    }
    coord.MostraCoord();

  }
}
