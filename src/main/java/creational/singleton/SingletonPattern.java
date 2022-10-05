package creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        MyDataSource instance1 = MyDataSource.getInstance();
        MyDataSource threadSafeInstance = MyDataSource.getThreadSafeInstance();

        /* This approach is the most efficient of all since the dataSource object will be initialized as
        soon as the static block is executed, now it doesn't matter how many threads are calling
        */
        MyDataSource instanceViaStaticBlock = MyDataSource.getInstanceViaStaticBlock();

        MyDataSource instanceViaStaticClass = MyDataSource.getInstanceViaStaticClass();

        final var myDataSource = EnumSingleton.MY_DATA_SOURCE;
        System.out.println("Enum Singleton Datasource: " + myDataSource);
    }
}
