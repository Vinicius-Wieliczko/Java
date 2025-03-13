   public class Professor extends Funcionario{
   private int horasAula;
   
      public Professor(String nome, String telefone, Data nasc, String registro, double salario, int horasAula){
       super (nome, telefone, nasc, registro, salario);
       this.horasAula = horasAula;
    }
     public Professor(String nome, Data nasc, String registro, double salario, int horasAula){
       super (nome, nasc, registro, salario);
       this.horasAula = horasAula;
    }
    
    
    public void setHorasAula(int horasAula){
      this.horasAula = horasAula;
    }
    public int getHorasAula(){
      return this.horasAula;
    }

    
    
    
    public double bonificar(){
      return 10*horasAula;
    }
    public double getSalarioComBonificacao(){
      return getSalario() + bonificar();
    }
    
    
    
     public String toString(){
       String temp;
       temp = (super.toString()+"\nHoras aula: "+horasAula);
       return temp;
    }


}
