public class Principal{
   public static void main (String[] args){
      FiguraGeometrica[] figuras = new FiguraGeometrica[3];
      
      figuras[0] = new Quadrado(3);
      figuras[1] = new Retangulo(2, 5);
      figuras[2] = new Circulo(4);
      
      FiguraEscalavel temp;
      
      for(int i = 0; i<3; i++){
          System.out.println(figuras[i]);
          temp = (FiguraEscalavel) figuras[i];
          temp.diminuirObjeto(1);
          System.out.println(figuras[i]);
          temp.aumentarObjeto(2);
          System.out.println(figuras[i]);
          System.out.println("_________________________________________________________________________________________________");
      }
      
      
      
      
   }
}