package org.example.model;

public class Store {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Chocolate", 2.5, "Dark chocolate bar", 70.0);
        Coke coke = new Coke("Coke", 1.5, "Soft drink", 330);
        Bread bread = new Bread("Bread", 3.0, "Fresh bread", true);


        ProductForSale[] products = {chocolate, coke, bread};


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}
