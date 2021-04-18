package javatemplatemethod;

import java.awt.Graphics;
import java.util.Properties;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,300);
		//this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String message = "I rule!!";
		graphics.drawString(message, 100, 100);
	}
	
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.setProperty("javax.accessibility.assistive_technologies", "");
		
		MyFrame myFrame = new MyFrame("Template Design Pattern in JFrame");
		myFrame.setVisible(true);
	}

}
