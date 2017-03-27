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


    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] request = new Room[15];

        for (int i = 0; i <= apis.length - 1; i++) {

           System.out.println("Controller - "+apis[i]+Arrays.toString(request=apis[i].findRooms(price, persons, city, hotel)));

        }
        return request;

    }

    public Room[] check(API api1, API api2) {

        Room[] check = new Room[15];

        int count = 0;

        for ( Room room_api1 : api1.getRooms()){
            for(Room room_api2 : api2.getRooms())
              {
                  if(room_api1.equals(room_api2)){
                      check[count] =  room_api1;
                      count++;
                  }
              }
    }
        System.out.println("Count= "+count);
        return check;
}


}
