package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Staff> Staffs = new ArrayList<Staff>();
		Staffs.add(new Staff());
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
