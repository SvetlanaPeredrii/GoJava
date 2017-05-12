package Module3.Task3_4;

/**
 * Created by kaganets.s on 24.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {

        balance += salary;

        System.out.println("Balance after get salary= " + balance);
    }

    double withdraw(int summ) {
        if (summ < 1000 && summ*1.05 <= balance) {
            balance -= summ * 1.05;

        } else if (summ*1.1 <= balance) {
            balance -= summ * 1.1;
        }
        else System.out.println("Sum more than balance");

        return balance;
    }

    void companyNameLenght() {

        int lenght = companyName.length();
        System.out.println("companyNameLenght = " + lenght);
    }

    int monthIncreaser(int addMonth) {

        return monthsOfEmployment += addMonth;
    }
}

