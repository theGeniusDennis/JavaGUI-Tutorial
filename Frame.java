import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        //JFrame = a GUI  window to add compnents to
        JFrame frame =  new JFrame(); // creates a frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setTitle("A simple Jframe window"); //adds title to the frame
        frame.setResizable(false); //sets whether frame should be resizable
        frame.setSize(450, 450); //sets the x-dimension and the y-dimension
        frame.setVisible(true); // makes frame visible

       
    }
}