package module5;

import java.util.Arrays;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public class Controller {

    API apis[] = new API[2];

    public Controller() {

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new BookingComAPI();

        apis = new API[]{api1,api2,api3};

//        apis[0] = new GoogleAPI();
//        apis[1] = new TripAdvisorAPI();
//        apis[2] = new BookingComAPI();

    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] request = new Room[2];

        for (int i = 0; i <= apis.length - 1; i++) {

            System.out.println("Contr= " + Arrays.toString(apis[i].findRooms(price, persons, city, hotel)));

        }
        return request;

    }

    public Room[] check(API api1, API api2) {

     //api1.findRooms()==api2.findRooms();


        return new Room[0];
    }


    public API[] getApis() {
        return apis;
    }
}
