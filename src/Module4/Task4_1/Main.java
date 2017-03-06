package Module4.Task4_1;

import static Module4.Task4_1.Currency.*;


/**
 * Created by kaganets.s on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User(111, "Sasha", 45000.56, 4, "Apple", 1000, new USBank() );

        User user2 = new User(222, "Katya", 1200.20, 12, "Vitamin", 2000, new USBank());

        User user3 = new User(333, "Anton", 1250.76, 28, "Avon", 500, new EUBank());

        User user4 = new User(444, "Ira", 00.10, 1, "Eva", 100, new EUBank());

        User user5 = new User(555, "Vanya", 1456.23, 36, "Eko", 300, new ChinaBank());

        User user6 = new User(666, "Valya", 999.99, 56, "Prod", 1500, new ChinaBank());



        System.out.println("User1= "+user1.getBalance());
        user1.getBalance();
        System.out.println("User2= "+user2.getBank());
        System.out.println("User3= "+user3.getBank());
        System.out.println("User4= "+user4.getBank());
        System.out.println("User5= "+user5.getBank());
        System.out.println("User6= "+user6.getBank());



//        USBank user10 = new USBank(12312, "cghh", EUR, 3, 25000, 2323,12);
//
//        System.out.println("Limit= "+ user1.getLimitOfWithdrawal());
//        System.out.println("Funding= "+ user1.getLimitOfFunding());
//        System.out.println("Commission= "+ user1.getCommission( 1000));
//
//        Bank bank = new USBank();
//        Currency currency = USD;
//
//        User user20 = new User(123, "Vasya", 123456.56, 6, "Apple", 2000, bank);
//
//        user20.setBank(new USBank());
//        user2.getBank().setCurrency(USD);
//
//        System.out.println("Limit= "+ user2.getBank().getLimitOfWithdrawal());
//
//        // user2.setBank(new ChinaBank());
//        user2.getBank();
//        System.out.println("Bank= "+user2.getBank());
//        // System.out.println("Limit= "+ user2.getLimitOfWithdrawal());



    }
}
