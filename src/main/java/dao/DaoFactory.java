package dao;

import dao.Ads;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
            if(adsDao == null) {
                adsDao = new MySQLAdsDao();
            }
            return adsDao;
//        }
    }
}
