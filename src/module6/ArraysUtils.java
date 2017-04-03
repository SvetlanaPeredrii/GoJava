package module6;

import java.util.Arrays;

/**
 * Created by kaganets.s on 28.03.2017.
 */
public final class ArraysUtils {

    private ArraysUtils() {
    }

    public static void sum(int array[]){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum array = " + sum);
    }

    public static void min(int array[]){

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

    public static void max(int array[]) {

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

    public static void maxPositive(int array[]) {

        int index = 0;
        int maxpositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && maxpositive < array[i]) {
                maxpositive = array[i];
                index=i;
            }
        }
        if (maxpositive > 0) {System.out.println("maxpositive " + "array3[" + index + "] = " + maxpositive);}
        else System.out.println("Позитивных чисел нет");

    }

    public static void multiplication  (int array[]){
        long multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
            if (array[i]==0) {break;}
        }
        System.out.println("multiplication array = " + multiplication);
    }

    public static void modulus(int array[]) {

        int modulus = array[0] % array[array.length - 1];

        System.out.println("modulus array = " + modulus);
    }

    public static void secondLargest(int array[]){
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



   public static  int[] reverse(int[] array){

      int[] arrayReverse = new int[array.length];

       for (int i = 0; i < array.length; i++) {

           arrayReverse[i]=array[array.length-1-i];
       }

       return arrayReverse;
   }

  public static int[] findEvenElements(int[] array){
      int [] evenElements = new int[array.length];
      int count =0;
      for (int i = 0; i < array.length; i++) {


          if ((array[i]%2)==0){
              evenElements[count]= array[i];

              System.out.println("EvenElements="+ evenElements[count]);
              count++;

          }

      }

    return evenElements;
  }
}
