package com.it.berdeja.oop.store;

public class SettingsMenu implements Menu {
	private static final String SETTINGS = "1. Change Password" + System.lineSeparator()
	+ "2. Change Email";

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printMenuHeader() {
		// TODO Auto-generated method stub

	}

}
