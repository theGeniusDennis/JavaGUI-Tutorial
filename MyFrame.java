import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        //JFrame = a GUI  window to add compnents to
        JFrame frame =  new JFrame(); // creates a frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setTitle("A simple Jframe window"); //adds title to the frame
        this.setResizable(false); //sets whether frame should be resizable
        this.setSize(450, 450); //sets the x-dimension and the y-dimension
        this.setVisible(true); // makes frame visible



        ImageIcon image =  new ImageIcon("icon.jpg");
        this.setIconImage(image.getImage()); //changes the logo of the JFrame
        this.getContentPane().setBackground(new Color(243, 53, 78)); // changes the background colour

    }
}
