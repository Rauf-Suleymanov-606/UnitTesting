package com.example.unittesting;

import java.sql.*;

import static org.hibernate.engine.FetchStyle.SELECT;

public class ApplicationDao {
    private static final String URL = "jdbc:postgresql://localhost:5432/Booking";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Samir999";

    public User getUserById(String id) {
        User user = null;
        String sql = "SELECT * FROM users WHERE id=?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("user_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return user;
    }
        public void save (User user){
                Connection connection = null;

                try {

                    connection = DriverManager.getConnection(URL, USER, PASSWORD);

                    String sql = "INSERT INTO users (name) VALUES (?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
//                    preparedStatement.setString(1, user.getUserName());

                    int rowsInserted = preparedStatement.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("A new user was inserted successfully!");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }


