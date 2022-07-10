import character.Character;
import character.Queen;
import weapon.BowAndArrowBehavior;

public class Main {
    public static void main(String[] args) {
        Character character = new Queen();
        character.fight();

        character.setWeaponBehavior(new BowAndArrowBehavior());
        character.fight();
    }
}
