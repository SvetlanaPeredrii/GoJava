package module5;



import java.util.Arrays;
import java.util.Date;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Room room = new Room(111, 100, 5, new Date(02-03-2017), "Hayat2", "Ukraine" );
        Room room2 = new Room(222, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine" );
        Room room3 = new Room(333, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        Room room4 = new Room(444, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        Room room5 = new Room(555, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");

        BookingComAPI a = new BookingComAPI();

        System.out.println("Find room BookingComAPI = "+ Arrays.toString(a.findRooms(100,10,"Ukraine","Hayat")));

        GoogleAPI c = new GoogleAPI();

        System.out.println("Find room GoogleAPI = "+Arrays.toString(c.findRooms(250,5,"Ukraine","Hayat2")));

        TripAdvisorAPI d = new TripAdvisorAPI();

        System.out.println("Find room TripAdvisorAPI = "+Arrays.toString(d.findRooms(100,5,"Ukraine","Hayat4")));


        DAOImpl b = new DAOImpl();

        System.out.println("Find ById = "+b.findById(555));
        b.update(room);
        b.save(room4);
        b.delete(room5);

        Controller controller = new Controller();

      controller.requstRooms(100,10,"Ukraine","Hayat");
        System.out.println("Check= "+Arrays.toString(controller.check(new TripAdvisorAPI(),new GoogleAPI())));
        System.out.println("Check= "+Arrays.toString(controller.check(new BookingComAPI(),new GoogleAPI())));
        System.out.println("Check= "+Arrays.toString(controller.check(new TripAdvisorAPI(),new BookingComAPI())));






        System.out.println("room equals room2= "+ room.equals(room2));
        System.out.println("room hashCode room2= "+ (room.hashCode() == room2.hashCode()));

    }
}
