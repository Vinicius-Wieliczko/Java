public class Retangulo extends Paralelogramo{

   public Retangulo(double lado1, double lado2){
      super(lado1, lado2);
   }
   
   public String toString(){
      String temp;
      temp = "\nA area do retangulo e: " +calcularArea()+ " U.A.\nO perimetro do retangulo e: " +calcularPerimetro()+ " U.C.";
      return temp;
   }
      
}