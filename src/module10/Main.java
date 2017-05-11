package module10;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        try {
            throw new Exception("Message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }

    }
}
