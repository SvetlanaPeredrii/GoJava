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

        Room[] request = new Room[apis[0].findRooms(price, persons, city, hotel).length
                + apis[1].findRooms(price, persons, city, hotel).length
                + apis[2].findRooms(price, persons, city, hotel).length];


        // for (int i = 0; i <= apis.length - 1; i++) {


        System.arraycopy(apis[0].findRooms(price, persons, city, hotel), 0, request, 0, apis[0].findRooms(price, persons, city, hotel).length);
        System.arraycopy(apis[1].findRooms(price, persons, city, hotel), 0, request, apis[0].findRooms(price, persons, city, hotel).length, apis[1].findRooms(price, persons, city, hotel).length);
        System.arraycopy(apis[2].findRooms(price, persons, city, hotel), 0, request, apis[0].findRooms(price, persons, city, hotel).length+apis[1].findRooms(price, persons, city, hotel).length, apis[2].findRooms(price, persons, city, hotel).length);

        //System.out.println("Controller - "+apis[i]+Arrays.toString(request=apis[i].findRooms(price, persons, city, hotel)));

        System.out.println("Controller request = " + Arrays.toString(request));
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
