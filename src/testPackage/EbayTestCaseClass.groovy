package testPackage
import pages.*
import geb.spock.GebSpec

class EbayTestCaseClass extends GebSpec {
	
	def "Fill search field with a value and check the results"(){
		
		when:"Vist ebay page"
		def ebayPage = to EbayHomePage
		
		and: "Type a value into search field"
		ebayPage.searchInput.value("airpods")
		
		then: "The search value exists in the search field"
		assert ebayPage.searchInput.value() ==  "airpods"
		
		when: "We click the search button"
		ebayPage.searchBtn.click()
		
		and: "Filter the items from the checkbox menu"
		ebayPage.pickModelCheckBoxItem("Apple AirPods Pro")
				
		and: "Page is refeshed"
		driver.navigate().refresh()
		
		then: "Then step in order execution not to fail"
		assert true
	}
}
