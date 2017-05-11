package module10.task4;
import module10.task2.MyException;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        try {
            myClass.g();
        } catch (MyException e) {
            e.printStackTrace();
        }

        try {
            myClass.f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }
    }
}
