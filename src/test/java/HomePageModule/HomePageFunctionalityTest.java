package HomePageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageFunctionalityTest {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		@BeforeTest
		void Open_Website() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			driver.manage().window().maximize();
			driver.get("https://rajtensilestructure.com/");
			Thread.sleep(2000);
		}

		//To verify the Home page Logo
		@Test(priority=1)
		void Homepage_Logo() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a")).click();
		}
		//To verify the Right Arrow Button Functionality
		@Test(priority=2)
		void Right_Arrow_Button() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//rs-arrow[@class='tp-rightarrow tparrows zeus rs-touchhover']")).click();
		}
		//To verify the Left Arrow Button Functionality
		@Test(priority=3)
		void Left_Arrow_Button() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus rs-touchhover']")).click();

		}
		//To verify the Banner Section Contact Us Button Functionality
		@Test(priority=3)
		void Contact_Us_Bouuton() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[@data-stylerecorder='true'][normalize-space()='Contact Us']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		//To verify the Banner Section Discover more Button Functionality
		@Test(priority=4)
		void Discover_More_Button() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@id='slider-1-slide-1-layer-0']")).click();
			driver.navigate().back();
		}
		//To verify the scroll up functionality on the Homepage
		@Test(priority=5)
		void scrollDown() throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}


		//To verify the Scroll down Functionality on the HomePage
		@Test(priority=6)
		void scrollUp() throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, 0)");
		}

		//To verify That the About Option is functionable
		@Test(priority=7)
		void About_Option() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='About Us']")).click();
		}
		//To verify That the ProjectOption is functionable
		@Test(priority=8)
		void Project_Option() throws InterruptedException {
			Thread.sleep(5000);

			driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();
		}
		//To verify That the Services Option is functionable
		@Test(priority=9)
		void Services_Option() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();

		}
		//To verify That the Contact Us Option is functionable
		@Test(priority=10)
		void Contact_Us_Option() throws InterruptedException {
			Thread.sleep(5000);

			driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Contact Us']")).click();
		}
		//To verify That the Search Icon is functionable
		@Test(priority=11)
		void Search_Icon() throws InterruptedException {
			Thread.sleep(5000);

			//driver.findElement(By.xpath("//div[@id='elementor-popup-modal-3281']")).click();

			driver.findElement(By.id("searchButton")).click();
		}
		//To verify That the Get In Touch Option is functionable
		@Test(priority=12)
		void GET_In_Touch_Option() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//span[@class='elementor-button-text'][normalize-space()='Get in touch']")).click();
		}
		@AfterTest
		void tesrDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
	}


