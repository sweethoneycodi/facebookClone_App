package Database;

import Model.Persons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpData {
    private String dbUrl = "jdbc:mysql://localhost:3306/facebook";
    private  String dbUserName = "root";
    private String passwords = "bravenonso22";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,dbUserName,passwords);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    public String insert(Persons persons) {

        loadDriver(dbDriver);
        Connection connection = getConnection();
        String result = "Data entered successfully";
        String sql = "insert into persons values (?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,persons.getFirstName());
            preparedStatement.setString(2,persons.getLastname());
            preparedStatement.setString(3,persons.getUserName());
            preparedStatement.setString(4,persons.getEmail());
            preparedStatement.setString(5,persons.getPassword());
            preparedStatement.setString(6,persons.getConfPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        return result;
    }


}
