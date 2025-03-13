public class Pessoa {
    private String nome;
    private String telefone = "";
    private Data nasc;
    
    public Pessoa(String nome, String telefone, Data nasc){
       this.nome = nome;
       this.telefone = telefone;
       this.nasc = nasc;
    }
    
    public Pessoa(String nome, Data nasc){
       this.nome = nome;
       this.nasc = nasc;
    }
    
    
    public void setNome(String nome){
      this.nome = nome;
    }
    public String getNome(){
      return this.nome;
    }
    
    
    
    public void setTelefone(String telefone){
      this.telefone = telefone;
    }
    public String getTelefone(){
      return this.telefone;
    }
    
    
    public void setNasc(Data nasc){
      this.nasc = nasc;
    }
    public Data getNasc(){
      return this.nasc;
    }
   
   
   public String toString(){
      String temp;
      temp = ("\nNome: " +this.nome+ "\nTelefone: " +this.telefone+ "\nNascimento: " +this.nasc);
      return temp;
   }
   
  }