import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
        String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
        
        String resultado = palavra3 + " " + palavra2 + " " + palavra1;
        JOptionPane.showMessageDialog(null, "Palavras na ordem contrária: " + resultado);
    }
}