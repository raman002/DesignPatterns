package creational.abstractfactory;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        Car car = CarManufacturingFactory.manufactureCar(CarType.SPORTS);

        System.out.println(car);
    }
}
