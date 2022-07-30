package new_singleton;

public class NewSingleton {
    public volatile static NewSingleton newSingleton;

    private NewSingleton() {};

    public NewSingleton getInstance() {
        if (newSingleton == null) {
            synchronized (NewSingleton.class){
                if(newSingleton == null) {
                    newSingleton = new NewSingleton();
                }
            }
        }

        return newSingleton;
    }
}
