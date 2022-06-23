package creational.singleton;

import java.sql.Time;

public class SingletonInitializationMultithreadedSimulation {

    public static void main(String[] args) {
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();
        new Thread(MyDataSource::getInstance).start();

        /*  after executing the above logic multiple times I found out that the singleton instance could
            be initialized by multiple threads at the same Time, so to avoid this, use a thread safe singleton
            logic, for ex. MyDataSource.getThreadSafeSingleton().

            output:

            dataSource = creational.singleton.MyDataSource@5975d5ae
            dataSource = creational.singleton.MyDataSource@470daf91
        */
    }
}
