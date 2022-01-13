package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu{

    private Movies movies = new Movies();


    public Menu(Connection connect, PreparedStatement statement, ResultSet resultSet) throws SQLException {
        WelcomeMenu(connect, statement, resultSet);
    }

    public void WelcomeMenu(Connection connect, PreparedStatement statement, ResultSet resultSet){
        System.out.println("""
               ﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏
                Welcome back to the movie saver
               ﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏""");

    }

}
