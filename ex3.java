import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
        
        JOptionPane.showMessageDialog(null, "Data: " + dia + "/" + mes + "/" + ano);
    }
}