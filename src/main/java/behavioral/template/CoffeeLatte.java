package behavioral.template;

public class CoffeeLatte extends CoffeeTemplate {

    @Override
    protected int addMilk() {
        return 2;
    }

    @Override
    protected int addSugar() {
        return 2;
    }
}
