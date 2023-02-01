package domain;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";

        try {
            /*
             * Connection conOracle = DriverManager.getConnection(urlOracle, username,
             * password);
             * System.out.println("Connection successful");
             * String query =
             * "insert into student(name,age,address,course_id) values('Mani',25,'Guntur',1)"
             * ;
             * Statement stmt = conOracle.createStatement();
             * int x = stmt.executeUpdate(query);
             * System.out.println(x + " record inserted");
             */

            Connection con = DriverManager.getConnection(urlOracle, username, password);
            System.out.println("Connection successful");
            String query = "insert into student(name,age,address,course_id) values('Kluesner',56,'SA',1)";
            Statement stmt = con.createStatement(); // sql statement object
            int x = stmt.executeUpdate(query);

            System.out.println(x + "record inserted successfully");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
