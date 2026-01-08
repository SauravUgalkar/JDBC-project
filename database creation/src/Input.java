import java.sql.*;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public  class Input {

    public static void data(Connection conn,Scanner sc) throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Examdb","root","Saurav$2004");
            System.out.println("Enter username : ");
            String str3 = sc.nextLine();
            System.out.println("Enter password: ");
            String str4 = sc.nextLine();

            System.out.println();
            String sq1 = "INSERT INTO User VALUES (?,?,?);";
            PreparedStatement stmt1 = conn.prepareStatement(sq1);
            stmt1.setString(1,str3);
            stmt1.setString(2,str4);
            stmt1.setInt(3,0);
            int count = stmt1.executeUpdate();

            System.out.println(count + " :your credentials is stored.\n");

            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }


    public static void main(String ar[]) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Examdb", "root", "Saurav$2004");
        }catch (Exception e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("connection done .");
        System.out.println("select an option : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                methods.login(conn,sc);

            case 2:
                Input.data(conn,sc);

        }

    }
}
