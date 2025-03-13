public class Circulo implements FiguraEscalavel, FiguraGeometrica{
   private double raio;
   
   public Circulo(double raio){
      this.raio = raio;
   }
   
   public double calcularArea(){
      return Math.PI*raio*raio;
   }
   
   public double calcularPerimetro(){
      return Math.PI*2*raio;
   }
   
    public void aumentarObjeto(double valor){
      this.raio += valor;
   }
   
   
    public void diminuirObjeto(double valor){
      this.raio -= valor; 
   }

   
   public String toString(){
      String temp;
      temp  = "\nA area do circulo e: " +calcularArea()+ " U.A.\nO perimetro do circulo e: " +calcularPerimetro()+ " U.A.";
      return temp;
   }
}
         