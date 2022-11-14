package Classes;

public class JournalisationSingleton {
    private static JournalisationSingleton instance = new JournalisationSingleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private JournalisationSingleton(){}

    //Get the only object available
    public static JournalisationSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
