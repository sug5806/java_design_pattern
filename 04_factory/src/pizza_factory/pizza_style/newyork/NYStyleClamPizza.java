package pizza_factory.pizza_style.newyork;

import pizza_factory.super_pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "뉴욕 스타일 클램 피자";
		dough = "씬 크러스트 도우";
		sauce = "마리나라 소스";
 
		toppings.add("잘게 썬 레지아노 치즈");
		toppings.add("롱 아일랜드 만의 신선한 조개");
	}
}
