package com.it.berdeja.oop.store;

public class SignInMenu implements Menu {
	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
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
