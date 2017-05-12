package Module3.Task3_4;

/**
 * Created by kaganets.s on 24.02.2017.
 */
public class UseUser {
    public static void main(String[] args) {


        User user1 = new User("Petya", 5000, 6, "Apple", 2000, "$");

        user1.paySalary();

        System.out.println("Balance after withdraw = " + user1.withdraw(4999));

        user1.companyNameLenght();
        
        System.out.println("monthIncreaser = " + user1.monthIncreaser(4));


    }


}
