package domain;

public class new {
    public static void main(String[] args) {

        String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "hr";
        String password = "hr";
        
        Connection conOracle = DriverManager.getConnection(urlOracle, username, password);
    }
}
