package syntax.class02Selenium;

import com.sun.jdi.ByteType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        WebElement userfirstname =driver.findElement(By.id("customer.firstName"));
        userfirstname.sendKeys("Tester");

        WebElement userlastname=driver.findElement(By.id("customer.lastName"));
        userlastname.sendKeys("Test");

        WebElement useraddress=driver.findElement(By.id("customer.address.street"));
        useraddress.sendKeys("123kdhsgdg");

        WebElement usercity=driver.findElement(By.id("customer.address.city"));
        usercity.sendKeys("hdgshskl");

        WebElement userstate=driver.findElement(By.id("customer.address.state"));
        userstate.sendKeys("nvhfhg");

        WebElement userzipcode=driver.findElement(By.id("customer.address.zipCode"));
        userzipcode.sendKeys("jfhg");

        WebElement userphonenumber=driver.findElement(By.id("customer.phoneNumber"));
        userphonenumber.sendKeys("hdsjhfjhfjhf");

        WebElement userssn=driver.findElement(By.id("customer.ssn"));
        userssn.sendKeys("fghjklnjkm");

        WebElement username=driver.findElement(By.id("customer.username"));
        username.sendKeys("TestTest");

        WebElement userpassword=driver.findElement(By.id("customer.password"));
        userpassword.sendKeys("1234567890");

        WebElement userpasswordconfirm=driver.findElement(By.id("repeatedPassword"));
        userpasswordconfirm.sendKeys("1fghjkl");

        driver.findElement(By.className("button")).click();

        driver.close();

    }
}

