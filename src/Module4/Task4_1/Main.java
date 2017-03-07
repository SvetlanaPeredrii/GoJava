package Module4.Task4_1;

import static Module4.Task4_1.Currency.*;


/**
 * Created by kaganets.s on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User(111, "Sasha", 45000.56, 4, "Apple", 3000, new USBank(123, "USA", USD, 800, 1500, 2, 10000000));

        User user2 = new User(222, "Katya", 1300, 12, "Vitamin", 2000, new USBank(124, "USA", EUR, 800, 1500, 2, 10000000));

        User user3 = new User(333, "Anton", 1250.76, 28, "Avon", 500, new EUBank(123, "Europe", USD, 1500, 2500, 1, 50000000));

        User user4 = new User(444, "Ira", 00.10, 1, "Eva", 100, new EUBank(123, "Europe", EUR, 1500, 2500, 1, 50000000));

        User user5 = new User(555, "Vanya", 1456.23, 36, "Eko", 300, new ChinaBank(123, "China", USD, 2000, 500, 3, 100000));

        User user6 = new User(666, "Valya", 999.99, 56, "Prod", 1500, new ChinaBank(123, "China", EUR, 2000, 500, 3, 100000));


        System.out.println(user1.getName() + "  Balance= " + user1.getBalance());

        BankSystemImpl a = new BankSystemImpl();


        a.withdrawOfUser(user1, 1200);

        a.fundUser(user1, 100);

        a.transferMoney(user1, user2, 1000);

        a.paySalary(user1);

        System.out.println(user2.getName() + "  Balance= " + user2.getBalance());

        a.withdrawOfUser(user2, 1100);

        a.fundUser(user2, 100);

        a.transferMoney(user2, user1, 1000);

        a.paySalary(user2);

        System.out.println(user3.getName() + "  Balance= " + user3.getBalance());

        a.withdrawOfUser(user3, 700);

        a.fundUser(user3, 1500);

        a.transferMoney(user3, user2, 1000);

        a.paySalary(user3);

        System.out.println(user4.getName() + "  Balance= " + user4.getBalance());

        a.withdrawOfUser(user4, 1);

        a.fundUser(user4, 1250);

        a.transferMoney(user4, user3, 500);

        a.paySalary(user4);

        System.out.println(user5.getName() + "  Balance= " + user5.getBalance());

        a.withdrawOfUser(user5, 1200);

        a.fundUser(user5, 250);

        a.transferMoney(user5, user4, 555);

        a.paySalary(user5);

        System.out.println(user6.getName() + "  Balance= " + user6.getBalance());

        a.withdrawOfUser(user6, 1200);

        a.fundUser(user6, 5000);

        a.transferMoney(user6, user5, 50000);

        a.paySalary(user6);


    }


}
