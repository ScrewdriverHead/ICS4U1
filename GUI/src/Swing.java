import javax.swing.JOptionPane;

public class Swing {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello" +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, name);
    }
}
