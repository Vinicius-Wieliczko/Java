public class Quadrado extends Paralelogramo{
   public Quadrado(double lado){
      super(lado, lado);
   }
   
   public String toString(){
      String temp;
      temp = "\nA area do quadrado e: " +calcularArea()+ " U.A.\nO perimetro do quadrado e: " +calcularPerimetro()+ " U.C.";
      return temp; 
   }
}