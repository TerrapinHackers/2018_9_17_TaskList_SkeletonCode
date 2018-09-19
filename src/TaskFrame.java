import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class TaskFrame extends JFrame {
	
	//constants to control the bounds of tasks that are added
	private final double heightRatio = .05;
	private final double widthRatio = .75;
	
	public TaskFrame (int width, int height, String name) {
		super(name);
		
		//sets the layout of the frame to layout the components vertically
		getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		
		//make the frame visible
		setSize(new Dimension(width, height));
		setVisible(true);
		
	}
	
	public void addTask (Task toAdd) {
		
		//add the task to the frame
		getContentPane().add(toAdd);
		
		//make the task visible
		toAdd.setVisible(true);
		
		//set the size of the task
		//this will prevent the "universe" of the jpanel from being too large
		toAdd.setMaximumSize(new Dimension((int)(getWidth()*widthRatio), (int)(getHeight()*heightRatio)));
		toAdd.setSize(new Dimension((int)(getWidth()*widthRatio), (int)(getHeight()*heightRatio)));
		
		//tell the frame to redraw the display
		repaint();
		revalidate();
		
	}
	
}
