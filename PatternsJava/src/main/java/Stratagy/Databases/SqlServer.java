package Stratagy.Databases;

import Stratagy.Intefaces.IDatabaseCredentials;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class SqlServer  implements IDatabaseCredentials {
    final String connectionURL = "sqlserver.com/";
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String username = "jamiemacdonald@sql-server.com";
    final String password = "*******";
    final String database = "animal";

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Driver d = (Driver) Class.forName(driver).getDeclaredConstructor().newInstance();
        String connectionUrl = String.format("%s;user=%s;password=%s;database=%;", connectionURL, username, password,database, database);
        Connection connection = d.connect(connectionUrl, new Properties());
        return connection;
    }
}
