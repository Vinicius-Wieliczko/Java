import javax.swing.JOptionPane;
public abstract class Livro{
   private String nomeDoLivro;
   private String autor;
   private int ano;
   private int avaliacao;
   
   
   public Livro (String nomeDoLivro, String autor, int ano, int avaliacao){
      this.nomeDoLivro = nomeDoLivro;
      this.autor = autor;
      this.ano = ano;
      this.avaliacao = avaliacao;
   }
   
   public void setNomeDoLivro(String nomeDoLivro){
      this.nomeDoLivro = nomeDoLivro;
   }
   public String getNomeDoLivro(){
      return nomeDoLivro;
   }
   
   public void setAutor(String autor){
      this.autor = autor;
   }
   public String getAutor(){
      return autor;
   }
   
   public void setAno(int ano){
      this.ano = ano;
   }
   public int getAno(){
      return ano;
   }
   
   public void setAvaliacao(int avaliacao){
      this.avaliacao = avaliacao;
   }
   public int getAvaliacao(){
      return avaliacao;
   }
   
   int somaNota = 0;
   int qtddAvaliacao = 0;
   public void avaliar()throws MinhaExcecao{
      String valor = JOptionPane.showInputDialog(null, "Insira uma nota (valor inteiro) para o livro " +nomeDoLivro+ ": ");
      if(valor == null){
         return;
      }
      int nota = Integer.parseInt(valor);
      if(nota < 0 || nota > 10){
         throw new MinhaExcecao("A nota deve ser entre 0 e 10");
      }
      qtddAvaliacao += 1;
      somaNota += nota;
      avaliacao = somaNota/qtddAvaliacao;
   }
   
   public String toString(){
      String temp;
      temp = "Titulo: " +nomeDoLivro+ "\nAutor: " +autor+ "\nAno da edicao: " +ano+ "\nAvaliacao: " +avaliacao+ "(" +qtddAvaliacao+ ")";
      return temp;
   }
   
   public abstract void informar();
}