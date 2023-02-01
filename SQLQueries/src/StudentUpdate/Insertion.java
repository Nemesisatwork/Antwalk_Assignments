package StudentUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";

        try {

            Connection con2 = DriverManager.getConnection(urlOracle, username, password);
            System.out.println("Connection successful");
            Scanner sc = new Scanner(System.in);

            // user input datatypes
            String ch, name, address;
            String ch2 = new String("y");
            int age, course_id;

            // taking user input
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter your name - ");
                name = sc.next();
                System.out.println("Enter your age - ");
                age = sc.nextInt();
                System.out.println("Enter your address - ");
                address = sc.next();
                System.out.println("Enter your course id - ");
                course_id = sc.nextInt();

                // SQL query
                String query = "insert into student(name,age,address,course_id)" + " values(?,?,?,?)";

                // using prepared statement
                PreparedStatement ptmt = con2.prepareStatement(query);
                ptmt.setString(1, name);
                ptmt.setInt(2, age);
                ptmt.setString(3, address);
                ptmt.setInt(4, course_id);
                // Statement stmt = con2.createStatement(); // sql statement object

                // executing the prepared statement
                ptmt.execute();

                System.out.println("Record inserted successfully");

                System.out.println("Do you want to continue? (y/n)- ");
                ch = sc.next();
                if (ch.equalsIgnoreCase(ch2)) // checking for user approval for next SQL entry
                    continue;
                else
                    break;
            }
            sc.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
