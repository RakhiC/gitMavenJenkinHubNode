package hubNodeConcept;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class DemoA {
	@Test
	public void testA(XmlTest t) throws MalformedURLException
	{
		String browser = t.getParameter("browser");
		URL remoteAddress = new URL("http://10.10.4.38:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		//dc.setPlatform(Platform.LINUX);//enum Platform.WINDOWS
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(remoteAddress,dc);
		driver.get("https://www.google.co.in/");
	}

}
