package module10.task2;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            throw new MyException("Hello");
        } catch (MyException e) {
            System.out.println(e.getVariable());
        } finally {
            System.out.println("Finally block");
        }
    }
}
