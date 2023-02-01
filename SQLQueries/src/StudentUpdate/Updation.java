package StudentUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {
    public static void main(String[] args) {
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";

        try {

            Connection con2 = DriverManager.getConnection(urlOracle, username, password);
            System.out.println("Connection successful");
            Scanner sc = new Scanner(System.in);

            // user input datatypes
            String name;
            int id;

            System.out.println("Enter your name - ");
            name = sc.next();
            System.out.println("Enter the ID where the name is to be changed - ");
            id = sc.nextInt();

            // SQL query
            String query = "update student set name = ? where id = ?";

            // using prepared statement
            PreparedStatement ptmt = con2.prepareStatement(query);
            ptmt.setString(1, name);
            ptmt.setInt(2, id);

            // Statement stmt = con2.createStatement(); // sql statement object

            // executing the prepared statement
            ptmt.execute();

            System.out.println("Record updated successfully");

            sc.close();

        } catch (

        SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
