package module10.task5;


/**
 * Created by kaganets.s on 11.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        try {
            myClass.someMethod(-6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
