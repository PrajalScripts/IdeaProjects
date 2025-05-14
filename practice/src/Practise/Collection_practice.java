/*Create a class Item with id, name, quantity, and price.

Store items in a HashMap<Integer, Item> using id as the key.

Write methods to:

        ->Add a new item

-> Update quantity of an existing item

->Display items where quantity < 10

        */


package Practise;

import java.util.HashMap;

class Item{
    int id;
    String name;
    int quantity;
    int price;

    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void addItem(Item item, HashMap<Integer,Item> map){
        map.put(item.getId(),item);
    }
    public static void updateQuantity( Item item, int quantity){
        item.setQuantity(quantity);
    }


}

public class Collection_practice {
    HashMap<Integer,Item> map=new HashMap<>();

}
