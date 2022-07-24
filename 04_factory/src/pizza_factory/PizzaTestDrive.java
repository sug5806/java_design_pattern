package pizza_factory;

import pizza_factory.store.ChicagoPizzaStore;
import pizza_factory.store.NYPizzaStore;
import pizza_factory.store.PizzaStore;
import pizza_factory.super_pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("내가 주문한 : " + pizza.getName() + pizza.toString());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("내가 주문한 : " + pizza.getName() + pizza.toString());
    }
}
