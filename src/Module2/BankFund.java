package Module2;


import java.util.Scanner;

public class BankFund {
    public static void main(String[] args) {
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        withdraws(ownerNames, balances);
    }

    private static void withdraws(String[] ownerNames, double[] balances) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String ownerName = in.nextLine();
        System.out.print("Input fund: ");
        double fund = in.nextDouble();
        boolean ifNotFound = false;
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerName.equals(ownerNames[i])) {
                ifNotFound = true;
                balances[i] += fund;

                System.out.println(ownerNames[i] + "   Balance: " + balances[i]);
            }
        if (!ifNotFound) System.out.println("Name not found");
    }

}
