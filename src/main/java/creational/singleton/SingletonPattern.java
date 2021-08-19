package creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        MyDataSource instance1 = MyDataSource.getInstance();
        MyDataSource instance2 = MyDataSource.getInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}
