package Module2;

import java.util.Scanner;
public class BankArrays {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        withdraws(ownerNames,balances);
    }
    private static void withdraws (String[] ownerNames, int [] balances) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String ownerName = in.nextLine();
        //  System.out.println("Name not found");
        System.out.print("Input withdrawal: ");
        double withdrawal = in.nextDouble();
        for ( int i=0; i < ownerNames.length; i++)
            if (ownerName.equals (ownerNames[i])){
                if (withdrawal*1.05 <= balances[i]) {
                    balances[i] -= withdrawal * 1.05;

                  System.out.println(ownerNames[i] + "   Withdrawal: " + withdrawal + "   Balance: " + balances[i]);
                }
                  else System.out.println(ownerNames[i] + "  NO ");
        }
     //else System.out.println(ownerNames[i] + "  NO ");

    }

}
