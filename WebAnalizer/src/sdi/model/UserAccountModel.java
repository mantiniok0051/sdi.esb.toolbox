package sdi.model;

	import java.sql.PreparedStatement;
	import sdi.include.UserAccountRegistry;

//@SuppressWarnings("unused")
public class UserAccountModel extends ConnectionModel{
	
	public UserAccountModel(){}
	
	public boolean RegisterUserAccount(UserAccountRegistry uar){
		
		PreparedStatement pst= null; //MySQL Query that calls Stored Procedure "register_bussiness_account"
		boolean flag= false; //to signal the success of the operation 
		
		try {
				String sql= "call register_user_account(?, ?, ?, ?, ?, ?)";
				pst= getConnection().prepareStatement(sql);
				
				pst.setString(1, uar.getFName());
				pst.setString(2, uar.getLName());
				pst.setString(3, uar.getLogInID());
				pst.setString(4, uar.geteMail());
				pst.setString(5, uar.getBusinessAccountName());
				pst.setString(6, uar.getBusinessAccountNumber());
			} 
		catch (Exception e) {System.out.println(e.getMessage());}
		finally{
			//Close connection
			try {
					if (getConnection() != null) {getConnection().close();}
					if (pst != null){pst.close();}
				} 
			catch (Exception e2) {}
		}
		
		return flag;}
	
}