import java.awt.geom.RectangularShape;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Operation {
    public static void insert (Connection con, Scanner sc) throws SQLException {

        System.out.println("insert new user information ->");
        String sql3 = "insert into user values(?,?,?,?,now());";

        System.out.println("Enter the user id : ");
        int id = sc.nextInt();
        System.out.println("Enter user name : ");
        String usern = sc.next();
        System.out.println("Enter the password : ");
        String userp = sc.next();
        System.out.println("Enter the batch_id: ");
        String batch_id = sc.next();

        PreparedStatement stmt = con.prepareStatement(sql3);
        stmt.setInt(1,id);
        stmt.setString(2,usern);
        stmt.setString(3,userp);
        stmt.setString(4,batch_id);

        int count = stmt.executeUpdate();

        System.out.println("user data is inserted. ");
    }

    public static void update(Connection con, Scanner sc) throws SQLException {
        System.out.println("update user password information ->");
        String sql4 = "Update user set password = ? where id = ?;";

        System.out.println("Enter user id: ");
        int i = sc.nextInt();

        System.out.println("Enter user new password : ");
        String str = sc.next();
        PreparedStatement stmt = con.prepareStatement(sql4);
        stmt.setString(1,str);
        stmt.setInt(2,i);
         int count  = stmt.executeUpdate();

        System.out.println("user password updated.");

    }

    public static void delete(Connection con, Scanner sc) throws SQLException {
        System.out.println("delete user information ->");

        String sql = "delete from user where id=?;";

        System.out.println("enter user id: ");
        int i = sc.nextInt();

        PreparedStatement stmt =  con.prepareStatement(sql);
        stmt.setInt(1,i);

        int count =  stmt.executeUpdate();

        System.out.println("user information deleted.");
    }
    public static void select(Connection con,Scanner sc) throws SQLException {
        System.out.println(" show user information ->");

        String sql = "select * from user where id=?;";
        System.out.println("enter user id: ");
        int i = sc.nextInt();

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,i);

        ResultSet info = stmt.executeQuery();

        while(info.next()){
            System.out.println("id : "+info.getInt(1));
            System.out.println("uname : "+info.getString(2));
            System.out.println("upass : "+ info.getString(3));
            System.out.println("Batch_id : "+info.getString(4));
            System.out.println("Enroll_Date : "+info.getString(5));
        }
        System.out.println("user information selected.");
    }
}
