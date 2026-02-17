package java_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class edge {

    public static void main(String[] args) {

    	WebDriver driver = new EdgeDriver();

    	try {
    		driver.manage().window().maximize();
    	    driver.get("https://www.microsoft.com/edge");
    	    
    	    String title =driver.getTitle();
    	    System.out.println("Page Title" + title);
    	
    	    if(title.contains("edge"))
    	    {
    	    	System.out.println("Test Pass");
    	    }
    	    else
    	    {
    	    	System.out.println("Test Fail");
    	    }
    	} catch(Exception e)
    	{
    	System.out.println("Exception occured : " + e.getMessage());
    	}
    	finally
    	{
    		driver.quit();
    	}
    	
    }
}

