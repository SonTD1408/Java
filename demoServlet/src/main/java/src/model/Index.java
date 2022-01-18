package src.model;
import java.sql.*;

public class Index {
    public static Connection getConn(){
        String url = "jdbc:mysql://localhost:3306/demoservlet";
        String user = "root";
        String pass = "Son.ymmm.140899";

        Connection conn =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connect successfully!");
        }catch (Exception e){
            System.out.println("Connection fails!");
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet getAllAccount() throws SQLException {
        Connection conn = getConn();
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("select * from user_account");
        return res;
    }

    public void insert(String name, String pass, String gender) throws SQLException {
        Connection conn = getConn();
        Statement stmt = conn.createStatement();
        String sql = "insert into user_account (user_name,password,gender) values ('"+name+"','"+pass+"','"+gender+"')";
        System.out.println(sql);
        stmt.executeUpdate(sql);
        conn.close();
    }

    public static int checkLogin(String user, String pass){
        try {
            ResultSet res = getAllAccount();
            while (res.next()){
                if (res.getString("user_name").equals(user) && res.getString("password").equals(pass)){
                    return 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
