package pizza_factory.store;

import pizza_factory.PizzaEnum;
import pizza_factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaEnum type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(PizzaEnum type);
}
