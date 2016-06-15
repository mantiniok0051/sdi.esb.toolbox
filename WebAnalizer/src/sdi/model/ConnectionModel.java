package sdi.model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

public class ConnectionModel {
	
	public ConnectionModel(){
		
		try{

			 System.out.println("Opening SQLPipe....");
			 Class.forName(JClassName);
		     dbLink= DriverManager.getConnection(URL, dbUserName, dbPassword);
		     if (dbLink != null ) {System.out.println("SQLPipe successfully opened!");}
		     else {System.out.println("error while openening SQLPipe");}
			
			}
		catch(ClassNotFoundException e){System.out.println("chales");
										System.out.println(e.getCause());}
		catch(SQLException e){System.out.println(e.getLocalizedMessage());
							  System.out.println(e.getCause());}
	}
	
	public Connection getConnection(){return dbLink;}
	
	//Connection Assets
		private String dbUserName= "root";
		private String dbPassword= "";
		private String dbHostName= "localhost";
		private String dbHostPort= "3306";
		private String dbSchemaID= "itiesb";
		private String JClassName= "com.mysql.jdbc.Driver";
		private String URL= "jdbc:mysql://"+dbHostName+":"+dbHostPort+"/"+dbSchemaID;
		private Connection dbLink= null;

}