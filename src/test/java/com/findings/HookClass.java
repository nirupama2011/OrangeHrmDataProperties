package com.findings;


import io.cucumber.java.Before;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
}
}
