package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";

        try {
            Connection conOracle = DriverManager.getConnection(urlOracle, username, password);
            System.out.println("Connection successful");
            String query = "select first_name,last_name, email, phone_number, salary from employees";
            Statement stmt = conOracle.createStatement(); // statement object
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String fname = rs.getString(1);
                String lname = rs.getString(2);
                String email = rs.getString(3);
                String phone = rs.getString(4);
                float salary = rs.getFloat(5);

                System.out.println(fname + " " + lname + " " + email + " " + phone + " " + salary);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
