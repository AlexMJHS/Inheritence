package ctec.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * 
 * @author Alejandro Magallanes
 *
 */
public class PictureBook extends Book
{
	private String bookName;
	private String mainCharacter;
	private int yearWritten;
	
	public PictureBook()
	{
		this.setBookName("The Ugly Duckling");
		this.setMainCharacter("Duckling");
		this.setYearWritten(1843);
	}

	public double coolnessLevel()
	{
		
		return 7;
	}

	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "This is cool!");
		}
		
	}

	public int cost()
	{
		
		return 5;
	}

	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "I'm Ethan Bradberry!");
		}
		
	}

}
