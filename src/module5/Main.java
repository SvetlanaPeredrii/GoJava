package module5;


import java.util.Date;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Room room = new Room(111, 100, 5, new Date(02-03-2017), "Hayat2", "Ukraine" );
        Room room2 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine" );
Room room3 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        API.BookingComAPI a = new API.BookingComAPI();
      


        System.out.println("room equals room2 "+ room.equals(room2));
        System.out.println("room hashCode room2 "+ (room.hashCode() == room2.hashCode()));

    }
}
