package sdi.controller;

	import sdi.include.UserAccountRegistry;
	import sdi.model.UserAccountModel;

public class UserAccountController {
	public boolean RegisterUserAccount(UserAccountRegistry ua){
		UserAccountModel modelo= new UserAccountModel();
		return modelo.RegisterUserAccount(ua);
		}

}
