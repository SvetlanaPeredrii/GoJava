package module6;

/**
 * Created by kaganets.s on 04.04.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {


        Citizen englishman = CitizenFactory.createEnglishman();
        englishman.sayHello();
        Citizen chinese = CitizenFactory.createChinese();
        chinese.sayHello();
        Citizen russian = CitizenFactory.createRussian();
        russian.sayHello();
        Citizen italian = CitizenFactory.createItalian();
        italian.sayHello();




    }
}

