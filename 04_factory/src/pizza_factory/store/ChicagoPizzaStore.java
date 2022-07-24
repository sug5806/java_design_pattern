package pizza_factory.store;

import pizza_factory.pizza_style.chicaho.ChicagoStyleCheesePizza;
import pizza_factory.pizza_style.chicaho.ChicagoStyleClamPizza;
import pizza_factory.pizza_style.chicaho.ChicagoStylePepperoniPizza;
import pizza_factory.pizza_style.chicaho.ChicagoStyleVeggiePizza;
import pizza_factory.super_pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
	}
}
