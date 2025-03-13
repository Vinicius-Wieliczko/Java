public class Principal{
   public static void main (String args[]){
      Livro[] livros = new Livro[2];
      
      livros[0] = new LivroDeBiblioteca("Harry Potter", "JK. Rowling", 2001, 0, false);
      livros[1] = new LivroDeLivraria("O Senhor dos Aneis", "J. J. R. Tolkien", 1954, 0, 60.0);
      LivroDeLivraria livroLivraria = (LivroDeLivraria)livros[1];
      LivroDeBiblioteca livroBiblioteca = (LivroDeBiblioteca)livros[0];
      boolean aux = true;
      
      do{
         try{
            livros[1].avaliar();
            System.out.println("\nO preco do livro " +livroLivraria.getNomeDoLivro()+ " R$ "  +livroLivraria.getPreco()+ "\n);
            
            livros[0].avaliar();
            livros[0].avaliar();
            
            aux = false;
            
            livroBiblioteca.devolver();
            
         }catch(MinhaExcecao ex){
            System.out.println("Erro: " +ex);
         } 
         catch(java.lang.NumberFormatException ex){
            System.out.println("Erro: Digite um valor valido pra nota!");
         }
      }while(aux);
      
      System.out.println(livros[0].toString()); 
      System.out.println(livros[1].toString());
 
   }
}