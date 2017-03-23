package module5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by kaganets.s on 22.03.2017.
 */
class GoogleAPI implements API{


    Room[] rooms;



    public GoogleAPI() {
        Room room = new Room(111, 100, 5, new Date(02-03-2017), "Hayat2", "Ukraine" );
        Room room2 = new Room(222, 250, 5, new Date(02-02-2016), "Hayat", "Ukraine" );
        Room room3 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        Room room4 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        Room room5 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        rooms = new Room[]{room, room2, room3, room4, room5};
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room [] array = new Room[rooms.length];


        for (int i = 0; i <= rooms.length - 1; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName()) {

                array[i]=rooms[i];

            }

        }
       // System.out.println("GoogleAPI = "+ Arrays.toString(array));
        return array;
    }

    @Override
    public String toString() {
        return "GoogleAPI= ";
    }
}