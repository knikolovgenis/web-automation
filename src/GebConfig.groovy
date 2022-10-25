import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 2
	retryInterval = 0.5
	includeCauseInMessage = true
	
	preset {
		slow {
			timeout = 20
			retryInterval = 1
		}
		
		verySlow {
			timeout = 50
		}
	}
}

//atCheckWaiting = "slow"
atCheckWaiting = true

String path = System.getProperty("user.dir");
String chromeDriverPath = "/chromedriver"
String geckoDriverPath = "/geckodriver"

System.setProperty("webdriver.chrome.driver", path + chromeDriverPath)
System.setProperty("webdriver.firefox.driver", path + chromeDriverPath)


//driver = { new ChromeDriver()}
driver = { new FirefoxDriver()}


environments {
	
//	This environment section is used through command line
//	In that case format would be
//	for Chrome
//	-Dgeb.env = chrome
//	for Firefox
//	-Dgeb.env = firefox

	chrome {
		driver = { new ChromeDriver()}
	}
	
	firefox {
		driver = { new FirefoxDriver()}
	}
}

baseUrl = "https://www.ebay.com/"
reportsDir = "./target/report"


