package Stratagy;

import Stratagy.Databases.MySql;
import Stratagy.Databases.SqlServer;
import Stratagy.Intefaces.IDatabaseCredentials;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class userAccounts {
    public void getUserAccountsAllDatabases() throws SQLException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        IDatabaseCredentials mySql = new MySql();
        IDatabaseCredentials sqlServer = new SqlServer();
        ResultSet mySqlUsers = getUserAccounts(mySql);
        ResultSet SqlServerUsers = getUserAccounts(sqlServer);

        //process this recordsets and return as one.
    }

    private ResultSet getUserAccounts(IDatabaseCredentials database) throws SQLException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Connection mySqlConnection = database.getConnection();
        Statement statement = mySqlConnection.createStatement();
        return statement.executeQuery("SELECT forename, surname FROM Customers");
    }

}
