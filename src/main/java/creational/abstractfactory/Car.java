package creational.abstractfactory;

public class Car {

    String location;
    CarType type;

    public Car(String location, CarType type) {
        this.location = location;
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "location='" + location + '\'' +
                ", type=" + type +
                '}';
    }
}
