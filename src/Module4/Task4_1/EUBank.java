package Module4.Task4_1;




/**
 * Created by kaganets.s on 28.02.2017.
 */
public class EUBank extends Bank {

    EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        int limitOfWithdrawal;

        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000;
        }
        else limitOfWithdrawal = 2200;


        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {

        int limitOfFunding;

        if (getCurrency() == Currency.EUR){
            limitOfFunding = 20000;
        }else limitOfFunding = 10000;

        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD){
            monthlyRate=0;
        }else monthlyRate = 1;
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
            commission=2;
        }else
            commission = 4;
        return commission;
    }
}
