package Database;

import Model.Persons;

import java.sql.*;

public class LogInData {

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

    public boolean validate(Persons persons) {
        loadDriver(dbDriver);
        Connection connection = getConnection();
        boolean status = false;

        String sql = "select * from persons where username = ? and password = ?";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,persons.getUserName());
            preparedStatement.setString(2,persons.getPassword());
            ResultSet resultset = preparedStatement.executeQuery();

            status = resultset.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return status;
    }
}
