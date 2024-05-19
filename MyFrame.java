import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        //creating a button
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("you good??");
        button.setFocusable(false);

        //image icon
        ImageIcon icon1 = new ImageIcon("pic1.jpg");
        ImageIcon icon2 = new ImageIcon("pic2.jpg");

        //creating label
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);



        //constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(true);
          System.out.println("Fuck me!!");
          //  button.setEnabled(false);

        }
    }
}
