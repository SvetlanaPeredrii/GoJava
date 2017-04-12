package module7;

import Module4.Task4_1.Currency;

import java.util.*;

/**
 * Created by kaganets.s on 06.04.2017.
 */
public class Main {


    public static void main(String[] args) {


        User user1 = new User(111, "Bogdanova", "Ira", "Kiev", 1450);
        User user2 = new User(222, "But", "Misha", "Rovno", 300);
        User user3 = new User(333, "Reva", "Andrew", "Harkov", 2456);
        User user4 = new User(444, "Ivanov", "Kolya", "Paris", 9800);
        User user5 = new User(555, "Petrov", "Pasha", "Paris", 0);
        User user6 = new User(666, "Kvashyna", "Valya", "Sumy", 2456);
        User user7 = new User(777, "Rybkina", "Olga", "New York", 200000);
        User user8 = new User(888, "Saulyk", "Vadim", "Kiev", 6767);
        User user9 = new User(999, "Komarov", "Evguen", "Kiev", 40);
        User user10 = new User(1010, "Petrosyan", "Yulya", "Lvov", 12345);

        List<User> users = new ArrayList<>();
        Collections.addAll(users, user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);

        Order order1 = new Order(153, 15, Currency.USD, "Pen", "Kanctovary", user4);
        Order order2 = new Order(160, 100, Currency.UAH, "Perfume", "Brocard", user3);
        Order order3 = new Order(155, 2, Currency.USD, "Oil", "Milk", user5);
        Order order4 = new Order(165, 123, Currency.USD, "Skirt", "Oggi", user8);
        Order order5 = new Order(159, 500, Currency.EUR, "IPhone", "Apple", user6);
        Order order6 = new Order(161, 150, Currency.UAH, "Protector", "Samsung", user7);
        Order order7 = new Order(162, 10, Currency.EUR, "Pencil", "Kanctovary", user2);
        Order order8 = new Order(155, 2, Currency.USD, "Oil", "Milk", user5);
        Order order9 = new Order(169, 250, Currency.UAH, "Wine", "Silpo", user10);
        Order order10 = new Order(170, 90, Currency.USD, "Umbrella", "Vsi svoi", user9);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);


        Collections.sort(orders);
        System.out.println("Price descending= " + orders);

        Collections.sort(orders, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                int res = ((Integer) o1.getPrice()).compareTo(o2.getPrice());
                if (res != 0) {
                    return res;
                }

                return (o1.getUser().getCity()).compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("Price ascending and usercity= " + orders);


        Collections.sort(orders, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                int res = (o1.getItemName()).compareTo(o2.getItemName());
                if (res != 0) {
                    return res;
                }
                int res2 = ((Long) o1.getId()).compareTo(o2.getId());
                if (res2 != 0) {
                    return res2;
                }


                return (o1.getUser().getCity()).compareTo(o2.getUser().getCity());

            }

        });
        System.out.println("Name and identifier ascending and usercity= " + orders);


        TreeSet<Order> orderSet = new TreeSet<>();


        Collections.addAll(orderSet, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);
        System.out.println(orderSet);

        for (Order p : orderSet) {
            if (p.getUser().getFirstName() == "Petrov") {

                System.out.println("Finding Petrov= " + p);
            }
        }

        // так как compareTo у меня сортирует по убыванию, поэтому использую first() для поиска наибольшей цены.

        System.out.println("Order with the highest price= " + orderSet.first());


        Iterator<Order> its = orderSet.iterator();

        while (its.hasNext()) {

            if (its.next().getCurrency() == Currency.USD) {


                its.remove();

            }

        }
        System.out.println("Orders without $= " + orderSet);
    }
}
