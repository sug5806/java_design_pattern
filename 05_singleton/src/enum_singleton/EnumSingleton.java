package enum_singleton;

public class EnumSingleton {
    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.UNIQUE_INSTANCE;

        System.out.println(uniqueInstance.asdf);
    }
}
