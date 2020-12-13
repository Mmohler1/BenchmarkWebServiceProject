package business;




import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.faces.bean.ViewScoped;


//Imported beans
import beans.Bible;
import data.DataAccessInterface;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(BibleBusinessInterface.class)
@LocalBean
@Alternative
@ViewScoped
public class BibleBusinessService implements BibleBusinessInterface {

	//Array list for orders

	
	@EJB
	DataAccessInterface service;
	
    /**
     * Default constructor. 
     */
    public BibleBusinessService() {
        // TODO Auto-generated constructor stub

    }
    
    
    
    
    public String getVerse(Bible bible) {
    	
    	int bookNum = findBook(bible);
    	int chapNum = bible.getChap();
    	int verseNum = bible.getVerse();
    	
    	return service.getVerse(bookNum, chapNum, verseNum);

    }
    
    //Tells the console that the program is running
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("Bible Business Is working!");
    }
    
    
    //Converts Book name into it's number for database
    public int findBook(Bible bible)
    {
    	int bookNum = 1;
    	String book = bible.getBook();
    	
    	if (book.equalsIgnoreCase("Genesis"))
    		bookNum = 1;
    	else if (book.equalsIgnoreCase("Exodus"))
    		bookNum = 2;
    	else if (book.equalsIgnoreCase("Leviticus"))
    		bookNum = 3;
    	else if (book.equalsIgnoreCase("Numbers"))
    		bookNum = 4;
    	else if (book.equalsIgnoreCase("Deuteronomy"))
    		bookNum = 5;
    	else if (book.equalsIgnoreCase("Joshua"))
    		bookNum = 6;
    	else if (book.equalsIgnoreCase("Judges"))
    		bookNum = 7;
    	else if (book.equalsIgnoreCase("Ruth"))
    		bookNum = 8;
    	else if (book.equalsIgnoreCase("1 Samuel"))
    		bookNum = 9;
    	else if (book.equalsIgnoreCase("2 Samuel"))
    		bookNum = 10;
    	else if (book.equalsIgnoreCase("1 King"))
    		bookNum = 11;
    	else if (book.equalsIgnoreCase("2 King"))
    		bookNum = 12;
    	else if (book.equalsIgnoreCase("1 Chronicles"))
    		bookNum = 13;
    	else if (book.equalsIgnoreCase("2 Chronicles"))
    		bookNum = 14;
    	else if (book.equalsIgnoreCase("Ezra"))
    		bookNum = 15;
    	else if (book.equalsIgnoreCase("Nehemiah"))
    		bookNum = 16;
    	else if (book.equalsIgnoreCase("Esther"))
    		bookNum = 17;
    	else if (book.equalsIgnoreCase("Job"))
    		bookNum = 18;
    	else if (book.equalsIgnoreCase("Psalm"))
    		bookNum = 19;
    	else if (book.equalsIgnoreCase("Proverbs"))
    		bookNum = 20;
    	else if (book.equalsIgnoreCase("Ecclesiastes"))
    		bookNum = 21;
    	else if (book.equalsIgnoreCase("Song of Solomon"))
    		bookNum = 22;
    	else if (book.equalsIgnoreCase("Isaiah"))
    		bookNum = 23;
    	else if (book.equalsIgnoreCase("Jeremiah"))
    		bookNum = 24;
    	else if (book.equalsIgnoreCase("Lamentations"))
    		bookNum = 25;
    	else if (book.equalsIgnoreCase("Ezekiel"))
    		bookNum = 26;
    	else if (book.equalsIgnoreCase("Daniel"))
    		bookNum = 27;
    	else if (book.equalsIgnoreCase("Hosea"))
    		bookNum = 28;
    	else if (book.equalsIgnoreCase("Joel"))
    		bookNum = 29;
    	else if (book.equalsIgnoreCase("Amos"))
    		bookNum = 30;
    	else if (book.equalsIgnoreCase("Obadiah"))
    		bookNum = 31;
    	else if (book.equalsIgnoreCase("Jonah"))
    		bookNum = 32;
    	else if (book.equalsIgnoreCase("Micah"))
    		bookNum = 33;
    	else if (book.equalsIgnoreCase("Nahum"))
    		bookNum = 34;
    	else if (book.equalsIgnoreCase("Habakkuk"))
    		bookNum = 35;
    	else if (book.equalsIgnoreCase("Zephaniah"))
    		bookNum = 36;
    	else if (book.equalsIgnoreCase("Haggai"))
    		bookNum = 37;
    	else if (book.equalsIgnoreCase("Zechariah"))
    		bookNum = 38;
    	else if (book.equalsIgnoreCase("Malachi"))
    		bookNum = 39;
    	else if (book.equalsIgnoreCase("Matthew"))
    		bookNum = 40;	
    	else if (book.equalsIgnoreCase("Mark"))
    		bookNum = 41;
    	else if (book.equalsIgnoreCase("Luke"))
    		bookNum = 42;
    	else if (book.equalsIgnoreCase("John"))
    		bookNum = 43;
    	else if (book.equalsIgnoreCase("Acts"))
    		bookNum = 44;
    	else if (book.equalsIgnoreCase("Romans"))
    		bookNum = 45;
    	else if (book.equalsIgnoreCase("1 Corinthians"))
    		bookNum = 46;
    	else if (book.equalsIgnoreCase("2 Corinthians"))
    		bookNum = 47;
    	else if (book.equalsIgnoreCase("Galatians"))
    		bookNum = 48;
    	else if (book.equalsIgnoreCase("Ephesians"))
    		bookNum = 49;
    	else if (book.equalsIgnoreCase("Philippians"))
    		bookNum = 50;
    	
    	else if (book.equalsIgnoreCase("Colossians"))
    		bookNum = 51;
    	else if (book.equalsIgnoreCase("1 Thessalonians"))
    		bookNum = 52;
    	else if (book.equalsIgnoreCase("2 Thessalonians"))
    		bookNum = 53;
    	else if (book.equalsIgnoreCase("1 Timothy"))
    		bookNum = 54;
    	else if (book.equalsIgnoreCase("2 Timothy"))
    		bookNum = 55;
    	else if (book.equalsIgnoreCase("Titus"))
    		bookNum = 56;
    	else if (book.equalsIgnoreCase("Philemon"))
    		bookNum = 57;
    	else if (book.equalsIgnoreCase("Hebrews"))
    		bookNum = 58;
    	else if (book.equalsIgnoreCase("James"))
    		bookNum = 59;
    	else if (book.equalsIgnoreCase("1 Peter"))
    		bookNum = 60;	
    	else if (book.equalsIgnoreCase("2 Peter"))
    		bookNum = 61;
    	else if (book.equalsIgnoreCase("1 John"))
    		bookNum = 62;
    	else if (book.equalsIgnoreCase("2 John"))
    		bookNum = 63;
    	else if (book.equalsIgnoreCase("3 John"))
    		bookNum = 64;
    	else if (book.equalsIgnoreCase("Jude"))
    		bookNum = 65;
    	else if (book.equalsIgnoreCase("Revelation"))
    		bookNum = 66;
    	else
    		bookNum = 0;
    	
    	return bookNum;
    }
  
}
