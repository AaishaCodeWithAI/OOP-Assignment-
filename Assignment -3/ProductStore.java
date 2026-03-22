package Java_Program;

import java.util.*;

public class ProductStore {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();

        // Store products
        products.put("Apple", 10);
        products.put("Banana", 20);

        // Update quantity
        products.put("Apple", products.get("Apple") + 5);

        // Display all products
        for(String key : products.keySet()){
            System.out.println(key + " : " + products.get(key));
        }
    }
}
