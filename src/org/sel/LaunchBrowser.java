package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
public void chromeLaunch() {

	System.setProperty("webdriver.firefox.driver", "D:\\JAVA\\Seleniumm\\driver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_Cj0KCQiAtf_tBRDtARIsAIbAKe2cDV2HgkGV4Gx28KbBnr-O8fz2aTMyy2Hp3sPHHt8h45h5lcig7IQaAsmVEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiAtf_tBRDtARIsAIbAKe2cDV2HgkGV4Gx28KbBnr-O8fz2aTMyy2Hp3sPHHt8h45h5lcig7IQaAsmVEALw_wcB");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	driver.quit();
	
	
}

public static void main(String[] args) {
	LaunchBrowser l = new LaunchBrowser();
	l.chromeLaunch();
}
}
