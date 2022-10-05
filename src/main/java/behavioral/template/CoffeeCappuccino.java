package behavioral.template;

public class CoffeeCappuccino extends CoffeeTemplate {

    @Override
    protected int addMilk() {
        return 1;
    }

    @Override
    protected int addSugar() {
        return 1;
    }
}
