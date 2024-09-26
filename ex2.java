import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);
    }
}