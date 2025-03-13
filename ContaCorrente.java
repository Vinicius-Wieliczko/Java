public class ContaCorrente{
   private String nome;
   private int numero;
   private double saldo = 0;
   
   
   public void setNome(String nome) throws MinhaExcecao{
      if (!nome. matches ("[A-Za-z ]*")){
         throw new MinhaExcecao ("Nome com carcter invalido!\n");
      }
      if (nome.isEmpty()){
         throw new MinhaExcecao("Nome vazio!\n");
      }
      if (nome.matches("[ ]*")){
         throw new MinhaExcecao("Nome formado apenas por espacos!\n");
      }
      this.nome = nome;
   }
   public String getNome(){
      return this.nome;
   }
  
  
   public void setNumero(int numero) throws MinhaExcecao{
      if (numero <= 0){
         throw new MinhaExcecao ("Numero invalido, deve ser maior que 0!\n");
         }
      this.numero = numero;
   }
   public int getNumero(){
      return this.numero;
   }

   
   
//    public ContaCorrente(String nome, int numero){
//       this.nome = nome;
//       this.numero = numero;
//    }
   
   public void sacar(int num) throws MinhaExcecao{
      if(num <= 0){
         throw new MinhaExcecao("Valor de saque deve ser positivo\n");
      }
      if(num > saldo){
         throw new MinhaExcecao("Valor nao pode ser maior que o saldo!\n");
      }
      saldo -= num;
   }
   public void depositar(int num) throws MinhaExcecao{
   if(num < 0){
      throw new MinhaExcecao("Valor de deposito deve ser positivo!\n");
   }
      saldo += num;
   }
}