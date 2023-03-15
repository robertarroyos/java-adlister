import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
            String query = "select * from albums";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String artist = rs.getString("artist");
                if (artist.equals("Nirvana")) {
                    System.out.println("name");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
