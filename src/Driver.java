import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Driver {
	
	public static void main (String [] args) {
		
		//create the object that will container all of the UI
		TaskFrame container = new TaskFrame (1000,1000,"Task");
		container.getContentPane().setLayout(new BoxLayout(container.getContentPane(),BoxLayout.Y_AXIS));
		
		//add a couple tasks to play around with
		container.addTask(new Task("test1"));
		container.addTask(new Task("super duper test"));
		container.addTask(new Task("test121332"));
		container.addTask(new Task("super duper test132"));
		
	}
	
}
