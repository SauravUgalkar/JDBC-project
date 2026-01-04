import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Table {
    public static void table(Connection con, Scanner sc) throws SQLException {
        String sql1 = "Create table IF NOT EXISTS user(id int primary key , uname varchar(30),password varchar(20),batch_id varchar(30),date_enroll date);";
        PreparedStatement stmt = con.prepareStatement(sql1);

        int count = stmt.executeUpdate();
        System.out.println( count +" table created");

    }
}
