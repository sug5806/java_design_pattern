package game.weapon;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("단도를 사용합니다.");
    }
}
