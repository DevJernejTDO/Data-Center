package myTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private String host;
    private String database;
    private String username;
    private String password;
    private int port;

    public Connection Login(String host, String database, String username, String password, int port) {
        this.host = host;
        this.database = database;
        this.username = username;
        this.password = password;
        this.port = port;
        try {
            return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false",
                    username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Connection GetConnection() {
        return Login(this.host, this.database, this.username, this.password, this.port);
    }

    public void Close(Connection con) {
        try {
            if (con != null && !con.isClosed())
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}