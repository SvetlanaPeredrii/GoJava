package module8;



/**
 * Created by kaganets.s on 18.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(IdGenerator.generateId());
        System.out.println(IdGenerator.generateId());
        Food a = new Food("df",Country.POLAND, 2);
        Food b = new Food("df",Country.ITALY, 1);
        Food c = new Food("df",Country.FRANCE, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

