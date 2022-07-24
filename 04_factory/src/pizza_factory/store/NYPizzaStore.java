package pizza_factory.store;

import pizza_factory.pizza_style.newyork.NYStyleCheesePizza;
import pizza_factory.pizza_style.newyork.NYStyleClamPizza;
import pizza_factory.pizza_style.newyork.NYStylePepperoniPizza;
import pizza_factory.pizza_style.newyork.NYStyleVeggiePizza;
import pizza_factory.super_pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
	}
}
