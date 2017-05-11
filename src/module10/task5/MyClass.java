package module10.task5;

/**
 * Created by kaganets.s on 11.05.2017.
 */
public class MyClass {

    public void someMethod(int i) throws MyException1, MyException2, MyException3 {

       if (i<0) throw new MyException1();
       if (i==0) throw new MyException2();
       if (i>0) throw new MyException3();



    }
}
