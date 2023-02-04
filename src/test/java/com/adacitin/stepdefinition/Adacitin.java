package com.adacitin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adacitin.baseclass.AdacitinBaseClass;
import com.adacitin.runner.RunnerClass;

import cucumber.api.java.en.*;

public class Adacitin {
	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Adacitin Application$")
	public void user_Launch_The_Adacitin_Application() throws Throwable {
//browserLaunch();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		System.out.println("Browser Launched");

	}

	@When("^user Enter The Username$")
	public void user_Enter_The_Username() throws Throwable {
//username();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shahishahii");

	}

	@When("^user Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
//getPassword();
		driver.findElement(By.name("password")).sendKeys("Shahi@123");
		System.out.println("Login Success");

	}

	@Then("^user Click Login Button Its Navigate To Login Page$")
	public void user_Click_Login_Button_Its_Navigate_To_Login_Page() throws Throwable {
//clickLogin();
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

	}

	@Given("^User Have To Fill The Given Field And Search The Hotel$")
	public void user_Have_To_Fill_The_Given_Field_And_Search_The_Hotel() throws Throwable {
		System.out.println("Fill the details in Registeration form:");

	}

	@When("^user Choose The Location$")
	public void user_Choose_The_Location() throws Throwable {
//chooseLocation();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByIndex(1);

	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
//selectHotel();	
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");

	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
//selectRoomType();
		WebElement type = driver.findElement(By.name("room_type"));
		Select s2 = new Select(type);
		s2.selectByIndex(2);

	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
//selectRooms();
		WebElement no = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(no);
		s3.selectByIndex(2);

	}

	@When("^choose CheckIn Date$")
	public void choose_CheckIn_Date() throws Throwable {
//checkInDate();
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		checkIn.sendKeys("04/08/2022");

	}

	@When("^choose CheckOut Date$")
	public void choose_CheckOut_Date() throws Throwable {
//checkOutDate();
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		checkOut.sendKeys("05/08/2022");

	}

	@When("^select No Of Adults$")
	public void select_No_Of_Adults() throws Throwable {
//noOfAdults();
		WebElement room1 = driver.findElement(By.name("adult_room"));
		Select s6 = new Select(room1);
		s6.selectByIndex(2);

	}

	@When("^select No of Childrens$")
	public void select_No_of_Childrens() throws Throwable {
//noOfChildrens();
		WebElement room2 = driver.findElement(By.name("child_room"));
		Select s7 = new Select(room2);
		s7.selectByIndex(3);

	}

	@Then("^user Click Search Button$")
	public void user_Click_Search_Button() throws Throwable {
//clickSearch();
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		Thread.sleep(2000);

	}

	@Given("^Select The Search Hotel And Confirm To Continue$")
	public void select_The_Search_Hotel_And_Confirm_To_Continue() throws Throwable {
//confirmBooking(); 
		System.out.println(" Select Hotel and Confirm Booking to Continue...");
		Thread.sleep(5000);

		driver.findElement(By.name("continue")).click();

	}

	@When("^User Click the Select Button$")
	public void user_Click_the_Select_Button() throws Throwable {
//chooseHotel();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(4000);

	}

	@Then("^Click Continue Button$")
	public void click_Continue_Button() throws Throwable {
//click_Continue_Button();
		Thread.sleep(5000);
		driver.findElement(By.name("continue")).click();

	}

	@Given("^user Enter The First_Name And Last_Name$")
	public void user_Enter_The_First_Name_And_Last_Name() throws Throwable {
//fillDetails();
		driver.findElement(By.name("first_name")).sendKeys("shahi");
		driver.findElement(By.name("last_name")).sendKeys("shahi");

	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		// enterAddress();
		driver.findElement(By.name("address")).sendKeys("Sydney");

	}

	@When("^user Enter The Credit Card_Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		// cardDetails();
		driver.findElement(By.name("cc_num")).sendKeys("7894561231236547");

	}

	@When("^user Enter Credit Card_Type$")
	public void user_Enter_Credit_Card_Type() throws Throwable {
//cardType();
		WebElement card = driver.findElement(By.name("cc_type"));
		Select s8 = new Select(card);
		s8.selectByIndex(2);

	}

	@When("^user Enter Card Expiry Date$")
	public void user_Enter_Card_Expiry_Date() throws Throwable {
//cardExpiryDate();
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s9 = new Select(month);
		s9.selectByIndex(9);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s10 = new Select(year);
		s10.selectByIndex(12);
		driver.findElement(By.name("cc_cvv")).sendKeys("211");

	}

	@Then("^click Book Now Button$")
	public void click_Book_Now_Button() throws Throwable {
//bookNow();
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		Thread.sleep(40000);
		System.out.println("Hotel Booked....");

	}

	@Then("^User Click Logout Button$")
	public void user_Click_Logout_Button() throws Throwable {
//logout();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		System.out.println("Logout Succes");

	}

}
