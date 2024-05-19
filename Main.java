import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Main {

    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other components
        ImageIcon image = new ImageIcon("C:\\Users\\RINGROW\\Desktop\\JavaTutorials\\JavaGUI-Tutorial\\dude.jpg");
       //Resizing the image
       Image originalImage = image.getImage();
       Image scaledImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
       ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

       //JLabel set-up
       JLabel label = new JLabel();
       label.setText("Heyy, dude!!");
       label.setIcon(scaledImageIcon);

       //JPanel setup
       JPanel redPanel = new JPanel();
       redPanel.setBackground(Color.RED);
       redPanel.setBounds(0,0,250,250);

       JPanel bluePanel = new JPanel();
       bluePanel.setBackground(Color.blue);
       bluePanel.setBounds(250,0,250,250);

       JPanel greenPanel = new JPanel();
       greenPanel.setBackground(Color.green);
       greenPanel.setBounds(0,250,500,250);


       //JFrame setup
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 750);
       frame.setVisible(true);
       frame.add(bluePanel);
       frame.add(redPanel);
       frame.add(greenPanel);


        
       



    }
}
