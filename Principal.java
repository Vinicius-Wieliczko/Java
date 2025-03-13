import javax.swing.JOptionPane;

public class Principal{
   public static void main(String args[]){
      do{
         try{
            ContaCorrente conta = new ContaCorrente();
            
            String nome = JOptionPane.showInputDialog(null, "Digite um nome:");
            if (nome == null){
               return;
            }  
            conta.setNome(nome);
            
            String num = JOptionPane.showInputDialog(null, "Digite um numero:");
            if (num == null){
               return;
            }
            int numero = Integer.parseInt(num);
            conta.setNumero(numero);
            
            String valor = JOptionPane.showInputDialog(null, "Digite um numero para deposito:");
            if (valor == null){
               return;
            }
            int deposito = Integer.parseInt(valor);
            conta.depositar(deposito);

            
            
            String valor2 = JOptionPane.showInputDialog(null, "Digite um numero para saque:");
            if (valor2 == null){
               return;
            }
            int saque = Integer.parseInt(valor2);
            conta.sacar(saque);

            
            return;          
         }catch (MinhaExcecao ex){
            System.out.println("Erro: " +ex);
         }
      }
      while (true);
   }
}