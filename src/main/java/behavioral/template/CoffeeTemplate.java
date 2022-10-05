package behavioral.template;

public abstract class CoffeeTemplate {

    private int water;
    private int milk;
    private int sugar;
    private int beans;
    private int flavor;

    public final void prepareCoffee() {
        //int flavor = addWater() + addSugar() + addMilk();
        int flavor = this.water + this.sugar  + this.milk;

        if (flavor == 0) {
            System.out.println("Espresso Prepared!");
        } else if (flavor > 0 && flavor < 3) {
            System.out.println("Cappuccino Prepared!");
        } else if (flavor > 3) {
            System.out.println("Latte Prepared!");
        }

    }

    protected int addWater() {
      return this.water;
    }

    protected int addSugar() {
        return this.sugar;
    }

    protected int addMilk() {
        return this.milk;
    }
}
