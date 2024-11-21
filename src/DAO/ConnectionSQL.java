package DAO;

import Model.User;
import java.sql.*;
import java.util.ArrayList;

public class ConnectionSQL {

    protected Connection connection;

    public ConnectionSQL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=User;user=sa;password=123;encrypt=true;trustServerCertificate=true;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DAO.ConnectionSQL();
    }

    public ArrayList<User> getListUser() {
        ArrayList<User> userList = new ArrayList<>();

        try {

            String sql = "SELECT * FROM dbo.users";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("username"));
                user.setPassWord(rs.getString("password"));
                user.setStatus(rs.getString("status"));
                user.setPassword2(rs.getString("password2"));
                System.out.println("username: " + user.getUserName());
                System.out.println("password: " + user.getPassWord());
                System.out.println("status: " + user.getStatus());
                System.out.println("password level 2: " + user.getPassword2());

                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;

    }

}
