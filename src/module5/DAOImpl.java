package module5;

import java.util.Date;

/**
 * Created by kaganets.s on 22.03.2017.
 */
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

        System.out.println("findById");


        return null;
    }
}
