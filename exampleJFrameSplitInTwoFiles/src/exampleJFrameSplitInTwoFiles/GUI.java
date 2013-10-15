package exampleJFrameSplitInTwoFiles;

import javax.swing.JFrame;

public class GUI extends JFrame {

	public void windows() {
		JFrame frame = new JFrame ("The hangMan Game!");
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
