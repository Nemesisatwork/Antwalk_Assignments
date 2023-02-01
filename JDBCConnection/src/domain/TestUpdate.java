package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";

        try {
            Connection conOracle2 = DriverManager.getConnection(urlOracle, username, password);
            System.out.println("Connection successful");
            String query = "update student set name='Shane' where id=13";
            Statement stmt3 = conOracle2.createStatement(); // statement object
            int x = stmt3.executeUpdate(query);

            System.out.println(x + " record updated successfully");
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
