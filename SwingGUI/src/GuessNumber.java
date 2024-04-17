import javax.swing.JOptionPane;

public class GuessNumber {
    public static void main(String[] args) throws Exception {
        int num = 37;
        int loop = 1;

        JOptionPane.showMessageDialog(null, "I am thinking of a number between 1 and 100, guess what it is.");

        while(loop == 1){
            int guess  = Integer.parseInt(JOptionPane.showInputDialog(""));
            
            if(guess>num){
                JOptionPane.showMessageDialog(null, "That number is too high.");
            }

            else if(guess<num){
                JOptionPane.showMessageDialog(null, "That number is too low.");
            }

            else if(guess == num){
                JOptionPane.showMessageDialog(null, "Congratulations, correct number.");
                loop = 0;
            }
        }
        }
        
    }