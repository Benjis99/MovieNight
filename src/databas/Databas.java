package databas;

import program.Menu;

import java.sql.*;

public class Databas {
    private ResultSet resultSet;
    private PreparedStatement statement;
    private Connection connect = null;

    public Databas() throws SQLException {
        connect();
        new Menu(connect, statement, resultSet);
    }

    private void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:Movienight");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
