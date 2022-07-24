package pizza_factory.pizza_style.chicaho;

import pizza_factory.super_pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "시카고 스타일 클램 피자";
		dough = "바삭한 도우 ";
		sauce = "토마토 소스";
 
		toppings.add("슈레드 모짜렐라 치즈");
		toppings.add("체서피크 만의 냉동 조개");
	}
 
	public void cut() {
		System.out.println("피자를 네모난 조각으로 자르기");
	}
}
