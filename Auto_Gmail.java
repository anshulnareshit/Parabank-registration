package anshul;
//Author - Anshul
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Auto_Gmail {
	public static void main(String args[]) {
		System.out.println("Automaion script for gmail");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anshul\\JarFiles\\chromedriver-\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.id("customer.firstName")).sendKeys("Hey");
		driver.findElement(By.id("customer.lastName")).sendKeys("joy");
		driver.findElement(By.id("customer.address.street")).sendKeys("Panvel");
		driver.findElement(By.id("customer.address.city")).sendKeys("MUM");
		driver.findElement(By.id("customer.address.state")).sendKeys("MH");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("4800");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("0123456789");
		driver.findElement(By.id("customer.ssn")).sendKeys("0158");
		driver.findElement(By.id("customer.username")).sendKeys("jay_hey");
		driver.findElement(By.id("customer.password")).sendKeys("0123456789");
		driver.findElement(By.id("repeatedPassword")).sendKeys("0123456789");
		driver.findElement(By.xpath("//tr[13]/td[2]/input")).click();
	}
	

}

