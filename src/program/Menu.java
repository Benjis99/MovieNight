package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu{

    private Movies movies = new Movies();
    private User user = new User();

    public Menu(Connection connect, PreparedStatement statement, ResultSet resultSet) throws SQLException {
        welcomeMessage(connect, statement, resultSet);
        welcomeMenu(connect, statement, resultSet);
    }

    public void welcomeMessage (Connection connect, PreparedStatement statement, ResultSet resultSet){
        System.out.println("""
                ﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏
                Welcome back to the movie saver
               ﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏""");
    }


    public void welcomeMenu(Connection connect, PreparedStatement statement, ResultSet resultSet){
       int welcomeMenuPick = Dialog.dialog("""
               1. Create new user
               2. All user
               3. Movie section
               4. Exit program""",1,4);

       switch (welcomeMenuPick){
           case 1 -> createNewUser(connect, statement, resultSet);
           case 2 -> pickUser(connect, statement, resultSet);
           case 3 -> movieMenu(connect, statement, resultSet);
           case 4 -> System.out.println("Bye bye");
           default -> System.exit(1);
       }
    }

    public void createNewUser(Connection connect, PreparedStatement statement, ResultSet resultSet){
        user.registerUser(connect, statement, resultSet);
        int createChoice = Dialog.dialog("""
                1. Create more users
                2. Start menu
                3. Exit program""", 1, 3);
        switch (createChoice){
            case 1 -> createNewUser(connect, statement, resultSet);
            case 2 -> welcomeMenu(connect, statement, resultSet);
            case 3 -> System.exit(1);
        }
    }

    public void pickUser (Connection connect, PreparedStatement statement, ResultSet resultSet){
    user.allUsers(connect, statement, resultSet);
    }

    public void movieMenu(Connection connect, PreparedStatement statement, ResultSet resultSet){
        int movieAnswer = Dialog.dialog("""
                1. All movies
                2. Add movies
                3. Search movies via genre""");

        switch (movieAnswer){
            case 1 -> allMovies(connect, statement, resultSet);
            case 2 -> addMovies(connect, statement, resultSet);
            case 3 -> System.out.println("Genre");
        }

    }

    public void allMovies(Connection connect, PreparedStatement statement, ResultSet resultSet){
    movies.allMovies(connect, statement, resultSet);
    }

    public void addMovies(Connection connect, PreparedStatement statement, ResultSet resultSet){

    }


}
