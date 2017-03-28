package module6;

import java.util.Arrays;

/**
 * Created by kaganets.s on 28.03.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {

        int[] array = {12, 253,-100,2000, 507, 3200,-5,8};
        ArraysUtils.max(array);
        ArraysUtils.min(array);
        ArraysUtils.maxPositive(array);
        ArraysUtils.modulus(array);
        ArraysUtils.multiplication(array);
        ArraysUtils.sum(array);
        ArraysUtils.secondLargest(array);
        ArraysUtils.reverse(array);
        ArraysUtils.findEvenElements(array);


    }
}

