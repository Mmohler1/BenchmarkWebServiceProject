//Michael Mohler 

package controller;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Bible;
import business.BibleBusinessInterface;


@ManagedBean
@ViewScoped
public class formController 
{
	
	//Insert the interface
	@Inject
	BibleBusinessInterface service;


	//Submit by initializing the user in the method 
	public String onVerse(Bible bible)
	{

		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("bible", bible);
		return "VersePage.xhtml";
	}
	
	
	
	
	
	public BibleBusinessInterface getService()
	{
		return service;
	}
	
}
