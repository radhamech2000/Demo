package selenium;

public class TC_002 extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch("chrome");
		
		navigateUrl("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		Thread.sleep(4000);	
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		driver.close(); // closes the current browser(current active window)
		driver.quit(); //closes all the chrome browsers opened by webdriver

	}

}
