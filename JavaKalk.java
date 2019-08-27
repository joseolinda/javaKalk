import javax.swing.JOptionPane;

public class JavaKalk {
   public static void main(String[] args) {
      
      String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
      String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
      //transfomando os Strings em Integer
      int a = Integer.parseInt(numA);
      int b = Integer.parseInt(numB);
	   double x = a;
	   double y = b;
      //calculando
      int soma = (int) (x + y);
      int sub = a - b;
      int mult = a * b;
      double div = x / y;
      //mostrando o resultado das quatro operações básicas
      JOptionPane.showMessageDialog(null,
            "Soma: " + soma + "\n" +
            "Subtração: " + sub + "\n" +
            "Multiplicação: " + mult + "\n" +
            "Divisão: " + div
      );
   }
}
