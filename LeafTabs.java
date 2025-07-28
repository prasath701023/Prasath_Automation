package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTabs {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
