package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class User {


    public void registerUser(Connection connect, PreparedStatement statement, ResultSet resultSet) {
        System.out.println("Enter the following");
        String firstName = Dialog.dialogString("First name: ");
        String lastName = Dialog.dialogString("Last name:");

        try {
            statement = connect.prepareStatement("INSERT INTO Users (User_FirstName, User_LastName)VALUES(?, ?)");
            statement.setString(1, firstName.toLowerCase());
            statement.setString(2, lastName.toLowerCase());
            statement.executeUpdate();
            System.out.println("The user has been added");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connect.prepareStatement("SELECT User_Id FROM Users WHERE User_FirstName IS ? AND User_LastName IS ?");
            statement.setString(1, firstName.toLowerCase());
            statement.setString(2, lastName.toLowerCase());
            resultSet = statement.executeQuery();

            System.out.println("User id is = " + resultSet.getString("User_Id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void allUsers(Connection connect, PreparedStatement statement, ResultSet resultSet) {
        try {
            statement = connect.prepareStatement("SELECT * FROM Users");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("User_FirstName") + " "
                        + resultSet.getString("User_LastName") + " ID: " + resultSet.getString("User_Id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
