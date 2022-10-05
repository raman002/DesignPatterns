package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDataSource {
    private static MyDataSource dataSource;
    private static final Connection connection;

    // Creating JDBC's Connection object as threadsafe singleton could be the best example here.
    static {
        dataSource = new MyDataSource();

        try {
            // register the mysql jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "";
            String username = "";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method will return a threadsafe singleton connection object
     * since it's been initialized the static block which will be executed first
     * and only once.
     *
     * @return A threadsafe singleton connection object
     */
    public static Connection getConnection() {
        return connection;
    }

    private MyDataSource() {}

    public static MyDataSource getInstanceViaStaticBlock() {
        return dataSource;
    }
    /**
     * This a NON thread-safe method. Singletons should NOT be created this way in a
     * multithreaded environment.
     * NOTE: This is an on-demand initialization technique
     */
    public static MyDataSource getInstance() {
        if (dataSource == null) {
            dataSource = new MyDataSource();

            System.out.println("dataSource = " + dataSource);
        }
        return dataSource;
    }

    /* If multiple threads try to access the getInstance() method at once then make
    * the method as synchronized or write the instance creation logic inside
    * synchronized block
    *
    * NOTE: This is an on-demand initialization technique
    * */

    public static MyDataSource getThreadSafeInstance() {
        /* This null check is to avoid the multiple execution of the synchronized block
        in case the singleton object is already initialized.
        */
        if (dataSource == null) {
            /*Now, the interesting thing here is that when two threads enter inside this
            "if" statement and one of threads acquires lock and initialized the dataSource
            object, after that another thread that was waiting, entered the synchronized block
            and initialized the dataSource object again. Hence, to avoid this we need to
            have another null check inside the synchronized block as well.
            * */
            synchronized (MyDataSource.class) {
                /* This is the second null check to ensure that multiple threads
                do not initialize this instance multiple times. This technique is also known
                as double-checked locking.
                */
                if (dataSource == null) {
                    dataSource = new MyDataSource();
                }
            }
        }
        return dataSource;
    }

    public static MyDataSource getInstanceViaStaticClass() {
        return MyDataSourceStatic.MY_DATA_SOURCE;
    }

    /* This is an approach via you can directly return the instance of your singleton class without synchronizing
        the method/object because the static class will be lazily loaded and the instance will be initialized
        as soon as you access the INSTANCE variable
        */

    private static class MyDataSourceStatic {
        /*This is called as early initialization technique*/
        public static final MyDataSource MY_DATA_SOURCE = new MyDataSource();
    }
}
