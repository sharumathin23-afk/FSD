/*
	 * 1.Register
	 * 2.Connection
	 * 3.Statement
	 * 4.print
	 * 5.close*/
package jdbc_connections;
import java.sql.*;
import java.util.Scanner;
public class JdbcCrud {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			 System.out.print("Enter Student ID: ");
		        int id = sc.nextInt();

		        System.out.print("Enter Student Name: ");
		        String name = sc.next();

		        System.out.print("Enter Student Age: ");
		        int age = sc.nextInt();

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
	        
	        //create
	        
	        //stmt.executeUpdate( "CREATE TABLE emp (id INT PRIMARY KEY,name VARCHAR(50),age INT)");
	        //System.out.println("Table created successfully!");
	        
	        // insert
	        String sql = "INSERT INTO emp VALUES (" 
                    + id + ", '" + name + "', " + age + ")";

       int result = stmt.executeUpdate(sql);

       System.out.println(result + " record inserted successfully!");
	        /* String sql = "INSERT INTO emp VALUES (1, 'Arun', 22)";
	        int result = stmt.executeUpdate(sql);

	        System.out.println(result + " record inserted successfully!"); */
	        
	        
	        
	        /* stmt.executeUpdate("INSERT INTO emp VALUES (1, 'Sharu', 25)");
	        stmt.executeUpdate("INSERT INTO emp VALUES (2, 'Joey', 23)");
	        stmt.executeUpdate("INSERT INTO emp VALUES (3, 'Phoebe', 28)");

	        System.out.println("Records inserted successfully");
	        
	        // UPDATE
	        stmt.executeUpdate(
	            "UPDATE emp SET name='Priya', age=26 WHERE id=1"
	        );
	        System.out.println("Record updated successfully");

	        // DELETE
	        stmt.executeUpdate(
	            "DELETE FROM emp WHERE id=3"
	        );
	        System.out.println("Record Delete successfully");
	        
	        // Display
	        
	        ResultSet rs =stmt.executeQuery("select * from emp");
	        
	        while (rs.next()) {

	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            int age = rs.getInt("age");

	            System.out.println(id + " " + name + " " + age);
	        }

	        rs.close(); */
	        
	        // Step 7: Close Connection
	        stmt.close();
	        con.close();
	        sc.close();

	    } catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
		}

	}