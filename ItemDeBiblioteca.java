public interface ItemDeBiblioteca{
   
   public void emprestar() throws MinhaExcecao;
   public void devolver() throws MinhaExcecao;
   public void verificarItem();
   
}