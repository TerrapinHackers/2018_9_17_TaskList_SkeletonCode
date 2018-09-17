import java.awt.Dimension;

import javax.swing.JFrame;

public class TaskFrame extends JFrame {
	
	private final double heightRatio = .05;
	private final double widthRatio = .75;
	
	public TaskFrame (int width, int height, String name) {
		super(name);
		setSize(new Dimension(width, height));
		setVisible(true);
	}
	
	public void addTask (Task toAdd) {
		
		//add the task to the frame
		getContentPane().add(toAdd);
		
		//make the task visible
		toAdd.setVisible(true);
		
		//set the size of the task
		toAdd.setMaximumSize(new Dimension((int)(getWidth()*widthRatio), (int)(getHeight()*heightRatio)));
		
		//tell the frame to redraw
		repaint();
		revalidate();
		
	}
	
}
