package ctec.controller;

import java.util.ArrayList;
import ctec.model.CoolThing;
import ctec.model.ChapterBook;
import ctec.model.PictureBook;

public class InheritanceController
{
	public InheritanceController()
	{
		//Build all model components
		makeCoolList();
		//build view
	}
	
	private ArrayList<CoolThing> coolThings;
	
	public String showCoolnessLevels()
	{
		
	}
	
	private void makeCoolList()
	{
		coolThings.add(new ChapterBook());
		coolThings.add(new PictureBook());
	
	}
	
	public void start()
	{
		
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		CoolThing temp = coolThings.get(firstLocation);
		coolThings.set(firstLocation, coolThings.get(secondLocation));
		coolThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < coolThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (coolThings.get(innerLoop-1).compareTo(coolThings.get(innerLoop) > 0)));
			{
				
			}
		}
	}
}
