package module6;

/**
 * Created by kaganets.s on 04.04.2017.
 */
public class CitizenFactory {

    public Citizen createCitizen(String citizen) {
        if (citizen.equals("Englishman")) {
            return new Englishman();
        } else if (citizen.equals("Chinese")) {
            return new Chinese();
        } else if (citizen.equals("Russian")) {
            return new Russian();
        } else if (citizen.equals("Italian")) {
            return new Italian();

        }return null;
    }

    public static final class Englishman implements Citizen {

        @Override
        public void sayHello() {

            System.out.println("Hello");
        }


    }
    public static final class Chinese implements Citizen{

        @Override
        public void sayHello() {
            System.out.println("嗨");

        }
    }
    public static final class Russian implements Citizen{

        @Override
        public void sayHello() {
            System.out.println("Привет");

        }
    }
    public static final class Italian implements Citizen{

        @Override
        public void sayHello() {
            System.out.println("Ciao");

        }
    }
}
