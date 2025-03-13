public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
   private boolean emprestado;
   
   public LivroDeBiblioteca(String nomeDoLivro, String autor, int ano, int avaliacao, boolean emprestado){
      super(nomeDoLivro, autor, ano, avaliacao);
      this.emprestado = emprestado;
   }
      
   public void verificarItem(){
      if (emprestado == true){
         System.out.println("Livro esta emprestado!\n");
      }else {
         System.out.println("Livro nao esta emprestado!\n");
      }
   }
   
   public void setEmprestado(boolean emprestado){
      this.emprestado = emprestado;
   }
   public boolean getEmprestado(){
      return emprestado;
   }
   
   public void emprestar() throws MinhaExcecao{
      if (emprestado == true){
         throw new MinhaExcecao ("Livro ja foi emprestado!\n");
      }
      setEmprestado(true);
   }
   
   public void devolver() throws MinhaExcecao{
      if (emprestado == false){
         throw new MinhaExcecao ("Livro nao foi emprestado ainda!\n");
      }
      setEmprestado(false);
   } 
   
   public String toString(){
      String temp;
      String aux;
      
      if(emprestado){
         aux= "esta emprestado";
      }else{
         aux = "nao esta emprestado";
      }
      temp = super.toString()+ "\nO livro " +aux+ "!\n";
      return temp;
   }
   
   public void informar(){
      System.out.println("O livro e " +super.getNomeDoLivro()+ " da biblioteca!\n");
   }
}