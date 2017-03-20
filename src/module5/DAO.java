package module5;


import java.util.Date;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    class DAOImpl implements DAO {


        @Override
        public Room save(Room room) {

            System.out.println("save= "+room);

            return room;
        }

        @Override
        public boolean delete(Room room) {
            System.out.println("delete= "+room);

            return true;
        }

        @Override
        public Room update(Room room) {

            System.out.println("update= "+room);
            return room;
        }

        @Override
        public Room findById(long id) {

            Room room = new Room(333, 100, 5, new Date(02 - 03 - 2017), "Hayat2", "Ukraine");
            Room room2 = new Room(222, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
            Room room3 = new Room(111, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
            Room room4 = new Room(222, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
            Room room5 = new Room(555, 100, 5, new Date(02 - 02 - 2016), "Hayat", "Ukraine");
            Room[] rooms = new Room[]{room, room2, room3, room4, room5};

            for (int i = 0; i <= rooms.length - 1; i++) {
                if (id == rooms[i].getId()) {

                    return rooms[i];
                }
            }


            return null;
        }
    }
}