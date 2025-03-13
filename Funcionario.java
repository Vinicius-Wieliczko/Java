public class Funcionario extends Pessoa{
   private String registro;
   private double salario;
   
   
   public Funcionario(String nome, String telefone, Data nasc, String registro, double salario){
       super (nome, telefone, nasc);
       this.registro = registro;
       this.salario = salario;
    }
     public Funcionario(String nome, Data nasc, String registro, double salario){
       super (nome, nasc);
       this.registro = registro;
       this.salario = salario;
    }

   
   
    public void setRegistro(String registro){
      this.registro = registro;
    }
    public String getRegistro(){
      return this.registro;
    }
        
    
    public double bonificar(){
      return salario*0.1;
    }
    
    
    public double getSalarioComBonificacao(){
      return salario + bonificar();
    }
    
    
    
     public void setSalario(double salario){
      if (salario > 0)
         this.salario = salario;
         else System.out.println("Salario invalido!");
    }
    public double getSalario(){
      return this.salario;
    }


    

    public String toString(){
       String temp;
       temp = (super.toString()+"\nRegistro:" +this.registro+ "\nSalario: R$" +this.salario+ "\nSalario com bonificacao: R$"+getSalarioComBonificacao());
       return temp;
    }

   
}  