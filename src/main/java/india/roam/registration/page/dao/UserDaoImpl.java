package india.roam.registration.page.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import india.roam.registration.page.model.DBUtil;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean isValidUser(String email, String password) {
        String query = "SELECT * FROM user WHERE email = ? AND password = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Query Executed");
            return resultSet.next();
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public Map<String, String> fetchUserDetails(String email, String password) {
        String query = "SELECT * FROM user WHERE email = ? AND password = ?";
        Map<String, String> userDetails = new HashMap<>();

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Query Executed");

            if (resultSet.next()) {
                userDetails.put("fullname", resultSet.getString("fullname"));
                userDetails.put("email", resultSet.getString("email"));
                userDetails.put("password", resultSet.getString("password"));
            }

            return userDetails;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
