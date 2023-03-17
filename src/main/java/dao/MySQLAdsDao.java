package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while (rs.next()) {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    //    @Override
    public long insert(Ad ad) {
        long lastInsertedID = 0L;
        try {
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
                    );
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedID = rs.getLong(1);
                return lastInsertedID;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lastInsertedID;


//        insert(new Ad(
//                1,
//                "playstation for sale",
//                "This is a slightly used playstation"
//        ));
//        insert(new Ad(
//                1,
//                "Super Nintendo",
//                "Get your game on with this old-school classic!"
//        ));
//        insert(new Ad(
//                2,
//                "Junior Java Developer Position",
//                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//        ));
//        insert(new Ad(
//                2,
//                "JavaScript Developer needed",
//                "Must have strong Java skills"
//        ));
//        return null;
    }
//
//    public static void main(String[] args) {
//        MySQLAdsDao sql = new MySQLAdsDao();
//        List<Ad> ads = new ArrayList<>();
//        ads = sql.all();
//        sql.all();
//        System.out.println(ads);
//    }
}

