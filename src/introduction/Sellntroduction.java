package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellntroduction {
	public static void main(String[] args)
	{
		// Invoking the browser
		// Chrome -- ChromeDriver -> Methods close get 
		// Firefox -- FirefoxDriver -> Methods close get (same methods for firefox browser as well)
		// just we will need to create object of firefox class and replace
		// Safari -- SafariDriver -> Methods close get
		// So basically all this classes are following 1 interface called "WebDriver"
//		ChromeDriver driver = new ChromeDriver();
		
		// Interview Question: We want to just use the WebDriver methods only but not ChromeDriver
		// methods, how we can do this ?
		// Ans => WebDriver driver = new ChromeDriver();
		// 
		
		// Interview Question: There are 2 ways of declaring ChromeDriver objects,
		// 1) ChromeDriver driver = new ChromeDriver(); &
		// 2) WebDriver driver = new ChromeDriver(); 
		// Both works,Which one you want to use?
		// Ans => If we want to just use WebDriver methods then 2nd one & if we also want to use
		// methods from chromedriver then 1st one.
		
		// Steps to invoke chrome driver
		// Selenium manager
//		WebDriver driver = new ChromeDriver();
		
		// Without selenium manager 
//		System.setProperty("webdriver.chrome.driver", "C:/Users/patil/Documents/chromedriver-win64/chromedriver.exe");
		//====================================================================================
		//#### WebDriver methods ###
		
		WebDriver driver = new ChromeDriver();
		
		//method to load a new webpage
		driver.get("https://rahulshettyacademy.com"); 
		
		// method to get title of the page
		System.out.println(driver.getTitle());
		
		//To Validate whether you are landing on correct page or not (hacker redirects the page so)
		System.out.println(driver.getCurrentUrl());
		
		//To close the browser
//		driver.close();
		// Another method to close the browser is quit
		driver.quit();
		// Interview question: What is difference between close() and quit()
		// In close()=> Closes the current window/tab only.
		// only original window will be closed and in process of automation if any other window got
		// opened it will be there as it is. If you are sure that your script opens only 1 window use close().
		// In quit() => All the associated windows opened by automation will be closed.
		// So if your script having something that opens the multiple windows then we have to use quit().
		
		//######## How to run same script in Firefox Browser ####
		// Firefox launch
		// Firefox team came with geckodriver (similar to chromdriver)
		// webdriver.geck.driver  
		System.setProperty("webdriver.gecko.driver", "C:/Users/patil/Documents/geckodriver-v0.35.0-win64/geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://rahulshettyacademy.com"); 
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.quit();		
		
		//==================================================================================================
		//######## How to run same script in Microsoft Edge Browser ####
		System.setProperty("webdriver.edge.driver", "C:/Users/patil/Documents/edgedriver_win64/msedgedriver.exe");
		WebDriver driver3 = new FirefoxDriver();
		
		driver3.get("https://rahulshettyacademy.com"); 
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.quit();	
		
		// So to run the tests on different browsers is known as "Cross Browser Testing"
		
		//===================================================================================================
	
	}
}
