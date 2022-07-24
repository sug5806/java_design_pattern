package pizza_factory.pizza_style.newyork;

import pizza_factory.super_pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "뉴욕 스타일 페퍼로니 피자";
		dough = "씬 크러스트 도우";
		sauce = "마리나라 소스";
 
		toppings.add("잘게 썬 레지아노 치즈");
		toppings.add("슬라이스 페퍼로니");
		toppings.add("마늘");
		toppings.add("양파");
		toppings.add("버섯");
		toppings.add("피망");
	}
}
