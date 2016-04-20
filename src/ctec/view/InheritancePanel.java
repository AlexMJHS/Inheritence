package ctec.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ctec.controller.InheritanceController;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	
	public 
	
	private void setListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				textArea.setText(baseController.showCoolnessLevels());

			}
		});
	}
}
