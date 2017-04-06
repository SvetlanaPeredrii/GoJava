package module7;

import Module4.Task4_1.Currency;

/**
 * Created by kaganets.s on 06.04.2017.
 */
public class Order {

   private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

 public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
  this.id = id;
  this.price = price;
  this.currency = currency;
  this.itemName = itemName;
  this.shopIdentificator = shopIdentificator;
  this.user = user;
 }
}
