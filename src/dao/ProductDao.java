package src.dao;

import src.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public List<Product> getAllProducts(){
        List<Product> productList=new ArrayList<Product>();

        productList.add(new Product(1,"Java","Books",450.50));
        productList.add(new Product(1,"Git For Beginners","Books",99.99));
        return productList;
    }
}
