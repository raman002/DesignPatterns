package creational.abstractfactory;

import java.util.TimeZone;

public abstract class CarManufacturingFactory {

    static Car manufactureCar(CarType cartType) {
        String location = TimeZone.getDefault().getDisplayName().toUpperCase();

        CarFactory carFactory = null;

        if (location.contains("india".toUpperCase())) {
            carFactory = new IndianCarFactory();
        } else if (location.contains("china".toUpperCase())) {
            carFactory = new ChineseCarFactory();
        }
        return carFactory.buildCar(cartType);
    }
}
