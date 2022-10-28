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
		modelCheckBoxItems() { $("#x-refine__group_1__0 > ul > li > div > a > div > div > div > .x-refine__multi-select-cbx")}		
		fakeTabItemsText {$(".fake-tabs > .fake-tabs__items > .fake-tabs__item > a > span").text()}
		fakeTabItemsBtn {$(".fake-tabs > .fake-tabs__items > .fake-tabs__item")}
		
	}
	
		
	def pickModelCheckBoxItem(def checkBoxString){
		for (modelCheckBoxItem in modelCheckBoxItems) {
			if(modelCheckBoxItem.text().contains(checkBoxString)){
				modelCheckBoxItem.click()
				break;
			}
		}
	}
	
	def selectFakeTabItem(def fakeTabOptionString){
		for (fakeTabItem in fakeTabItems) {
			if(fakeTabItem.text().contains(fakeTabOptionString)){
				fakeTabItem.click()
				break;
			}
		}
}
	
}
