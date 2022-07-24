package pizza_factory.store;

import pizza_factory.PizzaEnum;
import pizza_factory.ingredient.ingredient_interface.PizzaIngredientFactory;
import pizza_factory.ingredient.newYork.NYPizzaIngredientFactory;
import pizza_factory.pizza.*;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(PizzaEnum item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 치즈 피자");
                return pizza;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 베지 피자");
                return pizza;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 조개 피자");
                return pizza;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 ㅅ타일 페퍼로니 피자");
                return pizza;
            default:
                return null;
        }
	}
}
