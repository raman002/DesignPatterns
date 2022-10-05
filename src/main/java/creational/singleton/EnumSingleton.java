package creational.singleton;

public enum EnumSingleton {

    MY_DATA_SOURCE(new Object());
   private Object INSTANCE;

    EnumSingleton(Object instance) {
        INSTANCE = instance;
    }
}
