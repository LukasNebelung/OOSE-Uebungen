package ose;

import java.util.HashSet;

/**
 * Created by nico on 13/06/17.
 */
public class Catalogue {
    private HashSet<Product> products = new HashSet<Product>();

    private static Catalogue instance;

    private Catalogue(){

    }

    public static Catalogue getInstance(){
        if (instance == null) {
            instance = new Catalogue();
        }
        return instance;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void printMe(){
        for (Product product: products){
            System.out.println(String.format("%s - incl VAT: %.2f EUR", product.toString(), product.getPriceWithTax()));
        }
    }

    public static void main(String[] args) {
        Catalogue catalogue = getInstance();
        catalogue.addProduct(new Product("Papier","A4", 2.52));
        catalogue.addProduct(new Clothing("Hemd","Herren-Hemd", 33.61, 48, "Baumwolle"));
        catalogue.printMe();
    }
}
