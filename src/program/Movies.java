package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Movies {



    public void allMovies(Connection connect, PreparedStatement statement, ResultSet resultSet){
        try {
            statement = connect.prepareStatement("SELECT * FROM AllMovies");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Movie name: " + resultSet.getString("MovieName")
                        + " Review: " + resultSet.getString("Review")
                        + " Genre: " +resultSet.getString("Genre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
