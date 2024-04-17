import javax.swing.JOptionPane;

public class TrueFalse {
    public static void main(String[] args) throws Exception {
        int tf = 1;
        while (tf == 1){

                tf = JOptionPane.showConfirmDialog(null, "Is the sky blue?", "A Question", JOptionPane.YES_NO_OPTION);
                
                if (tf == 1) {
                        JOptionPane.showMessageDialog(null,"Sorry, wrong answer. Try again.", "Wrong", JOptionPane.INFORMATION_MESSAGE);
                    }

                else if (tf == 0) {
                JOptionPane.showMessageDialog(null, "Correct answer. Good job!", "Correct", JOptionPane.INFORMATION_MESSAGE);

                    }
            }
        }
    }



