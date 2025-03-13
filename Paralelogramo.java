public abstract class Paralelogramo implements FiguraGeometrica, FiguraEscalavel{
   private double lado1;
   private double lado2;
   
   public Paralelogramo(double lado1, double lado2){
      this.lado1 = lado1;
      this.lado2 = lado2;
   }
   
   
   public double calcularArea(){
         return lado1*lado2;
   }
   
   public double calcularPerimetro(){
      return lado1*2+lado2*2;
   }
   
   public void aumentarObjeto(double valor){
      this.lado1 += valor;
      this.lado2 += valor; 
   }
   
   
    public void diminuirObjeto(double valor){
      this.lado1 -= valor;
      this.lado2 -= valor; 
   }

   
   
}