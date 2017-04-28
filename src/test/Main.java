package test;

import module9.Order;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by kaganets.s on 27.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        Number num = new Number(1, "");
//        System.out.println(num.createNumber());
//        System.out.println(num.createNumber());
//        System.out.println(num.createNumber());
//        System.out.println(num.createNumber());
//        System.out.println(num.createNumber());
//        System.out.println(num.createNumber());
//        System.out.println(num);
//
//        Set<Number> numberSet = new HashSet<>();
//
//
//        numberSet.add(num.createNumber());
//        numberSet.add(num.createNumber());
//        numberSet.add(num.createNumber());
//        numberSet.add(num.createNumber());
//        numberSet.add(num.createNumber());
//
//        System.out.println(numberSet);

        //System.out.println(numberSet.remove(num.createNumber()));

//        numberSet.add(num.createNumber());
//        numberSet.add(num.createNumber());
//
//        System.out.println(numberSet);
//
//        Comparator<Number> numberSet1 = Comparator.comparingInt(Number::getId);
//        Number maxElement = numberSet.stream()
//                .max(numberSet1)
//                .get();
//
//
//        Number maxNumber = numberSet.stream()
//                .min(Comparator.comparingInt(Number::getId))
//                .get();
//
//        System.out.println(maxElement.getId());
//        System.out.println(maxNumber.getId());

//        addnumber(num.createNumber());
//        addnumber(num.createNumber());
//
//        Number maxNumber2 = addnumber(num.createNumber()).stream()
//                .min(Comparator.comparingInt(Number::getId))
//                .get();
//        System.out.println("max2=" + maxNumber2.getId());
//
//        addnumber(num.createNumber());
//        addnumber(num.createNumber());
//
//        System.out.println("wtf=" + numberSet1);
//        Number maxNumber1 = addnumber(num.createNumber()).stream()
//                .min(Comparator.comparingInt(Number::getId))
//                .get();
//        System.out.println("max=" + maxNumber1.getId());

        UtilMetod as = new UtilMetod();
        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());

        System.out.println(as.getNumberSet1());

        System.out.println("hhh="+as.getMax(as.getNumberSet1()));


        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());
        as.addnumber(num.createNumber());
        as.


    }


}
