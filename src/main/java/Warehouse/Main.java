package Warehouse;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Services services = new Services();
        services.getList();
        //services.addItem();
        //services.deleteItem();
        //services.calculatePrice();
        services.changeQuantity();

    }
}


