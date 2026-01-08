import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class methods {
    public static void login(Connection conn , Scanner sc) throws SQLException {
        HashMap<String,String> list = new HashMap();

        String sql2 = "select * from user;";
        PreparedStatement stmts = conn.prepareStatement(sql2);
        ResultSet rs = stmts.executeQuery();

        while(rs.next()){
            System.out.println("username: "+rs.getString("username") + "\tscore: "+rs.getInt("score"));
            String str1 = rs.getString(1);
             String str2 = rs.getString(2);
             list.put(str1.trim(),str2.trim());
        }
        System.out.println("Enter username: ");
        String u = sc.nextLine().trim();
        System.out.println("Enter password: ");
        String p = sc.nextLine().trim();
        if(p.equals(list.get(u))){
            System.out.println("Login successful. ");
        }else{
            System.out.println("\nenter correct credentials.\n");
            login(conn,sc);
        }

    }
}
