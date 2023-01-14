package com.it.berdeja.oop.store;

public class SignUpMenu implements Menu {
	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
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
