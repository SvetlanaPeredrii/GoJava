package module9;

import Module4.Task4_1.Currency;

import java.util.*;
import java.util.stream.Collectors;

import static Module4.Task4_1.Currency.*;


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

        Order order1 = new Order(153, 15, USD, "Pen", "Kanctovary", user4);
        Order order2 = new Order(160, 2000, Currency.UAH, "Perfume", "Brocard", user3);
        Order order3 = new Order(155, 2, USD, "Oil", "Milk", user5);
        Order order4 = new Order(165, 123, USD, "Skirt", "Oggi", user8);
        Order order5 = new Order(159, 2500, Currency.EUR, "IPhone", "Apple", user6);
        Order order6 = new Order(161, 150, Currency.UAH, "Protector", "Samsung", user7);
        Order order7 = new Order(162, 10, Currency.EUR, "Pencil", "Kanctovary", user2);
        Order order8 = new Order(155, 2, USD, "Oil", "Milk", user5);
        Order order9 = new Order(169, 250, Currency.UAH, "Wine", "Silpo", user10);
        Order order10 = new Order(170, 123, USD, "Umbrella", "Vsi svoi", user9);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);

        System.out.println("******-отсортируйте список за ценой заказа по убыванию*******");

        sortByPriceDescending(orders);

        System.out.println("******-отсортируйте список за ценой заказа по возрастанию и за городом пользователя*******");

        sortByPriceCity(orders);

        System.out.println("******-отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя*******");

        sortByNameIdCity(orders);

        System.out.println("******-удалите дублированные данные со списка*******");

        ordersWithoutDuplicates(orders);

        System.out.println("*******-удалите объекты, где цена меньше 1500********");

        ordersWithoutPriceless1500(orders);

        System.out.println("*******-разделите список на 2 списка - заказы в долларах и в гривнах********");

        ordersTwoLists(orders);

        System.out.println("*******-разделите список на столько списков, сколько уникальных городов в User********");

        ordersGroupByCity(orders);

        System.out.println("*******-проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”********");

        ordersFromPetrov(orders);

        System.out.println("*******-удалите заказы в USD********");

        ordersWithoutUSD(orders);

    }

    public static void sortByPriceDescending(List<Order> orders) {

        Collections.sort(orders, Comparator.comparingInt(Order::getPrice).reversed());

        orders.forEach(System.out::println);

    }

    public static void sortByPriceCity(List<Order> orders) {

        Collections.sort(orders, Comparator.comparingInt(Order::getPrice).thenComparing(t -> t.getUser().getCity()));

        orders.forEach(System.out::println);

    }

    public static void sortByNameIdCity(List<Order> orders) {

        Collections.sort(orders, Comparator.comparing(Order::getItemName).thenComparing(Order::getId).thenComparing(t -> t.getUser().getCity()));

        orders.forEach(System.out::println);

    }

    public static void ordersWithoutDuplicates(List<Order> orders) {

        List<Order> ordersWithoutDuplicates = orders.stream()
                .distinct()
                .collect(Collectors.toList());

        ordersWithoutDuplicates.forEach(System.out::println);

    }

    public static void ordersWithoutPriceless1500(List<Order> orders) {

        List<Order> ordersWithoutPriceless1500 = orders.stream()
                .filter(t -> t.getPrice() >= 1500)
                .collect(Collectors.toList());

        ordersWithoutPriceless1500.forEach(System.out::println);

    }

    public static void ordersTwoLists(List<Order> orders) {

        Map<Boolean, List<Order>> ordersTwoLists = orders.stream()
                .filter(t -> t.getCurrency().equals(USD) || t.getCurrency().equals(UAH))
                .collect(Collectors.partitioningBy(t -> t.getCurrency().equals(USD)));

        System.out.println("Orders in USD= " + ordersTwoLists.get(true));
        System.out.println("Orders in UAN= " + ordersTwoLists.get(false));

    }

    public static void ordersGroupByCity(List<Order> orders) {

        Map<String, List<Order>> ordersGroupByCity = orders.stream()
                .collect(Collectors.groupingBy(t -> t.getUser().getCity()));

        System.out.println("Orders group by city= " + ordersGroupByCity);

    }

    public static void ordersFromPetrov(List<Order> orders) {
        List<Order> ordersFromPetrov = orders.stream()
                .filter(t -> t.getUser().getFirstName().contains("Petrov"))
                .collect(Collectors.toList());

        ordersFromPetrov.forEach(System.out::println);
    }

    public static void ordersWithoutUSD(List<Order> orders) {

        List<Order> ordersWithoutUSD = orders.stream()
                .filter(t -> !t.getCurrency().equals(USD))
                .collect(Collectors.toList());

        ordersWithoutUSD.forEach(System.out::println);

    }

}
