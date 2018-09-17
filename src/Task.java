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
		
	private JLabel taskDescription;
	private JLabel delete;
	
	public Task (String text) {
		
		setLayout(new FlowLayout());
		
		taskDescription = new JLabel(text);
		add(taskDescription);
		
		//set mouse clicking functionality	
		addMouseListener(new MouseAdapter() {
			
			public void mouseEntered (MouseEvent e) {
				System.out.println(taskDescription.getText());
				//setVisible(false);
			}
			
		});
		
	}
	
}
