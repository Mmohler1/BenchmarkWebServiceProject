package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class Bible {

	/**
	 * 
	 */

	//Initialized variables
	
	@NotNull(message = "Book Can't be Empty")
	@Size(min=1)
	String book = "Genesis";
	
	@NotNull(message = "Chapter Can't be Empty")
	int chap = 1;
	
	@NotNull(message = "Verse Can't be Empty")
	int verse = 1;
	
	
	//Constructor
	public Bible(String book, int chap, int verse) 
	{
		this.book = book;
		this.chap = chap;
		this.verse = verse;
		
	}
	
	
	//Default Constructor
	public Bible() 
	{
		book = "Genesis";
		chap = 1;
		verse = 1;
		
	}


	//Get and Set Methods
	public String getBook() {
		return book;
	}


	public void setBook(String book) {
		this.book = book;
	}


	public int getChap() {
		return chap;
	}


	public void setChap(int chap) {
		this.chap = chap;
	}


	public int getVerse() {
		return verse;
	}


	public void setVerse(int verse) {
		this.verse = verse;
	}
	

	
	
	
}
