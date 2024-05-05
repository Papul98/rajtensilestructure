package ServicesModuleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServicesOptionTest {
	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	
	@BeforeTest
	void Open_Website() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://rajtensilestructure.com/");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	void Services_Option() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();

	}
	//To verify the CAR PARKING TENSILE STRUCTURE option functionality
	@Test(priority=2)
	void Car_Parking_tensile_Structure() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'car-parking-tensile-structure')]")).click();
	}
	@Test(priority=3)
	void Home_Icon_Functionality() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=4)
	void Expand_Image() throws InterruptedException {
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@title='car-parking-tensile-sheds-1000x1000']")).click();

	}
	//To verify the Left Arrow Button on the Image of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=5)
	void Left_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='car-parking-tensile-sheds-1000x1000']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the Right Arrow Button on the Image of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=6)
	void Right_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='car-parking-tensile-sheds-1000x1000']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the close Button on the Image of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=7)
	void Close_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=8)
	void Next_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	//To verify the Previous Button of the CAR PARKING TENSILE STRUCTURE page
	@Test(priority=9)
	void Previous_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-prev']")).click();
	}
	@Test(priority=10)
	void Contact_Us() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}


	//To verify the WALKWAY TENSILE STRUCTURE option functionality
	@Test(priority=11)
	void WALKWAY_TENSILE_STRUCTURE() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//ul[@id='sm-17148546738576743-2']//a[@class='elementor-sub-item'][normalize-space()='Walkway Tensile Structure']")).click();
	}
	@Test(priority=12)
	void Home_Icon_Functionality2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=13)
	void Expand_Image2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@title='s2']")).click();

	}
	//To verify the Left Arrow Button on the Image of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=14)
	void Left_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the Right Arrow Button on the Image of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=15)
	void Right_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the close Button on the Image of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=16)
	void Close_Button1() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=17)
	void Next_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	//To verify the Previous Button of the WALKWAY TENSILE STRUCTURE page
	@Test(priority=18)
	void Previous_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-left']")).click();
	}
	@Test(priority=19)
	void Contact_Us2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}


	//To verify the AUDITORIUM TENSILE STRUCTURE option functionality
	@Test(priority=20)
	void AUDITORIUM_TENSILE_STRUCTURE() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//ul[@id='sm-17148558220899368-2']//a[@class='elementor-sub-item'][normalize-space()='Auditorium Tensile Structure']")).click();
	}
	@Test(priority=21)
	void Home_Icon_Functionality3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=22)
	void Expand_Image3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@title='Auditorium Tensile Structure']")).click();

	}
	//To verify the Left Arrow Button on the Image of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=23)
	void Left_Arrow_Button4() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the Right Arrow Button on the Image of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=24)
	void Right_Arrow_Button3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the close Button on the Image of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=25)
	void Close_Button3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=26)
	void Next_Button3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-next']")).click();
	}
	//To verify the Previous Button of the AUDITORIUM TENSILE STRUCTURE page
	@Test(priority=27)
	void Previous_Button3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-left']")).click();
	}
	@Test(priority=28)
	void Contact_Us3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}


	//To verify the GAZEBO TENSILE STRUCTURE option functionality
	@Test(priority=29)
	void GAZEBO_TENSILE_STRUCTURE() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//ul[@id='sm-1714856346496649-2']//a[@class='elementor-sub-item'][normalize-space()='Gazebo Tensile Structure']")).click();
	}
	@Test(priority=30)
	void Home_Icon_Functionality4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=31)
	void Expand_Image4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@title='s2']")).click();

	}
	//To verify the Left Arrow Button on the Image of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=32)
	void Left_Arrow_Button5() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

	}
	//To verify the Right Arrow Button on the Image of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=33)
	void Right_Arrow_Button4() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}
	//To verify the close Button on the Image of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=34)
	void Close_Button4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=35)
	void Next_Button4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	//To verify the Previous Button of the GAZEBO TENSILE STRUCTURE page
	@Test(priority=36)
	void Previous_Button4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-left']")).click();
	}
	@Test(priority=37)
	void Contact_Us4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	//To verify the SWIMMING POOL TENSILE COVERING option functionality
	@Test(priority=38)
	void SWIMMING_POOL_TENSILE_COVERING() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//ul[@id='sm-17148572933592178-2']//a[@class='elementor-sub-item elementor-item-active'][normalize-space()='Swimming Pool Tensile Covering']")).click();
	}
	@Test(priority=39)
	void Home_Icon_Functionality5() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=40)
	void Expand_Image5() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@fetchpriority='high']")).click();

	}
	//To verify the Left Arrow Button on the Image of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=41)
	void Left_Arrow_Button6() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

	}
	//To verify the Right Arrow Button on the Image of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=42)
	void Right_Arrow_Button5() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}
	//To verify the close Button on the Image of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=43)
	void Close_Button6() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=44)
	void Next_Button5() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	//To verify the Previous Button of the SWIMMING POOL TENSILE COVERING page
	@Test(priority=45)
	void Previous_Button5() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-left']")).click();
	}
	@Test(priority=46)
	void Contact_Us5() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	//STADIUM TENSILE STRUCTURE

	//To verify the STADIUM TENSILE STRUCTURE option functionality
	@Test(priority=47)
	void STADIUM_TENSILE_STRUCTURE() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//ul[@id='sm-17148572933592178-2']//a[@class='elementor-sub-item'][normalize-space()='Stadium Tensile Structure']")).click();
	}
	@Test(priority=48)
	void Home_Icon_Functionality6() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the Image of the STADIUM TENSILE STRUCTURE page
	@Test(priority=49)
	void Expand_Image6() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
		driver.findElement(By.xpath("//img[@title='car-parking-tensile-sheds-1000x1000']")).click();

	}
	//To verify the Left Arrow Button on the Image of the STADIUM TENSILE STRUCTURE page
	@Test(priority=50)
	void Left_Arrow_Button7() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@title='car-parking-tensile-sheds-1000x1000']")).click();

	}
	//To verify the Right Arrow Button on the Image of the STADIUM TENSILE STRUCTURE page
	@Test(priority=51)
	void Right_Arrow_Button6() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@title='s2']"));

		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//img[@class='lb-image']")).click();

	}
	//To verify the close Button on the Image of the STADIUM TENSILE STRUCTURE page
	@Test(priority=52)
	void Close_Button7() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='lb-close']")).click();

	}
	//To verify the Next Button of the STADIUM TENSILE STRUCTURE page
	@Test(priority=53)
	void Next_Button6() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	//To verify the Previous Button of the STADIUM TENSILE STRUCTURE page
	@Test(priority=54)
	void Previous_Button6() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-prev']")).click();
	}
	@Test(priority=55)
	void Contact_Use() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@AfterTest
	void tesrDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}	
}
