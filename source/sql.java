import java.sql.*;

public interface sql{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1234");
}