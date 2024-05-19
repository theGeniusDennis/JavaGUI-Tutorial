import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Main {

    public static void main(String[] args) {
        // JLabel = a GUI for a string of text, an image, or both
        ImageIcon image = new ImageIcon("C:\\Users\\RINGROW\\Desktop\\JavaTutorials\\JavaGUI-Tutorial\\dude.jpg");
        //creating a border object
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 5);


        //Resizing the image
        Image originalImage = image.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel(); // creates a label
        label.setText("Heyy bro!");
        label.setIcon(scaledImageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x891154));// sets font color of text
        label.setFont(new Font("Mv Boli", Font.PLAIN, 20)); // Ensure the font is available
        label.setIconTextGap(-25); //set the gap btn text and image
        label.setBackground(Color.CYAN); //set background color
        label.setOpaque(true); // display bckground color
        label.setBorder(border); //sets the border of the frame
        label.setVerticalAlignment(JLabel.CENTER); // sets the vertical position of icon and  text
        label.setHorizontalAlignment(JLabel.CENTER); // sets the horizontal position of icon and  text
        label.setBounds(0, 0, 250, 250);
        
         

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(label); // Add the label before making the frame visible
        frame.setVisible(true);
        frame.setLayout(null);
      frame.pack();
    }
}
