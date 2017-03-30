package module6;

/**
 * Created by kaganets.s on 30.03.2017.
 */
public final class User {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }


}
