package module10.task3;

import module9.User;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class Main {

    public static void main(String[] args) {

            User user = null;

            try {
                user.getBalance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
}
