package creational.abstractfactory;

public class ChineseCarFactory implements CarFactory {

    @Override
    public Car buildCar(CarType cartType) {
        return switch (cartType) {
            case SEDAN -> new Car( "CHINA", CarType.SEDAN);
            case SPORTS -> new Car( "CHINA", CarType.SPORTS);
            case SUV -> new Car( "CHINA", CarType.SUV);
        };
    }
}
