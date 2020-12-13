package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.ejb.Stateless;




@Stateless
public class BibleDataService implements DataAccessInterface {

	String url = "jdbc:postgresql://localhost:5432/postgres";
	String username = "postgres";
	String password = "chair";  //CHANGE TO YOUR PASSWORD!
	
	
	//Returns string of verse if something is there
	@Override
	public String getVerse(int bookNum, int chapNum, int verseNum) {
		// TODO Auto-generated method stub
		//Info for database
				Connection conn = null;
				
				
				String sql = "SELECT t FROM bench.t_kjv " 
						+ "WHERE b = " + bookNum
						+ "AND c = " + chapNum
						+ "AND v = " + verseNum;
				
				
				String verseText = "No verse found. Please Check Spelling and Numbers";
				try
				{
					//Connecting to database
					conn = DriverManager.getConnection(url, username, password);
					
					//Execute SQL Query and loop
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					
					while(rs.next())
					{
						verseText = rs.getString("t");
					}
					
					conn.close();
					
					return verseText;
				}
				catch (SQLException e)
				{
					
					e.printStackTrace();
					return null;
					
				}
				finally
				{
					//Database cleaning
					if(conn != null)
					{
						try
						{
							conn.close();
						}
						catch (SQLException e)
						{
							e.printStackTrace();
						}
					}
					
				}
				
			
	}


}
