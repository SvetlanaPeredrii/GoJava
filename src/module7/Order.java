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

 public long getId() {
  return id;
 }

 public int getPrice() {
  return price;
 }

 public Currency getCurrency() {
  return currency;
 }

 public String getItemName() {
  return itemName;
 }

 public String getShopIdentificator() {
  return shopIdentificator;
 }

 public User getUser() {
  return user;
 }

 @Override
 public String toString() {
  return "Order{" +
          "id=" + id +
          ", price=" + price +
          ", currency=" + currency +
          ", itemName='" + itemName + '\'' +
          ", shopIdentificator='" + shopIdentificator + '\'' +
          ", user=" + user +
          '}';
 }
}
