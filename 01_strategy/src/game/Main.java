package game;

import game.character.Character;
import game.character.Queen;
import game.weapon.BowAndArrowBehavior;

public class Main {
    public static void main(String[] args) {
        Character character = new Queen();
        character.fight();

        character.setWeaponBehavior(new BowAndArrowBehavior());
        character.fight();
    }
}
