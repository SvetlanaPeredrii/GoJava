package module8;


/**
 * Created by kaganets.s on 18.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        Food food1 = new Food("Chocolate", Country.POLAND, 365);
        Food food2 = new Food("Spaghetti", Country.ITALY, 180);
        Food food3 = new Food("Cheese", Country.FRANCE, 365);
        Food food4 = new Food("Wine", Country.GERMANY, 1095);
        Food food5 = new Food("Potato", Country.POLAND, 90);
        Food food6 = new Food("Oil", Country.ITALY, 365);
        Food food7 = new Food("Salo", Country.UKRAINE, 30);


        IManageSystem im = new IManageSystemImpl();

        im.save(food1, 50);
        im.save(food2, 100);
        im.save(food3, 240.5);
        im.save(food4, 123.45);
        im.save(food5);
        im.save(food6);
        im.save(food7);
        System.out.println("Database= " + im);
        System.out.println("Get products=" + im.getProducts());
        System.out.println("Get prices=" + im.getPrices());
        im.delete(food7);
        im.deleteById(4);
        System.out.println("Find id= " + im.get(1));
        System.out.println("Get price= " + im.getPrice(food3));
        System.out.println("Database after changes= " + im);
    }
}

