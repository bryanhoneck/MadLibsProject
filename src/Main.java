import javax.swing.JOptionPane;

public class Main
{
    public static void main (String[] args)
        {
            String welcome = "I hope you're ready to play some Mad Libs!";
            String response[] = {"", "", "", "", ""};

            //The beginning of the questioning - we used JOptionPane in Prof Benavides' class at Collin!
            JOptionPane.showMessageDialog(null, welcome);
            response[0] = JOptionPane.showInputDialog("Answer my questions and I will give you the " +
                    "best day of your life!\nWhat's your favorite type of music?", "Enter response here");
            response[1] = JOptionPane.showInputDialog("What's your favorite sport?", "Enter response here");
            response[2] = JOptionPane.showInputDialog("What's your favorite dessert?", "Enter response here");
            response[3] = JOptionPane.showInputDialog("What is your favorite color?", "Enter response here");
            response[4] = JOptionPane.showInputDialog("What state were you born in?", "Enter response here");
        }//End main method
}//End class Main
