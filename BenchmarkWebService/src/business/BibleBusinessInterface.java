package business;


import javax.ejb.Local;


//Imported beans
import beans.Bible;

@Local
public interface BibleBusinessInterface {

	public void test();
	public String getVerse(Bible bible);
	public int findBook(Bible bible);
	
}
