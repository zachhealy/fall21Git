import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public GUI(){
        frame = new JFrame();

        button = new JButton("Click Me");
        button.addActionListener(this);
        
        label = new JLabel("Number of Clicks: 0");
               
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        //Add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        //Set what happens when they close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the title of the window
        frame.setTitle("Our GUI");
        //Set the window to match a certain size
        frame.pack();
        //Set the window to be visible and in focus
        frame.setVisible(true);  
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
