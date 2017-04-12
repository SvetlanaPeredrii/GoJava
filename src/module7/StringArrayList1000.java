package module7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kaganets.s on 12.04.2017.
 */
public class StringArrayList1000 {

    public void stringArrayList1000() {

        long startTime = System.currentTimeMillis();
        System.out.println("StartTime= " + startTime);

        List<String> strings = new ArrayList<String>();
        System.out.println(strings);

        RandomString str = new RandomString();

        for (int i = 0; i < 1000; i++) {

            strings.add(str.givenRandomString());
        }

        System.out.println("Add random= " + strings);

        long timeSpent = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent - startTime) + "ms");


        for (int i = 0; i < 1000; i++) {
            strings.set(i, str.givenRandomString());
        }
        System.out.println("Set random= " + strings);

        long timeSpent2 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent2 - timeSpent) + "ms");


        for (int i = 0; i < 1000; i++) {
            strings.get(i);
        }
        System.out.println("Get [i]= " + strings);

        long timeSpent3 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent3 - timeSpent2) + "ms");


        Iterator<String> st = strings.iterator();


        while (st.hasNext()) {

            st.next();
            st.remove();

        }
        System.out.println("Remove= " + strings);

        long timeSpent4 = System.currentTimeMillis();
        System.out.println("Timer= " + (timeSpent4 - timeSpent3) + "ms");

    }
}
