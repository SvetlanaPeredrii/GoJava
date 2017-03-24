package module5;

import java.util.Arrays;

/**
 * Created by kaganets.s on 09.03.2017.
 */
public class Controller {

    API apis[] = new API[2];

    public Controller() {

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new BookingComAPI();

        apis = new API[]{api1,api2,api3};


    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] request = new Room[15];

        for (int i = 0; i <= apis.length - 1; i++) {

           System.out.println("Controller - "+apis[i]+Arrays.toString(request=apis[i].findRooms(price, persons, city, hotel)));

        }
        return request;

    }

    public Room[] check(API a1, API a2) {

        Room[] check = new Room[5];


      for (int i = 0; i <= apis.length - 1; i++) {
           for (int j = 0; j <= check.length - 1; j++) {

                check[j] = a1.getRooms()[j];

        System.out.println("111="+check[j]);

        //a1=()a2;
        //System.out.println("type= "+Arrays.toString(a2.getRooms()));


      //  apis[0]=a1;
       // System.out.println("2221="+((GoogleAPI) a2).getRooms());
        //System.out.println("a1= "+Arrays.toString(a1()));


//                System.out.println("Check= " + Arrays.toString(check));
//                System.out.println("dlina= " + check.length);
//                System.out.println("i= " + check[j] + "nom= " + j);


          }
      }
        return check;
    }


    public API[] getApis() {
        return apis;
    }
}
