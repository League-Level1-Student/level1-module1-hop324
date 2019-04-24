package Binary;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BinaryConverter implements ActionListener {
public static void main(String [] args) {
	JFrame yeet = new JFrame();
	 JPanel yote = new JPanel();
	 JButton press = new JButton();
	 JTextField text = new JTextField(20);
	yeet.setVisible(true);
	yeet.setTitle("Convert Bits of Binary to ASC||");
	yeet.add(yote);
	yeet.add(text);
	yeet.add(press);
	//press.addActionListener(this);
	}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
