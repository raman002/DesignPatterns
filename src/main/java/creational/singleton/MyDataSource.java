package creational.singleton;

public class MyDataSource {
    private static MyDataSource dataSource;

    static {
        dataSource = new MyDataSource();
    }
    private MyDataSource() {}

    public static MyDataSource getInstanceViaStaticBlock() {
        return dataSource;
    }
    /**
     * This a NON thread-safe method. Singletons should NOT be created this way in a
     * multithreaded environment.
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
    * synchronized block*/

    public static MyDataSource getThreadSafeInstance() {
        /* This null check is to avoid the multiple execution of the synchronized block
        in case the singleton object is already initialized.
        */
        if (dataSource == null) {
            synchronized (MyDataSource.class) {
                /* This is the second null check to ensure that multiple threads
                do not initialize this instance multiple times.
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
        public static final MyDataSource MY_DATA_SOURCE = new MyDataSource();
    }
}
