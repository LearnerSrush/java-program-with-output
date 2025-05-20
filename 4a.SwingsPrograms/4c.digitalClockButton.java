//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).

package Swings;

	import javax.swing.*;

	import java.awt.*;

	import java.awt.event.*;



	public class ImageButtonDemo extends JFrame implements ActionListener {



	    JButton digitalClockButton, hourGlassButton;

	    JLabel messageLabel;



	    public ImageButtonDemo() {

	        setTitle("Image Button Demo");

	        setSize(400, 250);

	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        setLayout(new FlowLayout());



	        // Replace with actual paths to your image files

	        ImageIcon digitalClockIcon = new ImageIcon("images/time.png");

	        ImageIcon hourGlassIcon = new ImageIcon("images/hour_glass.png");



	        digitalClockButton = new JButton(digitalClockIcon);

	        hourGlassButton = new JButton(hourGlassIcon);



	        digitalClockButton.addActionListener(this);

	        hourGlassButton.addActionListener(this);



	        messageLabel = new JLabel("Click a button");



	        add(digitalClockButton);

	        add(hourGlassButton);

	        add(messageLabel);



	        setVisible(true);

	    }



	    public void actionPerformed(ActionEvent e) {

	        if (e.getSource() == digitalClockButton) {

	            messageLabel.setText("Digital Clock is pressed");

	        } else if (e.getSource() == hourGlassButton) {

	            messageLabel.setText("Hour Glass is pressed");

	        }

	    }



	    public static void main(String[] args) {

	        new ImageButtonDemo();

	    }

	}
