public class LivroDeLivraria extends Livro{
   private double preco;
   
   public LivroDeLivraria(String nomeDoLivro, String autor, int ano, int avaliacao, double preco){
      super(nomeDoLivro, autor, ano, avaliacao);
      this.preco = preco;
   }
   
   public void setPreco (double preco)throws MinhaExcecao{
      if(preco < 0){
         throw new MinhaExcecao("O valor do preco deve ser positivo!\n");
      }
      this.preco = preco;
   }
   public double getPreco(){
      return preco;
   }
   
   public String toString(){
      String temp;
      temp = super.toString()+ "\nO preco e: R$ " +preco+ "\n";
      return temp;
   }
   
   public void informar(){
      System.out.println("O livro e " +super.getNomeDoLivro()+ " da livraria!\n");
   }
}