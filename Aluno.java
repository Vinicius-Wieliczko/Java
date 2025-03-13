public class Aluno extends Pessoa{
   private String ra;
   private int disciplina;
   private boolean matricula = false;
   
   
   public Aluno(String nome, String telefone, Data nasc, String ra){
       super (nome, telefone, nasc);
       this.ra = ra;
    }
     public Aluno(String nome, Data nasc, String ra){
           super (nome, nasc);
           this.ra = ra;
   }


   
   
    public void setRa(String ra){
      this.ra = ra;
    }
    public String getRa(){
      return this.ra;
    }
    
    
    public void setDisciplina(int disciplina){
      this.disciplina = disciplina;
    }
    public int getDisciplina(){
      return this.disciplina;
    }

    
    
    public void matricular(int disciplina){
      matricula = true;
      this.disciplina = disciplina;
    }
    
    
    public double getCargaSemanal(){
      return disciplina*4;
    }
    

    public String toString(){
       String temp;
         temp = (super.toString()+"\nRA:" +this.ra);
       if(matricula = true)
         temp = temp + "\nAluno esta matriculado!\nDisciplinas: "+disciplina+ "\nCarga horaria semanal: " +getCargaSemanal();
       else temp = temp + "\nAluno nao esta matriculado!";
       return temp;
    }

   
} 