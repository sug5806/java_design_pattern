package pizza_factory.store;

import pizza_factory.PizzaEnum;
import pizza_factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import pizza_factory.ingredient.ingredient_interface.PizzaIngredientFactory;
import pizza_factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(PizzaEnum item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 치즈피자");
                return pizza;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 베지피자");
                return pizza;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 조개피자");
                return pizza;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 페퍼로니피자");
                return pizza;
            default:
                return null;
        }
	}
}
