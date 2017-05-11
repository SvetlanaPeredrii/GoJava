package module10.task4;
import module10.task2.MyException;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class MyClass {

    public void g () throws MyException {
        throw new MyException("Hello");
    }

    public void f () throws MyException2 {
        try {
            g();
        } catch (MyException e) {
            throw new MyException2();
        }
    }
}
