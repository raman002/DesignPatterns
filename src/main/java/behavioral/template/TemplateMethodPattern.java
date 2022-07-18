package behavioral.template;

public class TemplateMethodPattern {

    public static void main(String[] args) {
        CoffeeLatte coffeeLatte = new CoffeeLatte();

        coffeeLatte.prepareCoffee();

        CoffeeCappuccino cappuccino = new CoffeeCappuccino();

        cappuccino.prepareCoffee();

        CoffeeEspresso coffeeEspresso = new CoffeeEspresso();

        coffeeEspresso.prepareCoffee();
    }
}
