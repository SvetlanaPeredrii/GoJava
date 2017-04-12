package module7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by kaganets.s on 12.04.2017.
 */
public class IntegerArrayList1000 {

    public void integerArrayList1000() {


        long startTime = System.currentTimeMillis();
        System.out.println("StartTime= " + startTime);

        List<Integer> integers = new ArrayList<Integer>();
        System.out.println(integers);

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {

            integers.add(random.nextInt(31) - 15);
        }

        System.out.println("Add random= " + integers);

        long timeSpent = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent - startTime) + "ms");


        for (int i = 0; i < 1000; i++) {
            integers.set(i, random.nextInt(31) - 15);
        }
        System.out.println("Set random= " + integers);

        long timeSpent2 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent2 - timeSpent) + "ms");


        for (int i = 0; i < 1000; i++) {
            integers.get(i);
        }
        System.out.println("Get [i]= " + integers);

        long timeSpent3 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent3 - timeSpent2) + "ms");


        Iterator<Integer> it = integers.iterator();


        while (it.hasNext()) {

            it.next();
            it.remove();

        }
        System.out.println("Remove= " + integers);

        long timeSpent4 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent4 - timeSpent3) + "ms");
    }
}
