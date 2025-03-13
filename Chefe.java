public class Chefe extends Funcionario{
   private String cargo; 
   
   
   public Chefe(String nome, String telefone, Data nasc, String registro, double salario, String cargo){
       super (nome, telefone, nasc, registro, salario);
       this.cargo = cargo;
    }
     public Chefe(String nome, Data nasc, String registro, double salario, String cargo){
       super (nome, nasc, registro, salario);
       this.cargo = cargo;
    }
    
    public void setCargo(String cargo){
      this.cargo = cargo;
    }
    public String getCargo(){
      return this.cargo;
    }
    
    
    public double bonificar(){
      return getSalario()*0.2;
    }
    
    
    public double getSalarioComBonificacao(){
      return getSalario() + bonificar();
    }



   public String toString(){
       String temp;
       temp = (super.toString()+"\nCargo:" +this.cargo);
       return temp;
    }



}