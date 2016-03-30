package ctec.model;

public class ChapterBook extends Book
{
	private String bookName;
	private String mainCharacter;
	private int yearWritten;
	
	public ChapterBook()
	{
		this.setBookName("The Hunger Games");
		this.setMainCharacter("Katniss");
		this.setYearWritten(2008);
	}
}
