package Stratagy.Databases;
import Stratagy.Intefaces.IDatabaseCredentials;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class MySql implements IDatabaseCredentials {

    final String connectionurl = "jdbc:mysql://localhost:3306/";
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String username = "stuff@my-sql.com";
    final String password = "*******";
    final String database = "apples";

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Driver d = (Driver) Class.forName(driver).getDeclaredConstructor().newInstance();
        String connectionUrl = String.format("%s;user=%s;password=%s;database=%;",connectionurl, username, password,database, database);
        Connection con = d.connect(connectionUrl, new Properties());
        return null;
    }
}
