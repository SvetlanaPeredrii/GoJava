package Module2;

public class CalculateArray {

    public static void main(String[] args) {

        int[] array = {-5, 90, 0, -234, 45, 99, 1, 34, -5, 46};
        double[] array2 = {5.5, -9.7, -75, 234.89, -45.987, 9985.01, 2, -34.234, -5.98, 46.007};
        int[] array3 = {-500, -9000, -7500, -234, -4534, -9985, -100, -3443, -5000, -4600};
        double[] array4 = {-500.5, -9000.7, -7500, -234.89, -4534.987, -9985.01, -100, -3443.234, -5000.98, 460.007};
        sum(array);
        sum(array2);
        min(array);
        min(array2);
        max(array);
        max(array2);
        maxPositive(array3);
        maxPositive(array4);
        multiplication(array);
        multiplication(array2);
        modulus(array);
        modulus(array2);
        secondLargest(array);
        secondLargest(array2);
    }


    private static void sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
          System.out.println("sum array = " + sum);
    }

    private static void sum(double[] array2) {
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("sum array2 = " + sum);
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

    }

    private static void maxPositive(int[] array3) {

        int index = 0;
        int maxpositive = -1;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0 && maxpositive < array3[i]) {
                maxpositive = array3[i];
                index=i;
            }
        }
        if (maxpositive > 0) {System.out.println("maxpositive " + "array3[" + index + "] = " + maxpositive);}
        else System.out.println("Позитивных чисел нет");

    }

    private static void maxPositive(double[] array4) {

        int index = 0;
        double maxpositive = -1;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > 0 && maxpositive < array4[i]) {
                maxpositive = array4[i];
                index=i;
            }
        }
        if (maxpositive > 0) {System.out.println("maxpositive " + "array4[" + index + "] = " + maxpositive);}
        else System.out.println("Позитивных чисел нет");
    }

    private static void multiplication(int[] array) {
        long multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
            if (array[i]==0) {break;}
        }
        System.out.println("multiplication array = " + multiplication);
    }

    private static void multiplication(double[] array2) {
        double multiplication = 1;

        for (int i = 0; i < array2.length; i++) {
            multiplication *= array2[i];
            if (array2[i]==0) {break;}
        }
        System.out.println("multiplication array2 = " + multiplication);
    }
    private static void modulus(int[] array) {

        int modulus = array[0] % array[array.length - 1];

        System.out.println("modulus array = " + modulus);
    }

    private static void modulus(double[] array2) {

        double modulus = array2[0] % array2[array2.length - 1];

        System.out.println("modulus array2 = " + modulus);
    }
    private static void secondLargest(int[] array) {
        int max = array[0];
        int secondlargest = array[1];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                secondlargest = max;
                max = array[i];
            }
            else if (secondlargest < array[i])  {
                secondlargest = array[i];
            }
         }
        System.out.println("secondLargest " + "array = " + secondlargest);

    }
    private static void secondLargest(double[] array2) {

        double max = array2[0];
        double secondlargest = array2[1];

        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i]) {
                secondlargest = max;
                max = array2[i];
            }
            else if (secondlargest < array2[i])  {
                secondlargest = array2[i];
            }
        }
        System.out.println("secondLargest " + "array2 = " + secondlargest);
    }

}
