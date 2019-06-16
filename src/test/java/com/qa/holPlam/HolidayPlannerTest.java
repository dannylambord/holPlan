package com.qa.holPlam;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.qa.model.Destination;
import com.qa.model.User;

public class HolidayPlannerTest 
{
	User user;
	Destination destination;
	
	@Before
	public void setup() {
		
		user = new User();
		destination = new Destination();
		
	}
	
	@Test
	public void testingId() {
		destination.setId(1);
		
		assertEquals("Wrong id returned", 1, destination.getId());
	}
	
	@Test
	public void testingLocId() {
		destination.setLocId(1);
		
		assertEquals("Wrong location id returned", 1, destination.getLocId());
	}
	
	@Test
	public void testingCity() {
		destination.setCity("London");
		
		assertEquals("Wrong city returned", "London", destination.getCity());
	}
	
	@Test
	public void testingCountry() {
		destination.setCountry("England");
		
		assertEquals("Wrong country returned", "England", destination.getCountry());
	}
	
	@Test
	public void testingUserId() {
		user.setId(1);
		
		assertEquals("Wrong ID returned", 1, user.getId());
	}
	
	@Test
	public void testingUserName() {
		user.setUserName("User 1");
		
		assertEquals("Wrong UserName returned", "User 1", user.getUserName());
	}
	
	@Test
	public void testingPassword() {
		user.setPassword("Pass");
		
		assertEquals("Wrong password returned", "Pass", user.getPassword());
	}
	
}
