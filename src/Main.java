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

            JOptionPane.showMessageDialog(null, "The best day of your life will take place on a nice " +
                    "sunny day \nin " + response[4] + ", where you will be watching the best " + response[1] + " game \n" +
                    "on TV. You will be sitting in your comfy " + response[3] + " chair with a lifetime\n supply of " +
                    response[2] + " . After the game, you'll ask people what kind of music \nthey want to listen to " +
                    "while they finish their food, and they'll all shout " + response[0] + "!");
        }//End main method
}//End class Main
