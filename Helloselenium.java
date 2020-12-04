import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloselenium {

	public static void main(String[] args) {
		//open the browser
		System.setProperty("webdriver.chrome.driver","chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Entering the URL
		driver.get("https://prefeitura.pbh.gov.br/saude/licitacao/pregao-eletronico-151-2020");
		driver.manage().window().maximize();
		
		//Checking if getting the URL
		System.out.println(driver.getTitle());
		
		//checking for Publication date mentioned in the page 
		String a = driver.findElement(By.cssSelector("span[class='col-sm-6 lbl-licitacao']")).getText();
		System.out.println("Result:"+a);
		
		//checking for Bidding date mentioned in the page
		String c = driver.findElement(By.cssSelector("span[class='col-sm-6 lbl-licitacao']")).getText();
		System.out.println("Result of BIDDING DATE is same as PUBLICATION DATE:"+c);
		
		//checking for Objectives mention in the page
		String b = driver.findElement(By.cssSelector("span[class='lbl-licitacao']")).getText();
		System.out.println("Result:"+b+"Price Registration for a period of 12 months, for the purchase of galvanized clamps.");
		
		//checking for all the links mentioned in the page
		String d = driver.findElement(By.cssSelector("div.main-menu")).getText();
		System.out.println("Result of the links of tender:"+d);
		
		//closing the URL
		driver.close();
		
		
	}

}
