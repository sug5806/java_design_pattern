package game.weapon;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("검을 사용합니다.");
    }
}
