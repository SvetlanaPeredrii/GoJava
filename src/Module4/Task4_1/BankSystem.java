package Module4.Task4_1;

/**
 * Created by kaganets.s on 06.03.2017.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
public class BankSystemImpl implements BankSystem{

    public void withdrawOfUser(User user, int amount) {
       // user.setBalance(123);
       // System.out.println(user.getBalance() -= amount);
    }

    public void fundUser(User user, int amount){

    }
    public void transferMoney(User fromUser, User toUser, int amount){

    }
    public void paySalary(User user){

    }
}