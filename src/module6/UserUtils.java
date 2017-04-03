package module6;

/**
 * Created by kaganets.s on 31.03.2017.
 */
public class UserUtils {

//    User[] uniqueUsers(User[] users){
//        for (User user:users
//             ) {
//            if ()
//
//        }
                

   // }

    User[] usersWithContitionalBalance(User[] users, int balance){

        User[] usersWithContitionalBalance = new User[users.length];
        int i = 0;

        for (User user:users
             ) {if(balance==user.getBalance()){

            usersWithContitionalBalance[i] = user;
            i++;
        }

        }

        return usersWithContitionalBalance;
    }

//    User[]  paySalaryToUsers(User[] users){
//
//        User[] paySalaryToUsers = new User[users.length];
//        int i =0;
//
//        for (User user:users
//             ) {
//
//            int balance=paySalaryToUsers[i].getBalance()+paySalaryToUsers[i].getSalary();
//            paySalaryToUsers[i].getBalance()=balance;
//
//            i++;
//
//        }
//
//        return paySalaryToUsers;
//    }
//    long[] getUsersId(User[] users){
//        long[] getUsersId;
//        return getUsersId;
//    }
//    User[] deleteEmptyUsers(User[] users){
//return
//    }
}
