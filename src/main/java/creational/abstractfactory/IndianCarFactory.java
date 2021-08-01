package creational.abstractfactory;

public class IndianCarFactory implements CarFactory {

    @Override
    public Car buildCar(CarType cartType) {
        return switch (cartType) {
            case SEDAN -> new Car( "INDIA", CarType.SEDAN);
            case SPORTS -> new Car( "INDIA", CarType.SPORTS);
            case SUV -> new Car( "INDIA", CarType.SUV);
        };
    }
}
