package pizza_factory.pizza;

import pizza_factory.ingredient.ingredient_interface.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n")
                .append(Arrays.toString(veggies) + "\n")
                .append(cheese + "\n")
                .append(pepperoni + "\n")
                .append(clam + "\n");
        return display.toString();
    }
}
