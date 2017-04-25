package module9;

import Module4.Task4_1.Currency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kaganets.s on 21.04.2017.
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
        User user9 = new User(999, "Komarov", "Evguen", "Ankara", 40);
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
        Order order10 = new Order(170, 123, Currency.USD, "Umbrella", "Vsi svoi", user9);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);

        Collections.sort(orders, Comparator.comparingInt(Order::getPrice).reversed());

        System.out.println(orders);

        Collections.sort(orders, Comparator.comparingInt(Order::getPrice).thenComparing(t -> t.getUser().getCity()));

        System.out.println(orders);

        Collections.sort(orders, Comparator.comparing(Order::getItemName).thenComparing(Order::getId).thenComparing(t -> t.getUser().getCity()));

        System.out.println(orders);


    }
}
