public class Data{
   private int dia;
   private int mes;
   private int ano;
   
   

   public Data(int dia, int mes, int ano){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
   

   public Data(int dia, int mes){
      this.dia = dia;
      this.mes = mes;
      this.ano = 2024;
   }
   

   
   public void setDia (int dia){
      if (dia > 0 && dia < 32)
         this.dia = dia;
      else System.out.println("Dia inv�lido!");
   }
   
   public int getDia(){
      return this.dia;
   }
   
   
   public void setMes (int mes){
      if (mes > 0 && mes < 13)
         this.mes = mes;
      else System.out.println("Mes inv�lido!");
   }
   
   public int getMes(){
      return this.mes;
   }
   
   
   public void setAno (int ano){
      if (ano >= 1950)
         this.ano = ano;
      else System.out.println("Ano inv�lido!");
   }
   
   public int getAno(){
      return this.ano;
   }
   
 

   public String toString(){
      String temp;
      temp = this.dia + "/" + this.mes + "/" + this.ano;
      return temp;

   }
}