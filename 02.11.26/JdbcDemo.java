/*
 * 1.Register
 * 2.Connection
 * 3.Statement
 * 4.print
 * 5.close*/
package jdbc_connections;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		// Step 1: Import JDBC package
        // Step 2: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 3: Establish Connection
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/FacePrep",
            "root",
            "1234"
        );

        // Step 4: Create Statement
        Statement stmt = con.createStatement();

        // Step 5: Write CREATE query

        // Step 6: Execute Query
        stmt.executeUpdate( "CREATE TABLE emp (id INT PRIMARY KEY,name VARCHAR(50),age INT)");
        System.out.println("Table created successfully!");

        // Step 7: Close Connection
        stmt.close();
        con.close();

    } catch (Exception e) {
        System.out.println("sorry for inconvients. check your connections.");
    }
	}

}