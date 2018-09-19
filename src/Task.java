import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task extends JPanel {
	
	//text to be displayed in this jpanel
	private JLabel taskDescription;

	public Task (String text) {
		
		setLayout(new FlowLayout());
		
		//add the text to the jpanel
		taskDescription = new JLabel(text);
		add(taskDescription);
		
		//set some mouse functionality	
		addMouseListener(new MouseAdapter() {
			
			//fires when the mouse enters the jpanels "universe"
			public void mouseEntered (MouseEvent e) {
				System.out.println(taskDescription.getText());
			}
			
			//fires when a left click in input in the jpanels "universe"
			public void mouseClicked (MouseEvent e) {
				//makes the task disappear when clicked on
				setVisible(false);
			}
			
		});
		
	}
	
}
