package pizza_factory;

import pizza_factory.store.ChicagoPizzaStore;
import pizza_factory.store.NYPizzaStore;
import pizza_factory.store.PizzaStore;
import pizza_factory.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaEnum.CHEESE);
        System.out.println("내가 주문한 : " + pizza.getName() + pizza);

        pizza = chicagoStore.orderPizza(PizzaEnum.CHEESE);
        System.out.println("내가 주문한 : " + pizza.getName() + pizza);

        pizza = chicagoStore.orderPizza(PizzaEnum.VEGGIE);
        System.out.println("내가 주문한 : " + pizza.getName() + pizza);
    }
}
