package Warehouse;

import Warehouse.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Services {

    Item item = new Item("Milk", 1.05,20);
    Item item1 = new Item("Bread", 0.65,75);
    Item item2 = new Item("Eggs", 2.4,34);
    Item item3 = new Item("Beer", 2.15,123);

    List<Item> itemsList = new ArrayList<Item>();

    public void getList() {

        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);

        System.out.println(itemsList);
    }
    public void addItem() {
        System.out.println("Add new item:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        Item newItem = new Item(name, price, quantity);
        itemsList.add(newItem);
        System.out.println(itemsList);
    }
    public void deleteItem() {
        System.out.println("Delete an Warehouse.Item:");
        Scanner scanner = new Scanner(System.in);
        String itemToDelete = scanner.nextLine();
        for (Item item : itemsList) {
            if (itemToDelete.equals(item.getName())) {
            }
        }
        itemsList.remove(item);
        System.out.println(itemsList);
    }
    public void calculatePrice(){
        double priceSum = 0;
        for (Item item : itemsList) {
            priceSum +=  item.getPrice();
        }
        System.out.println(priceSum);
    }

    public void changeQuantity() {
        System.out.println("Find item:");
        Scanner scanner = new Scanner(System.in);
        String itemToChangeQTY = scanner.nextLine();
        for (Item item : itemsList) {
            if (itemToChangeQTY.equals(item.getName())) {
                System.out.println("Iveskite kieki:");
                int changingQty = scanner.nextInt();
                item.setQuantity(item.getQuantity() + changingQty);
            }
        }
        System.out.println(itemsList);
    }

}
