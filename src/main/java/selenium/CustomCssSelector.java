package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// css selector:
		By.cssSelector("#input-email");

		// Structure if these attribute is present in HTML DOM
		// id --> #id
		// id--- tag#id
		// class --> .class
		// class-- tag.class

		// #input-email
		// tag#id
		// .form-control
		// tag.class

		// css selector with two attribute
		// #input-email.form-control
		// .form-control#input-email

		// .c1.c2.c3...cn --where 'c' is class attribute
		// if we have any elemnet on application, which having many class when we have
		// use it by class1.class2 etc
		// .nav-input.nav-progressive-attribute

		// input#input-email ---tag.#id
		// input.form-control --- tag.class1
		// input.form-control#input-email --- tag.class1.class2
		// a.btn-orange.contact-ohrm --- tag.class1.class2

		By ele = By.cssSelector("a.btn-orange.contact-ohrm ");

		By.className("btn-orange contact-ohrm");// not a valid -- because it will only accept one className, not a
												// multiple className
		By.xpath("//a[@class='btn-orange contact-ohrm']");// correct --- because here it will consider whole class as
															// single element, if we only write one class name in this
															// then xpath is not going to working because it define
															// exact class of that element
		By.cssSelector("a.btn-orange.contact-ohrm");// correct
		By.className("contact-ohrm");// valid
		By.className(".contact-ohrm");// not valid

		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3

		// input.form-control.private-form__control.login-password.m-bottom-3
		By.className("form-control private-form__control login-password m-bottom-3");// not valid
		By.xpath("//input[@class='form-control private-form__control login-password m-bottom-3']");
		By.className("login-password");
		By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3");
		By.cssSelector("input.form-control.login-password");
		By.xpath("//button[contains(@class,'login-submit')]");
		By.xpath("//button[@class='login-submit']");// not valid

		// button.login-submit

		// CSSSelector structure
		// htmltag[attr1='value'] // here we donot have to write two forword slas before
		// a cssSelector
		// input[type='submit']

		// input[@type='submit']//xpath of same element

		// CSSSelector structure
		// htmltag[attr1='value'][attr2='value'][attr3='value']
		// input[type='submit'][value='Login']--css
		// input[@type='submit' and @value='Login'] --xpath

		// In cssSelector we donot have contains, start-with and end-with method, so we
		// have to use---
		// '*' is called as astrick , '^' is called carrat and '$' is called dollar sign
		// input[id*='email'] -- it work as contains
		// button[data-test-id^='password'] --it works as starts-with, data-test-id is
		// attribute
		// button[data-test-id$='button'] --it works as ends with

		// parent to child:
		// div.private-form__input-wrapper > input#username --direct child( we have to
		// use '>' symbol)

		// div.private-form__input-wrapper input#username --(direct + indirect
		// child)--(we have to use ' ', means atleast one space)

		// ul.footer-nav > li > a

		// form#hs-login div -- 20(direct + indirect child)
		// form#hs-login > div --8(direct)

		// child to parent: not available
		// backward traversing is not allowed in css

		// following sibling:
		// label.control-label + input#input-email //here '+' is following a following
		// sibling concept

		// preceding-sibling: not available

		// not in css:
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		// input.form-control.private-form__control:not(#username)

		// input.form-control:not(.input-lg) // :not(cssSelector of element)--it will
		// exclude that element from common cssSelector weblement, means if two element
		// are using same class and we want to use only one webelement so we have write
		// :not(cssSelector of webelement of which we are try to exclude)

		// comma in css:
		// Practical use case of this feature is---
		// i have to include 5 element or 7 element and every element have different
		// HTML Tag and we have to include different webelement together instead of
		// creating a multiple element
		// input#username,input#password,button#loginBtn,button#ssoBtn,input#remember
		int count = driver
				.findElements(
						By.cssSelector("input#username,input#password,button#loginBtn,button#ssoBtn,input#remember"))
				.size();

		// no text support

		// nth-of-type:
		// ul.footer-nav li:nth-of-type(5) > a -- for 5th index
		// ul.footer-nav li:nth-of-type(n) > a -- for all elements

		// xpath | CssSelector

		// 1.syntax: hard | simple
		// 2.backwards: possible | NA
		// 3.performance: same | same
		// 4. comma, not : NA | available
		// 5. text : available | NA
		// 6. sibling : available | only forward-sobling
		// 7. index: : better fnctions | available -- but not simple
		// 8. dynamic ele : yes | yes

	}

}
