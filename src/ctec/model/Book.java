package ctec.model;
/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Mar 28, 2016
 */
public abstract class Book
{
	//Three Data Members
	private String bookName;
	private String characters;
	private int yearWritten;
	
	/**
	 * @return the bookName
	 */
	public String getBookName()
	{
		return bookName;
	}
	
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	/**
	 * @return the yearWritten
	 */
	public int getYearWritten()
	{
		return yearWritten;
	}
	
	/**
	 * @param yearWritten the yearWritten to set
	 */
	public void setYearWritten(int yearWritten)
	{
		this.yearWritten = yearWritten;
	}
	
	/**
	 * @return the characters
	 */
	public String getCharacters()
	{
		return characters;
	}
	
	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(String characters)
	{
		this.characters = characters;
	}
	
	
}
