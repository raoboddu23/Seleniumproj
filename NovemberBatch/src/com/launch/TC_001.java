package com.launch;

import java.io.IOException;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws IOException 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		
		
		
		
		
		

	}

	

}
