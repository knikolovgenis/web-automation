package pages

import geb.Page

class EbayHomePage extends Page{
	
	static url = ""
		
	static at = {
		driver.currentUrl == "https://www.ebay.com/"
	}
	
	static content = {
		
		searchInput(wait:true){ $("input.ui-autocomplete-input") }
		searchBtn(wait:true){ $("#gh-btn")}
		checkBoxItem() { $("li.x-refine__main__list--value")}
	}
	
	def searchItem(item){
		searchInput.value(item)
//		assert searchInput.value() == item
		searchBtn.click()
	}
	
}
