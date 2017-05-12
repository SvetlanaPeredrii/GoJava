package module5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by kaganets.s on 22.03.2017.
 */
class BookingComAPI implements API {


    private Room[] rooms;


    public BookingComAPI() {

        Room room = new Room(111, 100, 5, new Date(02 - 03 - 2017), "Hayat2", "Ukraine");
        Room room2 = new Room(222, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
        Room room3 = new Room(333, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
        Room room4 = new Room(444, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
        Room room5 = new Room(555, 100, 10, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
        rooms = new Room[]{room, room2, room3, room4, room5};

    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "BookingComAPI= ";
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] array = new Room[rooms.length];
        int count = 0;

        for (int i = 0; i <= rooms.length - 1; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName()) {


                array[count] = rooms[i];
                count++;

            }

        }

        return array;
    }
}