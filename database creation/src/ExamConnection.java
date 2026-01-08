import java.sql.*;

public class ExamConnection {
    public static void main(String ar[]) throws SQLException {

        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Examdb","root","Saurav$2004");

            System.out.println("connection done. ");

//            String sql1 = "create table Question(Que varchar(100) not null, A varchar(30) not null , B varchar(30) not null, C varchar(30) not null, D varchar(30) not null, Correct varchar(30) not null);";
//            String sql2 = "create table User(username varchar(30) not null, password varchar(30) not null,score int not null);";
//            String sql3 = "INSERT INTO Question (Que, A, B, C, D, Correct) VALUES ('What is the default value of an int variable in Java?', '0', '1', 'null', '-1', '0'),  ('Which package contains the String class?', 'java.util', 'java.lang', 'java.io', 'java.net', 'java.lang'),('Which of these is not a primitive data type?', 'int', 'boolean', 'String', 'char', 'String');";
//            String sql4 = "INSERT INTO User (username, password, score) VALUES ('admin', 'admin123', 1), ('john_doe', 'pass456', 2), ('test_user', 'test789', 0);";
//
//
//            String updateSql = "UPDATE question SET Que = ?, A = ?, B = ?, C = ?, D = ?, Correct = ? WHERE Que ='What is the default value of an int variable in Java?';";
//            String updatePassSql = "UPDATE User SET password = ? WHERE username = 'admin';";



//            PreparedStatement stmt1 = con.prepareStatement(sql1);
//            PreparedStatement stmt2 = con.prepareStatement(sql2);
//            int var1 = stmt1.executeUpdate();
//            int var2 = stmt2.executeUpdate();
//            int var3 = var1+var2;
//
//            System.out.println( ": table created");

//            PreparedStatement stmt3 = con.prepareStatement(sql3);
//            PreparedStatement stmt4 = con.prepareStatement(sql4);
//
//            int var3 = stmt3.executeUpdate();
//            int var4 = stmt4.executeUpdate();
//            System.out.println("data added .");

//            PreparedStatement stmt5 = con.prepareStatement(updateSql);
//            PreparedStatement stmt6 = con.prepareStatement(updatePassSql);
//
//            stmt5.setString(1, "Updated Question Text");
//            stmt5.setString(2, "New Option A");
//            stmt5.setString(3, "New Option B");
//            stmt5.setString(4, "New Option C");
//            stmt5.setString(5, "New Option D");
//            stmt5.setString(6, "New Correct Answer");
//
//            stmt6.setString(1, "password_2026");
//
//            int  var5 = stmt5.executeUpdate();
//            int var6 = stmt6.executeUpdate();
//
//            System.out.println("values updated"+ var6 +" "+ " "+var5 );

//         PreparedStatement sta66= con.prepareStatement("delete from User where username = 'test_user' ");
//          sta66.executeUpdate();
            con.close();


        }catch(Exception e){
            con.rollback();
            e.printStackTrace();
        }
    }
}
