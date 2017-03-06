package Module4.Task4_1;

import Module4.Task4_1.Bank;



/**
 * Created by kaganets.s on 28.02.2017.
 */
public class ChinaBank extends Bank {
    ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public ChinaBank() {
        super();
    }

    @Override
    public int getLimitOfWithdrawal() {

        int limitOfWithdrawal;

        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        }
        else limitOfWithdrawal = 150;


        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {

        int limitOfFunding;

        if (getCurrency() == Currency.EUR){
            limitOfFunding = 5000;
        }else limitOfFunding = 10000;

        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD){
            monthlyRate=1;
        }else monthlyRate = 0;
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD && summ<=1000){
            commission=3;
        }else  if (getCurrency() == Currency.USD && summ>1000) {
            commission = 5;
        }else if (getCurrency() == Currency.EUR && summ<=1000){
            commission=10;
        }else
            commission = 11;
        return commission;
    }
}
