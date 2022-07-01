package selenium;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {
		// Xpath is address of element inside a DOM

		// Xpath General Structure
		// htmltag[@attribute = 'value']

		// input[@id='input-email']---Faster xpath
		// *[@id='input-email']//'*' means any html Tag in DOM--Slower xpath than
		// previous one

		// input[@id]
		// input[@type='submit']

		// htmltag[@attr1 = 'value' and @attr2 = 'value']// it is xpath of one elemnet
		// where we mention more than one attribute of same element
		// input[@type='submit' and @value = 'Login']
		// input[@type='submit' or @value = 'Login']
		// input[@type='text' and @name='email']
		// input[@placeholder = 'E-Mail Address']//where placeholder is attribute that
		// define suggestion text of written field

		// dynamic ids:
//				<input id = "test_123">
//				<input id = "test_456">
//				<input id = "test_908">

		// contains():
		// htmltag[contains(@attr,'value')]
		// input[contains(@id,'test_')]

		// contains() with multiple attributes:
		// htmltag[contains(@attr1,'value') and contains(@attr2='value')]
		// input[contains(@id,'email') and contains(@name,'email')]
		// input[contains(@id, 'email') and contains(@placeholder, 'Address')]
		// input[contains(@id,'email') and contains(@name,'email') and
		// contains(@placeholder,'E-Mail')]

		// one attr with contains and one without contains
		// input[contains(@id,'email') and @type='text']
		// input[@type='text' and contains(@id,'email')]

		// text():--it is not a attribute of element in DOM, it simply a text that
		// display on Application Webpage, here text is consider as function
		// we have use text option for span, links, labels, headers
		// htmltag[text()='value']
		// a[text()='My Account']
		// h2[text()='Returning Customer']

		// text() and @attr
		// htmltag[text()='value' and @attr='value']
		// a[text()='Buy Again' and @data-csa-c-content-id='nav_cs_buy_again']

		// contains() with text():
		// htmltag[contains(text(),'value')]
		// span[contains(text(),'internationally')]

		// a[contains(text(),'Gift') and contains(@href,'gift-cards')]

		// starts-with:
		// a[starts-with(text(),'Gift')]
		// a[starts-with(text(),'Amazon')]
		// input[starts-with(@class,'form-')]

		// ends-with: option is deprecated means removed and currently not supported

		// indexing:
		// storing the xpath inside a () is called a capture group then we mention the
		// index
		// index---let consider two different element on same application is using same
		// class, and we want to write a xpath based on class attribute so we define 1st
		// element as index 1 and 2nd element as index 2 and so on
		// (//input[@class='form-control'])[2]
		By emailid = By.xpath("(//input[@class='form-control'])[1]");
		By password = By.xpath("(//input[@class='form-control'])[2]");

		// (//input[@class='form-control'])[position()=1]

		// (//div[@class='navFooterLinkCol navAccessibility'])[1]//a
		// (//div[@class='navFooterLinkCol navAccessibility'])[4]//a

		// last():
		// (//input[@type='text' or @type='email' or @type='tel' or
		// @type='password'])[last()]
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		// (//a[starts-with(text(),'Amazon')])[last()-1]

		// parent to child:
		// (//div[@class='form-group'])[1]/input[contains(@id,'email')]
		// //ul[@class='footer-nav']//a
		// (/) --> direct child elements
		// (//) --> direct + indirect child elements

		// form[@id='hs-login']/div -- 8
		// form[@id='hs-login']//div --20

		// div[@class='private-form__input-wrapper']/child::input --- it gives all child
		// element that have input tag of this weblement 
		// form[@id='hs-login']//child::div

		// child to parent:
		// '..' move the child element to immediate parent 
		// input[@id='username']/../../../../../../../../../..
		// input[@id='username']/parent::div
		// input[@id='username']/..
		// input[@id='username']/ancestor::div  ---it gives a parent and all grant parent who have div tag

	}

}
