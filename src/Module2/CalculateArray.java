package Module2;

public class CalculateArray {

    public static void main(String[] args) {

        int[] array = {500, 9000, 7500, 234, 4534, 9985, 100, 3443, 5000, 4600};
        double[] array2 = {500.5, -9000.7, -7500, 234.89, -4534.987, 9985.01, 100, -3443.234, 5000.98, 460.007};
        sum(array);
        sum(array2);
        min(array);
        min(array2);
        max(array);
        max(array2);
    }


    private static void sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
          System.out.println("sum array = " + sum);
       // return sum;

    }
    private static void sum(double[] array2) {
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("sum array2 = " + sum);
        // return sum;

    }

    private static void min(int[] array) {

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index=i;
            }

        }
        System.out.println("min " + "array[" + index + "] = " + min);
        // return min;


    }
    private static void min(double[] array2) {

        double min = array2[0];
        int index = 0;

        for (int i = 1; i < array2.length; i++) {
            if (min > array2[i]) {
                min = array2[i];
                index=i;
            }

        }
        System.out.println("min " + "array2[" + index + "] = " + min);
        // return min;


    }
    private static void max(int[] array) {

        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index=i;
            }

        }
        System.out.println("max " + "array[" + index + "] = " + max);
        // return min;


    }
    private static void max(double[] array2) {

        double max = array2[0];
        int index = 0;

        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i]) {
                max = array2[i];
                index=i;
            }

        }
        System.out.println("max " + "array2[" + index + "] = " + max);
        // return min;


    }
}
