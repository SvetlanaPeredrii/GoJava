package module8;

import java.util.*;

/**
 * Created by kaganets.s on 18.04.2017.
 */
public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database;

    public IManageSystemImpl() {
        this.database = new HashMap<>();
    }

    @Override
    public String toString() {
        return "IManageSystemImpl{" +
                "database=" + database +
                '}';
    }

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);

        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, getPrice(obj));
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        Iterator<Food> iter = database.keySet().iterator();

        while (iter.hasNext()) {
            Food key = iter.next();
            if (key.getId() == id) {

                iter.remove();

            }

        }

    }

    @Override
    public Food get(int id) {

        Iterator<Food> iter = database.keySet().iterator();

        while (iter.hasNext()) {
            Food key = iter.next();
            if (key.getId() == id) {

                return key;

            }
        }

        return null;
    }

    @Override
    public Double getPrice(Food obj) {


        return database.get(obj);
    }

    @Override
    public Set getProducts() {

        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {

        List<Double> list = new LinkedList<>();

        for (Double value : database.values()) {

            list.add(value);

        }

        return list;
    }
}
