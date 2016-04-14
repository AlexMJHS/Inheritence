package ctec.model;

/**
 * Implement the CoolThing and Comparable interfaces.
 * @author Alejandro Magallanes
 * @version 0.1 Mar 28, 2016
 */
public abstract class Book implements CoolThing, Comparable
{
	//Three Data Members
	private String bookName;
	private String mainCharacter;
	private int yearWritten;

	public String getBookName()
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public int getYearWritten()
	{
		return yearWritten;
	}

	public void setYearWritten(int yearWritten)
	{
		this.yearWritten = yearWritten;
	}
	
	public String getMainCharacter()
	{
		return mainCharacter;
	}

	public void setMainCharacter(String mainCharacter)
	{
		this.mainCharacter = mainCharacter;
	}

	public String toString()
	{
		String description = "This is a " + this.getClass() + " and has a meme of " + relatedMeme();
		
		return description;
	}
	/**
	 * If the supplied variable compared comes before the calling variable
	 * return 1.
	 * If the supplied variable is after the calling variable return -1.
	 * Else if they are the same, return 0.
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof CoolThing)
		{
			if(this.coolnessLevel() > ((CoolThing) compared).coolnessLevel())
			{
				comparedValue = 1;
			}
			else if(this.coolnessLevel() < ((CoolThing) compared).coolnessLevel())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
	
}
