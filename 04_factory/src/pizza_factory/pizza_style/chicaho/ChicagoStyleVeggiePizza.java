package pizza_factory.pizza_style.chicaho;

import pizza_factory.super_pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "시카고 딥디쉬 베지 피자";
		dough = "매우 두꺼운 크러스트 반죽";
		sauce = "플럼 토마토 소스";
 
		toppings.add("슈레드 모짜렐라 치즈");
		toppings.add("블랙 올리브");
		toppings.add("시금치");
		toppings.add("가지");
	}
 
	public void cut() {
		System.out.println("피자를 네모난 조각으로 자르기");
	}
}
