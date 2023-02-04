package com.adacitin.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacitinBaseClass {
	
	public static WebDriver driver;
 public static void browserLaunch( String type) {
	 if (type.equalsIgnoreCase("chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 }
	 else if (type.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();

	}
	 else {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();

	}
	 
	 
 }		
 public static void getUrl( String Url) {
	 driver.get(Url);
  }

		
	public static void getUsername(WebElement element, String value) {
		element.sendKeys(value);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("Shahishahii");
	}	
		
		
		public static void getPassword(WebElement element, String value) {
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("Shahi@123");
			System.out.println("Login Success");

		}
		
		public static void clickLogin() {
			WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
			login.click();

		}
		public static void chooseLocation() {
			WebElement location = driver.findElement(By.name("location"));
			Select s = new Select(location);
			s.selectByIndex(1);

		}
public static void selectHotel() {
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotel);
	s1.selectByValue("Hotel Creek");

}
public static void selectRoomType() {
	WebElement type = driver.findElement(By.name("room_type"));
	Select s2 = new Select(type);
	s2.selectByIndex(2);

}
public static void selectRooms() {
	WebElement no = driver.findElement(By.name("room_nos"));
	Select s3 = new Select(no);
	s3.selectByIndex(2);

}

public static void checkInDate() {
	WebElement checkIn = driver.findElement(By.name("datepick_in"));
	checkIn.sendKeys("04/08/2022");

}
public static void checkOutDate() {
	WebElement checkOut = driver.findElement(By.name("datepick_out"));
	checkOut.sendKeys("05/08/2022");

}
public static void noOfAdults() {
	WebElement room1 = driver.findElement(By.name("adult_room"));
	Select s6 = new Select(room1);
	s6.selectByIndex(2);

}
public static void noOfChildrens() {
	WebElement room2 = driver.findElement(By.name("child_room"));
	Select s7 = new Select(room2);
	s7.selectByIndex(3);

}
public static void clickSearch() throws InterruptedException {
	WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	search.click();
	Thread.sleep(2000);

}
public static void confirmBooking() throws InterruptedException {
	System.out.println(" Select Hotel and Confirm Booking to Continue...");
	Thread.sleep(5000);

	driver.findElement(By.name("continue")).click();

}
public static void chooseHotel() throws InterruptedException {
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	Thread.sleep(4000);

}
 public static void clickContinue() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("continue")).click();


}
 public static void fillDetails() {
 

	driver.findElement(By.name("first_name")).sendKeys("shahi");
	driver.findElement(By.name("last_name")).sendKeys("shahi");
 }
 public static void enterAddress() {
	
			driver.findElement(By.name("address")).sendKeys("Sydney");

}
 public static void cardDetails() {
		driver.findElement(By.name("cc_num")).sendKeys("7894561231236547");

}
 public static void cardType() {
		WebElement card = driver.findElement(By.name("cc_type"));
		Select s8 = new Select(card);
		s8.selectByIndex(2);


}
 public static void cardExpiryDate() {
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s9 = new Select(month);
		s9.selectByIndex(9);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s10 = new Select(year);
		s10.selectByIndex(12);
		driver.findElement(By.name("cc_cvv")).sendKeys("211");

}
 public  static void bookNow() throws InterruptedException {
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		Thread.sleep(40000);
		System.out.println("Hotel Booked....");

}
	
 public static void logout() {
	 
	 WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
 logout.click();
 
}
}


