package pizza_factory.store;

import pizza_factory.PizzaEnum;
import pizza_factory.pizza_style.newyork.NYStyleCheesePizza;
import pizza_factory.pizza_style.newyork.NYStyleClamPizza;
import pizza_factory.pizza_style.newyork.NYStylePepperoniPizza;
import pizza_factory.pizza_style.newyork.NYStyleVeggiePizza;
import pizza_factory.super_pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(PizzaEnum item) {
        switch (item) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            case CLAM:
                return new NYStyleClamPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
	}
}
