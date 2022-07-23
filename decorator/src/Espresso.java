import top_class.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public double cost() {
        return .50;
    }
}
