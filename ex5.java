import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {
        char[] caracteres = new char[10];
        String palavra = "";
        
        for (int i = 0; i < 10; i++) {
            caracteres[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º caractere:").charAt(0);
            palavra += caracteres[i];
        }
        
        JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavra);
    }
}