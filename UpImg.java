import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;*/
public class UpImg {

	public static void main(String[] args) {
		try
		{
		// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(new com.);
			/*Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myDB");*/
			
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/ImgUpl?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
	      if(con!=null)
	      {
	      System.out.println("Connection established successfully");
	      PreparedStatement pstmt = con.prepareStatement("INSERT INTO ImageUpload VALUES(?, ?)");
	      pstmt.setInt(1,1);
	    //Inserting Blob type
	      InputStream in = new FileInputStream("D:/vtg_image.png");
	      pstmt.setBlob(2, in);
	      pstmt.execute();
	      System.out.println("Record Inserted Sucessfullly");
	      }
	      else
	      {
	    	  System.out.println("Connection not established");
	      }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
