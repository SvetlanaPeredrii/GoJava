package module5;

import java.util.Date;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public interface API {


    Room[] findRooms(int price, int persons, String city, String hotel);


    class BookingComAPI implements API{
        Room[] rooms;

        public BookingComAPI() {

            Room room = new Room(111, 100, 5, new Date(02-03-2017), "Hayat2", "Ukraine" );
            Room room2 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine" );

          rooms = new Room[]{room, room2};

        }

        @Override
        public Room[] findRooms(int price, int persons, String city, String hotel) {
            return new Room[0];
        }
    }

    class TripAdvisorAPI implements API{

        @Override
        public Room[] findRooms(int price, int persons, String city, String hotel) {
            return new Room[0];
        }
    }

    class GoogleAPI implements API{

        @Override
        public Room[] findRooms(int price, int persons, String city, String hotel) {
            return new Room[0];
        }
    }

}
