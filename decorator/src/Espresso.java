import top_class.Beverage;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.setSize(size);
    }

    public Espresso() {
        this.setSize(Size.TALL);
    }

    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public double cost() {
        switch (this.getSize()) {
            case TALL : return .5;
            case GRANDE : return .6;
            case VENTI : return .7;
        };

        return 1111.0;
    }
}
