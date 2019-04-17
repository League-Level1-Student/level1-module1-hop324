package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String [] args) {
	String flavored = JOptionPane.showInputDialog("What flavor?");
	String time = JOptionPane.showInputDialog("How long?");
	//String kernelCount = JOptionPane.showInputDialog("How many kernels?");
	int timer = Integer.parseInt(time);
	Popcorn A = new Popcorn(flavored);
	Microwave M = new Microwave();
	M.putInMicrowave(A);
	M.setTime(timer);
	M.startMicrowave();
	A.applyHeat();
	A.eat();
}

}
