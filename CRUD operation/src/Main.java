import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String ar[]) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Saurav$2004");
        Scanner sc = new Scanner((System.in));
        Table.table(con,sc);
        boolean b = true;
        while(b){
            System.out.println("\nselect the options ->\n");
            System.out.println("1.insert new user info.");
            System.out.println("2.update user password");
            System.out.println("3.delete user info.");
            System.out.println("4.select user info.");
            System.out.println("5.Exit.");

            System.out.println("\nchoose option: ");
            int choice  = sc.nextInt();

            switch(choice) {
                case 1:
                    Operation.insert(con, sc);
                    break;
                case 2:
                    Operation.update(con, sc);
                    break;
                case 3:
                    Operation.delete(con, sc);
                    break;
                case 4:
                    Operation.select(con, sc);
                    break;
                case 5:
                    b=false;
                    break;
                default:
                    System.out.println("invalid option.");
            }
        }
    }
}