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
        Room room4 = new Room(444, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");
        Room room5 = new Room(555, 100, 5, new Date(02-02-2016), "Hayat", "Ukraine");

        API.BookingComAPI a = new API.BookingComAPI();


        System.out.println("Find room = "+a.findRooms(100,5,"Ukraine","Hayat2"));

//        for(int i = 0; i <= a.getRooms().length  - 1; i++) {
//            System.out.print(a.getRooms()[i].getId() + "  ");
//
//        }


        DAO.DAOImpl b = new DAO.DAOImpl();

        System.out.println("find = "+b.findById(111));
        b.update(room);
        b.save(room2);
        b.delete(room3);





        System.out.println("room equals room2= "+ room.equals(room2));
        System.out.println("room hashCode room2= "+ (room.hashCode() == room2.hashCode()));

    }
}
