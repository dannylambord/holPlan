package com.qa.holPlam;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.qa.model.Destination;

public class HolidayPlannerTest 
{
//	@Before
//	public void setup() {
//		HolTable h = new HolTable();
//	}
	@Test
	public void addHolidayDestination()
	{
		String city = "Verona";
		String country = "Italy";
		Destination destination = new Destination(city,country);
		String cityText = destination.getCity();
		String countryText = destination.getCountry();
		String text = (countryText + " " + cityText);
		assertEquals("Wrong country returned", country + " " + city, text);
	}
	
	
	
}
