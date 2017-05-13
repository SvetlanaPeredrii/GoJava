package module5;

import java.util.Arrays;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public class Controller {

    private API apis[];

    public Controller() {

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new BookingComAPI();

        apis = new API[]{api1, api2, api3};


    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        int a = apis[0].findRooms(price, persons, city, hotel).length;
        int b = apis[1].findRooms(price, persons, city, hotel).length;
        int c = apis[2].findRooms(price, persons, city, hotel).length;

        Room[] request = new Room[a + b + c];


        System.arraycopy(apis[0].findRooms(price, persons, city, hotel), 0, request, 0, a);
        System.arraycopy(apis[1].findRooms(price, persons, city, hotel), 0, request, a, b);
        System.arraycopy(apis[2].findRooms(price, persons, city, hotel), 0, request, a + b, c);


        for (int i = 0; i <= request.length - 1; i++)
            if (request[i] != null) {
                System.out.println("Controller request = " + request[i]);
            }
        return request;

    }

    public Room[] check(API api1, API api2) {

        Room[] check = new Room[15];

        int count = 0;

        for (Room room_api1 : api1.getRooms()) {
            for (Room room_api2 : api2.getRooms()) {
                if (room_api1.equals(room_api2)) {
                    check[count] = room_api1;
                    count++;
                }
            }
        }
        System.out.println("Count= " + count);
        return check;
    }


}
