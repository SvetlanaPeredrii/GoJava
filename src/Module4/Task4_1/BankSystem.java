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
class BankSystemImpl implements BankSystem{

    public void withdrawOfUser(User user, int amount) {

        if (amount<=user.getBank().getLimitOfWithdrawal()&& amount<=user.getBalance() ){

        user.setBalance(user.getBalance()-(amount*user.getBank().getCommission(amount)/100+amount));
        System.out.println(user.getName()+"  Balance after withdrawing= "+user.getBalance());}
        else System.out.println("Withdrawal limit is exceeded");

    }

    public void fundUser(User user, int amount){

        if (amount<=user.getBank().getLimitOfFunding()){

            user.setBalance(user.getBalance()+amount);
            System.out.println(user.getName()+"  Balance after funding= "+user.getBalance());}
        else System.out.println("Funding limit is exceeded");

            }
    public void transferMoney(User fromUser, User toUser, int amount){

        if (amount<=fromUser.getBank().getLimitOfWithdrawal()&& amount<=fromUser.getBalance() && amount<=toUser.getBank().getLimitOfFunding()){
            fromUser.setBalance(fromUser.getBalance()-amount);
            System.out.println(fromUser.getName()+" Balance after transfering= "+fromUser.getBalance());
            toUser.setBalance(toUser.getBalance()+amount);
            System.out.println(toUser.getName()+"  Balance after transfering= "+toUser.getBalance());
            }
        else System.out.println("Transfer of money is not possible");


    }
    public void paySalary(User user){
        user.setBalance(user.getBalance()+user.getSalary());
        System.out.println(user.getName()+"  Balance after getting salary= "+user.getBalance());

    }
}