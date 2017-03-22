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


}