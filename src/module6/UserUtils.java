package module6;

/**
 * Created by kaganets.s on 31.03.2017.
 */
public class UserUtils {

    User[] uniqueUsers(User[] users){

    User [] uniqueUsers = new User[users.length];
        int i = 0;

//        for (User user:users
//             ) {
//            if (user != null) {
//                uniqueUsers[i] = user;
//                i++;
//            }
//        }
        for (User user1 : users
                        ) {
            if (user1 != null) {
                for (User user2 : users
                     ) {
                    if (user2 != null) {

                        if (user2.equals(user1)) {

                            uniqueUsers[i] = user1;
                            i++;

                        }
                    }
            }
        }
        }

        return uniqueUsers;
    }

    User[] usersWithContitionalBalance(User[] users, int balance){

        User[] usersWithContitionalBalance = new User[users.length];
        int i = 0;

        for (User user:users

             ) {
            if (user != null) {
                if (balance == user.getBalance()) {

                    usersWithContitionalBalance[i] = user;
                    i++;
                }
            }else i++;
        }
        return usersWithContitionalBalance;
    }

    User[]  paySalaryToUsers(User[] users){

        User[] paySalaryToUsers = new User[users.length];

        int i =0;

        for (User user:users
             ) {
            if(users[i]!=null) {
                paySalaryToUsers[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getBalance() + users[i].getSalary());

                i++;
            }
            else i++;
        }

        return paySalaryToUsers;
    }
    long[] getUsersId(User[] users){
        long[] getUsersId = new long[users.length];
        int i = 0;
        for (User user:users
                ) {
            if(users[i]!=null) {

                getUsersId[i] = user.getId();

                i++;
           }
        else i++;
        }

        return getUsersId;
    }


    User[] deleteEmptyUsers(User[] users){

        int nullCount = 0;

        for (User user:users
                ) {
            if(user==null) {

                nullCount++;

            }
        }
        int newLength = users.length - nullCount;

        User[] deleteEmptyUsers = new User[newLength];

        int iterator = 0;


        for (User user:users
                ) {
            if (user != null) {
                deleteEmptyUsers[iterator] = user;
                iterator++;
            }
        }

return deleteEmptyUsers;
    }
}
