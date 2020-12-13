package client;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

@ManagedBean
@ViewScoped


//A Client for my own API assignment, just to test how well it works. 
public class clientStuff {

	//Repeats data to the string to show the output is the same as the input
	public void test(String book, int chap, int verse)
	{
		System.out.println(book + " " + chap + " " + verse);
	}
	
	//Uses a client to pull the verse and return it as a string. 
	public String clientGetRequest(String book, int chap, int verse)
	{
		
		
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://localhost:8080/BenchmarkWebService/rest/verse/getjson/"
				+ book + "/"
				+ chap + "/"
				+ verse);
		Response response = target.request().get();
		
		
		String verseGet = response.readEntity(String.class);
		
		
		response.close();
		
		return verseGet;
	}
	
}
