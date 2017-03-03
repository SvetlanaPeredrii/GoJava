package Module4.Task4_1;


import static Module4.Task4_1.Currency.*;



/**
 * Created by kaganets.s on 01.03.2017.
 */
public class User {

  private long id;
  private String name;
  private double balance;
  private int monthsOfEmployment;
  private String companyName;
  private int salary;
  private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public static void main(String[] args) {

        USBank user1 = new USBank(12312, "cghh", EUR, 3, 25000, 2323,12);

        System.out.println("Limit= "+ user1.getLimitOfWithdrawal());

      Bank bank = new USBank();
        User user2 = new User(123, "Vasya", 123456.56, 6, "Apple", 2000, bank);

        user2.setBank(new USBank());
       // user2.setBank(new ChinaBank());
        user2.getBank();
        System.out.println("Bank= "+user2.getBank());
       // System.out.println("Limit= "+ user2.getLimitOfWithdrawal());

    }



}
