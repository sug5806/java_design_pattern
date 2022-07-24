package game.character;

import game.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        super.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
