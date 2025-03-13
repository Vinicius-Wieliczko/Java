public class ControleSalario{
   private double somaSalarioBase = 0;
   private double somaSalarioBonificado = 0;
   int i;
   
   public double somaSalarioBase(double salarioBase[]){
      for(i=0; i<3; i++){
         somaSalarioBase += salarioBase[i];
      }
      return somaSalarioBase;
   }
   
   public double somaSalarioBonificado(double salarioComBonificacao[]){
      for(i=0; i<3; i++){
          somaSalarioBonificado += salarioComBonificacao[i];
      }
      return somaSalarioBonificado;
   }
    
   public String toString(){
      String temp;
      temp = ("\nSoma dos salarios basicos: R$" +this.somaSalarioBase+ "\nSoma dos salarios com bonificacao: R$" +this.somaSalarioBonificado);
      return temp;
   }   
      
}