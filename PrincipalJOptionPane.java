import javax.swing.JOptionPane;

public class Principal{
   public static void main(String args[]){
      int opcao = JOptionPane.showConfirmDialog(null, "Voce deseja multiplicar um numero por 2?");
      if (opcao != 0){
         return;
      }
      String numero = JOptionPane.showInputDialog(null, "Qual numero deseja multiplicar por 2?");
      if (numero == null){
         return;
      }
      int num = Integer.parseInt(numero);
      JOptionPane.showMessageDialog(null, "O dobro do numero digitado e :" +num*2);
   }
}
  
    