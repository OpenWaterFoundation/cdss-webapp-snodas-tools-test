import java.sql.DriverPropertyInfo

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.*
import geb.spock.GebSpec

@Stepwise
class SNODAS_Spec extends GebSpec {
	@Shared
	@AutoCleanup("quit")
	WebDriver driver = new ChromeDriver()

	def "Page Loads Successfully"(){
		when:
		go("http://localhost:80")

		then:
		$("title").text() == "SNODAS Daily SWE and Snow Coverage Statistics"
	}
	
	def "Check About Section In Navbar"(){
		when:
		$("#data")
		
		then:
		assert $("#about h3").text() == "Daily SNODAS Snowpack Products for Colorado Water Supply Basins"
	}
}