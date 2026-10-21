import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/college",  "root",  "sanjay@12");
        System.out.println(con);
        System.out.println("connection created");
        con.close();
    }
}