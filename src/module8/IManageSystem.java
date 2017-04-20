package module8;

import java.util.List;
import java.util.Set;

/**
 * Created by kaganets.s on 18.04.2017.
 */
public interface IManageSystem<T> {

    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();
}
