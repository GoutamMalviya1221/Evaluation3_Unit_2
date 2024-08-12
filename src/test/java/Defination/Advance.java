package Defination;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Advance {
	
	WebDriver driver;
	
	
	@Given("open browser and enter url , Click on the Advance near Search")
	public void open_browser_and_enter_url_click_on_the_advance_near_search() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.linkText("Advanced")).click();

		
	}

	@When("enter keyword or item number , select keyword option , enter Exclude words , select the category")
	public void enter_keyword_or_item_number_select_keyword_option_enter_exclude_words_select_the_category() {
		
		driver.findElement(By.xpath("//*[@id='_nkw']")).sendKeys("shoes adidas");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='s0-1-17-4[0]-7[1]-_in_kw']"));
		Select se = new Select(dropdown);
		se.selectByVisibleText("Exact words, exact order");
		driver.findElement(By.xpath("//*[@id='_ex_kw']")).sendKeys("adidas , S,L,M");
		WebElement dropdown2 = driver.findElement(By.id("s0-1-17-4[0]-7[3]-_sacat"));
		Select se2 = new Select(dropdown2);
		se2.selectByVisibleText("Collectibles");

	
	}

	@When("click on the using advanced search option link")
	public void click_on_the_using_advanced_search_option_link() {

		
	}

	@When("then enter the details provided in the images")
	public void then_enter_the_details_provided_in_the_images() {
		
		driver.findElement(By.xpath("(//*[@class='checkbox__control'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='radio__control'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='radio__control'])[6]")).click();
		driver.findElement(By.xpath("(//*[@class='checkbox__control'])[8]")).click();
		
		WebElement dropdown3 = driver.findElement(By.cssSelector("[name='_sop']"));
		Select se3 = new Select(dropdown3);
		se3.selectByVisibleText("Price + Shipping: lowest first");
		
		WebElement dropdown4 = driver.findElement(By.cssSelector("[name='_dmd']"));
		Select se4= new Select(dropdown4);
		se4.selectByVisibleText("Gallery view");
		
		driver.findElement(By.xpath("(//*[@class='btn btn--primary'])[2]")).click();
		

		
	}

	@Then("Assert the No Exact matches found")
	public void assert_the_no_exact_matches_found() {
		
		WebElement element = driver.findElement(By.cssSelector("[class='srp-save-null-search__heading']"));
		
		String expectedText = "No exact matches found";
		String actualText = element.getText(); 
		
		Assert.assertEquals(actualText, expectedText );

		
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();

		
	}

}
