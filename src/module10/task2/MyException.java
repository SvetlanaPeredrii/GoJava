package module10.task2;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class MyException extends Exception {
    private final String variable;


    public MyException(String ref) {
        super(ref);
        this.variable = ref;
    }

    public String getVariable() {
        return variable;
    }
}
