package ctec.model;

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

}
