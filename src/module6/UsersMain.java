package module6;

import java.util.Arrays;

/**
 * Created by kaganets.s on 31.03.2017.
 */
public class UsersMain {
    public static void main(String[] args) {

        User user = new User(111, "Svetlana", "Kahanets", 5000, 1500);
        User user2 = new User(222, "Ira", "Bodrova", 12345, 0);
        User user3 = new User(333, "Dima", "Petrov", 500, 5500);
        User user4 = new User(444, "Yulya", "Vasina", 236, 563);
        User user5 = new User(111, "Svetlana", "Kahanets", 5000, 1500);
        User[] users = {user,user2,null,user3,user4,user5,null};

        UserUtils a = new UserUtils();
        System.out.println("uniqueUsers= "+ Arrays.toString(a.uniqueUsers(users)));
        System.out.println("usersWithContitionalBalance= "+ Arrays.toString(a.usersWithContitionalBalance(users,1500)));
        System.out.println("salary= "+ Arrays.toString(a.paySalaryToUsers(users)));
        System.out.println("UsersId= "+ Arrays.toString(a.getUsersId(users)));
        System.out.println("deleteEmptyUsers= "+ Arrays.toString(a.deleteEmptyUsers(users)));




    }
}
