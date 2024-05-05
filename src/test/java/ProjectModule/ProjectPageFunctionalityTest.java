package ProjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class ProjectPageFunctionalityTest {

	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	//To verify the functionality of Images Title,Eye Icon,Expand Button,Next/Previous Button,Play/Pause Button on the Project Page 
	@BeforeTest
	void Open_Website() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://rajtensilestructure.com/");
		Thread.sleep(2000);
	}

	//To verify the functionality of the Project Module
	@Test(priority=1)
	void Project_Section() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();
	}
	//To verify the functionality of the Home Icon on the Project Page
	@Test(priority=2)
	void Home_Icon_Functionality() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	}

	//ANIMAL HUSBANDRY DEPARTMENT RANCHI JHARKHAND	
	//To verify the functionality of Image Title
	@Test(priority=3)
	void Project_Image_Title() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();

		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));

		act.moveToElement(image).perform();

		WebElement imageTitle = driver.findElement(By.xpath("//div[contains(text(),'Animal Husbandry Department Ranchi Jharkhand')]"));
		imageTitle.click();

	}
	//To verify the functionality of Portfolio Button on the ANIMAL HUSBANDRY DEPARTMENT RANCHI JHARKHAND Project Details Page
	@Test(priority=4)
	void Portfolio_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-th']")).click();
	}

	//To verify the functionality of Contact Us Option on the ANIMAL HUSBANDRY DEPARTMENT RANCHI JHARKHAND Portfolio Page
	@Test(priority=5)
	void ContactUs_Option() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
	}

	//To verify the functionality of Back Arrow Button on the ANIMAL HUSBANDRY DEPARTMENT RANCHI JHARKHAND Project Details Page
	@Test(priority=6)
	void Back_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[normalize-space()='']//i[@class='fa fa-angle-left']")).click();
	}
	//To verify the functionality of Image Eye Button
	@Test(priority=7)
	void Project_Image_Eye_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();

		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));

		act.moveToElement(image).perform();

		WebElement imageEyeIcon = driver.findElement(By.xpath("//a[@href='https://rajtensilestructure.com/portfolio/animal-husbandry/']//i[@class='fa fa-eye']"));
		imageEyeIcon.click();

		Thread.sleep(5000);
		driver.navigate().back();

	}
	//To verify the functionality of Image Expand Button
	@Test(priority=8)
	void Project_Image_Expand_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));

		act.moveToElement(image).perform();

		WebElement imageExpandButton = driver.findElement(By.xpath("//a[@title='Animal Husbandry Department Ranchi Jharkhand']//i[@class='fa fa-arrows-alt']"));
		imageExpandButton.click();

	}

	//To verify the functionality of Image Full screenExpand Button
	@Test(priority=9)
	void project_Image_FullScreen_Expand_Button() throws InterruptedException {
		Thread.sleep(5000);

		//		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));
		//
		//		act.moveToElement(image).perform();

		WebElement fullScreenExpandButton = driver.findElement(By.xpath("//a[@title='Expand the image']"));
		fullScreenExpandButton.click();
	}

	//To verify the functionality of Image Shrink Button
	@Test(priority=10)
	void project_Image_Shrink_Button() {
		WebElement shrinkImageButton = driver.findElement(By.xpath("//a[@title='Expand the image']"));
		shrinkImageButton.click();
	}
	//To verify the functionality of Image Next Button
	@Test(priority=11)
	void Project_Image_Next_Button() throws InterruptedException {
		Thread.sleep(5000);

		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));

		act.moveToElement(image).perform();


		WebElement nextButton = driver.findElement(By.xpath("//a[@class='pp_next']"));
		nextButton.click();
	}
	//To verify the functionality of Image Previous Button
	@Test(priority=12)
	void Project_Image_Previous_Button() throws InterruptedException {
		Thread.sleep(5000);;

		WebElement image = driver.findElement(By.xpath("//img[@alt='Animal Husbandry Department Ranchi Jharkhand']"));

		act.moveToElement(image).perform();


		WebElement previousButton = driver.findElement(By.xpath("//a[@class='pp_previous']"));
		previousButton.click();
	}
	//To verify the functionality of Image Play Button
	@Test(priority=13)
	void Project_Image_Play_Button() throws InterruptedException {
		Thread.sleep(10000);
		WebElement playButton = driver.findElement(By.xpath("//a[@class='pp_play']"));
		playButton.click();
	}
	//To verify the functionality of Image Pause Button
	@Test(priority=14)
	void Project_Image_Pause_Play_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pausePlaylayButton = driver.findElement(By.xpath("//a[@class='pp_pause']"));
		pausePlaylayButton.click();
	}
	//To verify the functionality of Image Next Arrow Button
	@Test(priority=15)
	void Project_Image_Next_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement nextArrow = driver.findElement(By.xpath("//div[@class='pp_nav']//a[@class='pp_arrow_next'][normalize-space()='Next']"));
		nextArrow.click();
	}
	//To verify the functionality of Image Previous Arrow Button
	@Test(priority=16)
	void Project_Image_Previous_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PreviousArrow = driver.findElement(By.xpath("//div[@class='pp_nav']//a[@class='pp_arrow_previous'][normalize-space()='Previous']"));
		PreviousArrow.click();
	}

	//To verify the functionality of Image Close Button
	@Test(priority=17)
	void Project_Image_Close_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement imageCloseButton = driver.findElement(By.xpath("//a[@class='pp_close']"));
		imageCloseButton.click();
	}

	//GULMOHAR GARDEN BHOPAL MADHYA PRADESH
	@Test(priority=18)
	void Project_Image_Title2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageTitle = driver.findElement(By.xpath("//div[contains(text(),'Gulmohar garden Bhopal Madhya Pradesh')]"));
		imageTitle.click();

	}

	//To verify the functionality of Portfolio Button on the GULMOHAR GARDEN BHOPAL MADHYA PRADESH Project Details Page
	@Test(priority=19)
	void Portfolio_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-th']")).click();
	}

	//To verify the functionality of Contact Us Option on the GULMOHAR GARDEN BHOPAL MADHYA PRADESH Portfolio Page
	@Test(priority=20)
	void ContactUs_Option2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
	}

	//To verify the functionality of Next Arrow Button on the GULMOHAR GARDEN BHOPAL MADHYA PRADESH Project Details Page
	@Test(priority=21)
	void Next_Arrow_Button() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();

		driver.findElement(By.xpath("//div[@class='nav-next']")).click();
	}

	//To verify the functionality of Back Arrow Button on the GULMOHAR GARDEN BHOPAL MADHYA PRADESH Project Details Page
	@Test(priority=22)
	void Back_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[normalize-space()='']//i[@class='fa fa-angle-left']")).click();
	}

	@Test(priority=23)
	void Project_Image_Eye_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();

		WebElement image = driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageEyeIcon = driver.findElement(By.xpath("//a[@href='https://rajtensilestructure.com/portfolio/gulmohar-garden-bhopal-madhya-pradesh/']//i[@class='fa fa-eye']"));
		imageEyeIcon.click();

		Thread.sleep(2000);
		driver.navigate().back();

	}

	@Test(priority=24)
	void Project_Image_Expand_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageExpandButton = driver.findElement(By.xpath("//a[@title='Gulmohar garden Bhopal Madhya Pradesh']//i[@class='fa fa-arrows-alt']"));
		imageExpandButton.click();

	}

	//To verify the functionality of Image Full screenExpand Button
	@Test(priority=25)
	void project_Image_FullScreen_Expand_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement fullScreenExpandButton = driver.findElement(By.xpath("//a[@title='Expand the image']"));
		fullScreenExpandButton.click();
	}
	//To verify the functionality of Image Shrink Button
	@Test(priority=26)
	void project_Image_Shrink_Button2() {
		WebElement shrinkImageButton = driver.findElement(By.xpath("//a[@title='Expand the image']"));
		shrinkImageButton.click();
	}

	//To verify the functionality of Image Next Button
	@Test(priority=27)
	void Project_Image_Next_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));

		act.moveToElement(image).perform();

		WebElement nextButton = driver.findElement(By.xpath("//a[@class='pp_next']"));
		nextButton.click();
	}
	//To verify the functionality of Image Previous Button
	@Test(priority=28)
	void Project_Image_Previous_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Gulmohar garden Bhopal Madhya Pradesh']"));

		act.moveToElement(image).perform();

		WebElement previousButton = driver.findElement(By.xpath("//a[@class='pp_previous']"));
		previousButton.click();
	}
	//To verify the functionality of Image Play Button
	@Test(priority=29)
	void Project_Image_Play_Button2() throws InterruptedException {
		Thread.sleep(10000);
		WebElement playButton = driver.findElement(By.xpath("//a[@class='pp_play']"));
		playButton.click();
	}
	//To verify the functionality of Image Pause Button
	@Test(priority=30)
	void Project_Image_Pause_Play_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pausePlaylayButton = driver.findElement(By.xpath("//a[@class='pp_pause']"));
		pausePlaylayButton.click();
	}
	//To verify the functionality of Image Next Arrow Button
	@Test(priority=31)
	void Project_Image_Next_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement nextArrow = driver.findElement(By.xpath("//div[@class='pp_nav']//a[@class='pp_arrow_next'][normalize-space()='Next']"));
		nextArrow.click();
	}
	//To verify the functionality of Image Previous Arrow Button
	@Test(priority=32)
	void Project_Image_Previous_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PreviousArrow = driver.findElement(By.xpath("//div[@class='pp_nav']//a[@class='pp_arrow_previous'][normalize-space()='Previous']"));
		PreviousArrow.click();
	}

	//To verify the functionality of Image Close Button
	@Test(priority=33)
	void Project_Image_Close_Button2() throws InterruptedException {
		Thread.sleep(5000);
		WebElement imageCloseButton = driver.findElement(By.xpath("//a[@class='pp_close']"));
		imageCloseButton.click();
	}

	//VAIBHAV PALACE BANKHEDI MANDYA PRADESH
	@Test(priority=34)
	void Project_Image_Title3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageTitle = driver.findElement(By.xpath("//div[contains(text(),'Vaibhav palace Bankhedi Mandya pradesh')]"));
		imageTitle.click();


	}

	//To verify the functionality of Portfolio Button on the VAIBHAV PALACE BANKHEDI MANDYA PRADESH Project Details Page
	@Test(priority=35)
	void Portfolio_Button3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-th']")).click();
	}

	//To verify the functionality of Contact Us Option on the VAIBHAV PALACE BANKHEDI MANDYA PRADESH Portfolio Page
	@Test(priority=36)
	void ContactUs_Option3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97619be elementor-widget__width-auto elementor-widget elementor-widget-button']//a[@class='elementor-button elementor-button-link elementor-size-sm']")).click();
	}

	//To verify the functionality of Next Arrow Button on the VAIBHAV PALACE BANKHEDI MANDYA PRADESH Project Details Page
	@Test(priority=37)
	void Next_Arrow_Button2() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[normalize-space()='']//i[@class='fa fa-angle-right']")).click();
	}
	@Test(priority=38)
	void Project_Image_Eye_Button3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item'][normalize-space()='Projects']")).click();

		WebElement image = driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageEyeIcon = driver.findElement(By.xpath("//a[@href='https://rajtensilestructure.com/portfolio/vaibhav-palace-bankhedi-mandya-pradesh/']//i[@class='fa fa-eye']"));
		imageEyeIcon.click();

		Thread.sleep(2000);
		driver.navigate().back();

	}
	@Test(priority=39)
	void Project_Image_Expand_Button3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));

		act.moveToElement(image).perform();

		WebElement imageExpandButton = driver.findElement(By.xpath("//a[@title='Vaibhav palace Bankhedi Mandya pradesh']//i[@class='fa fa-arrows-alt']"));
		imageExpandButton.click();

	}
	//To verify the functionality of Image Next Button
	@Test(priority=40)
	void Project_Image_Next_Button3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));

		act.moveToElement(image).perform();

		WebElement nextButton = driver.findElement(By.xpath("//a[@class='pp_next']"));
		nextButton.click();
	}
	//To verify the functionality of Image Previous Button
	@Test(priority=41)
	void Project_Image_Previous_Button3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='Vaibhav palace Bankhedi Mandya pradesh']"));

		act.moveToElement(image).perform();

		WebElement previousButton = driver.findElement(By.xpath("//a[@class='pp_previous']"));
		previousButton.click();
	}
	//To verify the functionality of Image Play Button
	@Test(priority=42)
	void Project_Image_Play_Button3() throws InterruptedException {
		WebElement image = driver.findElement(By.xpath("//li[normalize-space()='']//a[@href='#']"));

		act.moveToElement(image).perform();

		Thread.sleep(10000);
		WebElement playButton = driver.findElement(By.xpath("//li[normalize-space()='']//a[@href='#']"));
		playButton.click();
	}

	//To verify the functionality of Image Close Button
	@Test(priority=43)
	void Project_Image_Close_Button3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement imageCloseButton = driver.findElement(By.xpath("//a[@class='pp_close']"));
		imageCloseButton.click();
	}


	@AfterTest
	void tesrDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
