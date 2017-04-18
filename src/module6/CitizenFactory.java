package module6;

/**
 * Created by kaganets.s on 04.04.2017.
 */
public class CitizenFactory {


    public static Citizen createEnglishman() {


        return new Englishman();
    }

    public static Citizen createChinese() {


        return new Chinese();
    }

    public static Citizen createRussian() {


        return new Russian();
    }

    public static Citizen createItalian() {


        return new Italian();
    }

    private static final class Englishman implements Citizen {

        @Override
        public void sayHello() {

            System.out.println("Hello");
        }
    }

    private static final class Chinese implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("嗨");

        }
    }

    private static final class Russian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Привет");

        }
    }

    private static final class Italian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Ciao");

        }
    }
}
