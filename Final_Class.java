package Selenium.Framework;

import java.io.IOException;

import org.testng.annotations.Test;

public class Final_Class {
	
	@Test
	public void finalMethod() throws InterruptedException, IOException
	{
		Base_Class base=new Base_Class();
		base.baseMethod();
		
		Navigation_part nav = new Navigation_part(base.driver);
		Home_Page homepage = new Home_Page(base.driver);
		Configure_page configure = new Configure_page(base.driver);
		SmartTech smart = new SmartTech(base.driver);
		F99 f99 = new F99(base.driver);
		TestRide testride = new TestRide(base.driver);
		LimitedPage Limited = new LimitedPage(base.driver);
		LegalPage legal= new LegalPage(base.driver);
		PressPage press = new PressPage(base.driver);
		RetailPartnerShip retail = new RetailPartnerShip(base.driver);
		ContactPage  contact = new ContactPage(base.driver);
		FAQ_Page faq = new FAQ_Page(base.driver);
		Careers_Page career = new Careers_Page(base.driver);
		SquadronPage squadron = new SquadronPage(base.driver);
		Location_Page location = new Location_Page(base.driver);
		EnquiryPage enquiry = new EnquiryPage(base.driver);
		about_page about = new about_page(base.driver);
		
//		nav.navigation();
//		homepage.homepage();
		configure.configureMethod();
//		smart.smartmethod();
//		f99.F99Method();
//		testride.TestRideMethod();
//		Limited.LimitedMethod();
//		legal.LegalMethod();
//	    press.PressMethod();
//	    retail.RetailPageMethod();
//	    contact.ContactMethod();
//	    faq.FAQMethod();
		//career.Careers_Method();
//		squadron.SquadronMethod();
//		location.LimitedMethod();
//		enquiry.EnquiryMethod();
//		about.aboutPageMethod();
		
	}


}
