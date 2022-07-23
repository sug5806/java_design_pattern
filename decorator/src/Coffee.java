import decorator.Mocha;
import decorator.Whip;
import top_class.Beverage;

public class Coffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        Beverage doubleMocha = new Espresso(Beverage.Size.GRANDE);
        doubleMocha = new Mocha(doubleMocha);
        doubleMocha = new Mocha(doubleMocha);
        doubleMocha = new Whip(doubleMocha);
        System.out.println(doubleMocha.getDescription());
        System.out.println(doubleMocha.cost());

    }
}
