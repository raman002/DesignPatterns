package creational.singleton;

public class MyDataSource {
    private static MyDataSource dataSource;

    private MyDataSource() {}

    public static MyDataSource getInstance() {
        if (dataSource == null) {
            dataSource = new MyDataSource();
        }
        return dataSource;
    }

    /* If multiple threads try to access the getInstance() method at once then make
    * the method as synchronized or write the instance creation logic inside
    * synchronized block*/

    public static MyDataSource getThreadSafeInstance() {
        synchronized (dataSource) {
            if (dataSource == null) {
                dataSource = new MyDataSource();
            }
        }

        return dataSource;
    }
}
