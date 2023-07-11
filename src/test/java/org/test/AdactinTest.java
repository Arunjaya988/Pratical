package org.test;

import java.io.IOException;

import org.basee.BaseClasss;
import org.pages.Loginpage;
import org.pages.SearchHotel;
import org.pages.booking;
import org.pages.selectHotel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinTest extends BaseClasss{
	
	@BeforeClass
	private void beforeclass() {
		
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximise(5);
		String currentUrl = currentUrl();
		boolean contains = currentUrl.contains("adactin");
		Assert.assertTrue(contains);

	}
	
	@AfterClass
	private void afterClass() throws InterruptedException, IOException {
		
		Thread.sleep(6000);
		booking b = new booking();
		screenShot(b.getOrderid(),"C:\\Users\\arunj\\eclipse-workspace\\Adactin\\src\\test\\resources\\ScreenShot\\Orderid.png");

	}
	
	@Test(priority=1)
	private void login() {
		
		Loginpage l = new Loginpage();
		
		sendkeys(l.getUserName(),"arunjaya");
		String user = getattribute(l.getUserName());
		Assert.assertEquals(user, "arunjaya");
		sendkeys(l.getPassword(),"arunideal");
		click(l.getLogin());

	}
	
	@Test(priority=2)
	private void searchHotel() {
		
		SearchHotel s = new SearchHotel();
		
		selectbyIndex(s.getLocation(),3);
		selectbyVisibletext(s.getHotels(),"Hotel Sunshine");
		selectbyIndex(s.getRoomType(),1);
		selectbyIndex(s.getNoofRooms(),1);
		sendkeys(s.getInDate(),"06/08/2023");
		sendkeys(s.getOutDate(),"07/08/2023");
		selectbyIndex(s.getAdults(),1);
		selectbyIndex(s.getChildren(),1);
		click(s.getSearch());

		

	}
	
	@Test(priority=3)
	private void Selecthotel() {
		
		selectHotel h = new selectHotel();
		
		click(h.getSelect());
		click(h.getContinuee());

	}
	
	@Test(priority=4)
	private void Booking() {
		
		booking b = new booking();
		
		sendkeys(b.getFirstName(),"Arun");
		sendkeys(b.getLastName(),"V");
		sendkeys(b.getAddress(),"Madurai,TamilNadu");
		sendkeys(b.getCardno(),"1234567891234567");
		selectbyIndex(b.getCardtype(),2);
		selectbyIndex(b.getMonth(),9);
		selectbyIndex(b.getYear(),17);
		sendkeys(b.getCvv(),"570");
		click(b.getBookNow());
		
		

	}
	
		
	}

