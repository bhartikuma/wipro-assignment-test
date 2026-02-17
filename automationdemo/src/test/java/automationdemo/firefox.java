package automationdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firefox {

    public static void main(String[] args) {

    	WebDriver driver = new FirefoxDriver();

    	try {
    		driver.manage().window().maximize();
    	    driver.get("https://www.mozilla.org");
    	    
    	    String title =driver.getTitle();
    	    System.out.println("Page Title" + title);
    	
    	    if(title.contains("firefox"))
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



