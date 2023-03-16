public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {

        private static Contacts contactsDao;

        public static Contacts getContactsDao() {
            if(contactsDao == null) {
                contactsDao = new ListContactsDao();
            }
        }

    }
}
