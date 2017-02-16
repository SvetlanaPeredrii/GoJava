package Module3;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class Adder extends Arithmetic {

   boolean check(Integer a, Integer b){
       boolean check;
     if (a>=b) {check = true;}
      else check = false;
     return check;
   }
}
