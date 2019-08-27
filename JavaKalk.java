import javax.swing.JOptionPane;

public class JavaKalk {
   public static void main(String[] args) {
      
      String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
      String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
      //transfomando os Strings em Double
      double a = Double.parseDouble(numA);
      double b = Double.parseDouble(numB);
      //calculando
      double soma = a + b;
      double sub = a - b;
      double mult = a * b;
      double div = a / b;
      //mostrando o resultado das quatro operações básicas
      JOptionPane.showMessageDialog(null,
            "Soma: " + soma + "\n" +
            "Subtração: " + sub + "\n" +
            "Multiplicação: " + mult + "\n" +
            "Divisão: " + div
      );
   }
}
