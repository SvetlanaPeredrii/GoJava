package Module2;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
     withdraws();
    }
    private static void withdraws () {
        Scanner in = new Scanner(System.in);
        System.out.print("Input balance: ");
        double balance = in.nextDouble();
        System.out.print("Input withdrawal: ");
        double withdrawal = in.nextDouble();
        if (withdrawal*1.05 <= balance){
            balance -= withdrawal * 1.05;
            double commission = withdrawal * 0.05;
        System.out.println("OK " + "   Commission: " + commission + "   Balance: " + balance);}
        else System.out.println("NO ");

    }

}
