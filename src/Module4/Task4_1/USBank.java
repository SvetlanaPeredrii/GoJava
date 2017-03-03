package Module4.Task4_1;



/**
 * Created by kaganets.s on 28.02.2017.
 */
public class USBank extends Bank {


    USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public USBank() {
        super();
    }


    @Override
    public int getLimitOfWithdrawal() {

       int limitOfWithdrawal;

        if (getCurrency() == Currency.USD) {
         limitOfWithdrawal = 1000;
         }
         else limitOfWithdrawal = 1200;


        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }
}
