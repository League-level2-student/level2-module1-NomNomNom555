package intro_to_array_lists;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton newName;
	JButton viewNames;
	ArrayList<String> names= new ArrayList<String>();
	
	public void createUI() {
	frame= new JFrame("Guest Book");
	panel= new JPanel();
	newName= new JButton("Add Name");
	viewNames=new JButton("View Names");
		
	frame.add(panel);
	panel.add(newName);
	panel.add(viewNames);
	newName.addActionListener(this);
	viewNames.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	}
	
	
	public static void main(String[] args) {
	
		
		new GuestBook().createUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==newName) {
			String name =JOptionPane.showInputDialog("Add a name to the Guest Book");
			names.add("Guest #"+ (names.size()+1)+ ":" + name);
		}
		
		
		if(e.getSource()==viewNames) {
			for(String s: names) {
				
			}
		}
	}
	
	
	
}
