package pizza_factory.store;

import pizza_factory.PizzaEnum;
import pizza_factory.pizza_style.chicaho.ChicagoStyleCheesePizza;
import pizza_factory.pizza_style.chicaho.ChicagoStyleClamPizza;
import pizza_factory.pizza_style.chicaho.ChicagoStylePepperoniPizza;
import pizza_factory.pizza_style.chicaho.ChicagoStyleVeggiePizza;
import pizza_factory.super_pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(PizzaEnum item) {
        switch (item) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
	}
}
