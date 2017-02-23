import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private Cat cat2;
	private Cat cat3;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		cat2 = new Cat();
		
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 75, 75); // Original cat
		cat2.draw(g, 25, 25); // Better cat
		cat3.draw(g, 100,  100); // best cat
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(500, 500);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
