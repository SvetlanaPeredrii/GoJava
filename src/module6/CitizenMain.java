package module6;

/**
 * Created by kaganets.s on 04.04.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {

        CitizenFactory x = new CitizenFactory();
        x.createCitizen("Englishman").sayHello();
        x.createCitizen("Chinese").sayHello();
        x.createCitizen("Russian").sayHello();
        x.createCitizen("Italian").sayHello();


    }
}

