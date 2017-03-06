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
    public int getLimitOfFunding() {

        int limitOfFunding;

        if (getCurrency() == Currency.EUR){
            limitOfFunding = 10000;
        }else limitOfFunding = Integer.MAX_VALUE;

        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD){
            monthlyRate=1;
        }else monthlyRate = 2;
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD && summ<=1000){
            commission=5;
        }else  if (getCurrency() == Currency.USD && summ>1000) {
            commission = 7;
        }else if (getCurrency() == Currency.EUR && summ<=1000){
            commission=6;
        }else
            commission = 8;
        return commission;
    }
}
