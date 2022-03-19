package com.sgtesting.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarious2 {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		user1login();
		createUser2();
		logout();
		user2login();
		createUser3();
		logout();
		user3login();
		logout();
		user2login();
		 modifyUsers3();
		 logout();
		 user3loginmodified();
		 logout();
		 user1login();
		 modifyUsers2();
		 logout();
		 user2loginmodified();
		 logout();
		 login();
		 modifyUsers1();
		 logout();
		 user1loginmodified();
		 logout();
		 user2loginmodified();
		 logout();
		 login();
		 deleteUser1();
		 logout();
		 closeapp();
		 
		 
		 
		 
		
		
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/user/submit_tt.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUsers3()
	{
		try
		{
			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User3, demo3']")).click();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).clear();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).sendKeys("Demouser33");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("passwordCopy")).clear();
		  oBrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser33");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUsers2()
	{
		try
		{
			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).clear();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).sendKeys("Demouser22");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("passwordCopy")).clear();
		  oBrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser22");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUsers1()
	{
		try
		{
			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).clear();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("password")).sendKeys("Demouser11");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.name("passwordCopy")).clear();
		  oBrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser11");
		  Thread.sleep(2000);
		  oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void user3loginmodified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Demouser33");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user2loginmodified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Demouser22");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user1loginmodified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Demouser11");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapp()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
