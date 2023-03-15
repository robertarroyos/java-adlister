import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;

public class JDBCEmployees {

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
            String query = "select first_name from employees.employees";
            ResultSet rs = stmt.executeQuery(query);

            ArrayList<String> names = new ArrayList<>();

            int count = 0;
            while (count < 10) {
                rs.next();
                String name = rs.getString("first_name");
                names.add(name);
                count++;
            }

            System.out.println(names);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
