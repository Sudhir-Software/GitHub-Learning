package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ClientInterface extends JFrame implements ActionListener
{	
	JRadioButton on, off;
	JButton button;
	ButtonGroup group;
	
	public ClientInterface()
	{
		super("NorthQ Interface");
		setVisible(true);
		setSize(650,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());

		//Creating the RadioButtons
		on = new JRadioButton("ON");
		off = new JRadioButton("OFF");
		button = new JButton("Click");
		
		//Adding the RadioButtons into jFrame.
		add(on);
		add(off);
		add(button);
		
		//on.setHorizontalAlignment(AbstractButton.CENTER);
		//off.setHorizontalAlignment(AbstractButton.CENTER);
		
		
		//Grouping
		group = new ButtonGroup();
		group.add(on);
		group.add(off);
		
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent a)
	{ 

		if (on.isSelected()) 
		{
			JOptionPane.showMessageDialog(this, "You are selected ON button");	
		}
		if (off.isSelected())
		{
			JOptionPane.showMessageDialog(this, "You are selected OFF button");
			
		}
	}
	
	public static void main(String[] args) {
		ClientInterface ci = new ClientInterface();

	}
}


