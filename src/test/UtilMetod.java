package test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kaganets.s on 27.04.2017.
 */
public class UtilMetod {
    private Set<Number> numberSet1 = new HashSet<>();

    public Set<Number> getNumberSet1() {
        return numberSet1;
    }

    public  Set<Number> addnumber(Number a) {


        numberSet1.add(a);
        System.out.println("hjkj" + numberSet1);

        return numberSet1;
    }
    public  int getMax(Set<Number> a) {
        Number maxNumber1 = a.stream()
                .max(Comparator.comparingInt(Number::getId))
                .get();
        System.out.println("max=" + maxNumber1.getId());
        int b = maxNumber1.getId();


       return b;
    }
}
