package coffee.decorator;

import coffee.top_class.Beverage;

public class Whip extends coffee.decorator.CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .25;
    }
}
