package test;

import java.util.Comparator;

/**
 * Created by kaganets.s on 27.04.2017.
 */
public final class TestGenerator {

    private static int idCount = 1;

    public static UtilMetod getA() {
        return a;
    }

    private static UtilMetod a = new UtilMetod() ;
    public TestGenerator(UtilMetod a) {
        this.a = a;
    }





    private TestGenerator
            () {
    }


    public static int generateId() {


        idCount = a.getMax(a.getNumberSet1());


        return idCount++;
      // return a.getMax(a.getNumberSet1())+1;
    }
}
