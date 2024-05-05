package AboutUsModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUsPageTest {
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
	void About_Option() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='About Us']")).click();
	}
	//To verify the functionality of the Home Icon on the About Us Page
	@Test(priority=2)
	void Home_Icon_Functionality() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}
	//To verify the WHY CHOOSE US section
	@Test(priority=3)
	void Best_Materials() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='About Us']")).click();
		driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid bg-gray']//li[2]//a[1]")).click();

	}
	@Test(priority=4)
	void Years_Of_Experience() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='vc_tta-tab']//span[@class='vc_tta-title-text'][normalize-space()='YEARS OF EXPERIENCE']")).click();

	}
	@Test(priority=5)
	void Professional_Standard() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='vc_tta-tab']//span[@class='vc_tta-title-text'][normalize-space()='PROFESSIONAL STANDARDS']")).click();
	}
	//To verify the Best Features section
	@Test(priority=6)
	void Construction() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Construction']")).click();
	}
	@Test(priority=7)
	void Best_possible_Equipment() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='1444103874575-08062cb4-6f8d']//a")).click();
	}
	@Test(priority=8)
	void Experienced_Teams() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='1444103873449-3ab62325-480d']//a")).click();
	}
	//To Verify the Our Team Section
	@Test(priority=9)
	void Our_Team() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Deepak_Sharma = driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]"));

		act.moveToElement(Deepak_Sharma ).perform();
	}
	//To Verify the Our Team Section Socal Media Icon
	@Test(priority=10)
	void Facebook_Icon() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]")).click();
	}
	@Test(priority=11)
	void Twitter_Icon() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]")).click();

	}
	@Test(priority=12)
	void Linkedin() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]")).click();

	}
	@Test(priority=13)
	void Gmail() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[4]//a[1]//i[1]")).click();

	}


	@Test(priority=14)
	void Our_Team2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Akshay = driver.findElement(By.xpath("//div[@class='owl-wrapper-outer']//div[2]//div[1]//div[1]"));

		act.moveToElement(Akshay ).perform();
	}
	//To Verify the Our Team Section Socal Media Icon
	@Test(priority=15)
	void Facebook_Icon1() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]")).click();
	}
	@Test(priority=16)
	void Twitter_Icon1() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]")).click();

	}
	@Test(priority=17)
	void Linkedin_Icon1() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]")).click();

	}
	@Test(priority=18)
	void Gmail_Icon1() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[4]//a[1]//i[1]")).click();

	}
	@Test(priority=19)
	void Our_Team3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Vinay = driver.findElement(By.xpath("//div[@class='container']//div[3]//div[1]//div[1]//ul[1]"));

		act.moveToElement(Vinay ).perform();
	}
	//To Verify the Our Team Section Socal Media Icon
	@Test(priority=20)
	void Facebook_Icon2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]")).click();
	}
	@Test(priority=21)
	void Twitter_Icon2() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]")).click();

	}
	@Test(priority=22)
	void Linkedin_Icon2() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]")).click();

	}
	@Test(priority=23)
	void Gmail_Icon2() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[4]//a[1]//i[1]")).click();

	}
	@Test(priority=24)
	void Our_Team4() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Abhishek = driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid margin-bottom-100']//div[4]//div[1]//div[1]"));

		act.moveToElement(Abhishek ).perform();
	}
	//To Verify the Our Team Section Socal Media Icon
	@Test(priority=25)
	void Facebook_Icon3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]")).click();
	}
	@Test(priority=26)
	void Twitter_Icon3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]")).click();

	}
	@Test(priority=27)
	void Linkedin_Icon3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]")).click();

	}
	@Test(priority=28)
	void Gmail_Icon3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//ul[1]//li[4]//a[1]//i[1]")).click();

	}
	@Test(priority=29)
	void Contact_Us() throws InterruptedException {
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
