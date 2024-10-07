package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleDataService {
    private List<Category> categories = new ArrayList<>();
    private List<SubCategory> subCategories = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<PriceRule> priceRules = new ArrayList<>();

    public SampleDataService() {
        // Adding existing categories
//        categories.add(new Category("1", "Electronics"));
//        categories.add(new Category("2", "Clothing"));
//
//        // Adding new categories
//        categories.add(new Category("3", "Books"));
//        categories.add(new Category("4", "Home Appliances"));
//        categories.add(new Category("5", "Furniture"));
//
//        // Adding existing subcategories
//        subCategories.add(new SubCategory("1", "Mobile Phones", "1"));
//        subCategories.add(new SubCategory("2", "Laptops", "1"));
//        subCategories.add(new SubCategory("3", "Shirts", "2"));
//
//        // Adding new subcategories for Books
//        subCategories.add(new SubCategory("4", "Fiction", "3"));
//        subCategories.add(new SubCategory("5", "Non-Fiction", "3"));
//
//        // Adding new subcategories for Home Appliances
//        subCategories.add(new SubCategory("6", "Kitchen Appliances", "4"));
//        subCategories.add(new SubCategory("7", "Laundry Appliances", "4"));
//
//        // Adding new subcategories for Furniture
//        subCategories.add(new SubCategory("8", "Living Room Furniture", "5"));
//        subCategories.add(new SubCategory("9", "Bedroom Furniture", "5"));
//
//        // Adding existing products
//        products.add(new Product("101", "iPhone", "1", "1", 10, 999.99));
//        products.add(new Product("102", "MacBook", "1", "2", 5, 1299.99));
//        products.add(new Product("103", "Casual Shirt", "2", "3", 20, 29.99));
//
//        // Adding new sample products
//        products.add(new Product("104", "The Alchemist", "3", "4", 50, 15.99));
//        products.add(new Product("105", "Educated: A Memoir", "3", "5", 30, 18.99));
//        products.add(new Product("106", "Blender", "4", "6", 15, 79.99));
//        products.add(new Product("107", "Microwave Oven", "4", "6", 8, 159.99));
//        products.add(new Product("108", "Washing Machine", "4", "7", 3, 499.99));
//        products.add(new Product("109", "Sofa", "5", "8", 4, 799.99));
//        products.add(new Product("110", "Coffee Table", "5", "8", 10, 149.99));
//        products.add(new Product("111", "King Size Bed", "5", "9", 2, 999.99));
//        products.add(new Product("112", "Wardrobe", "5", "9", 6, 549.99));
//        products.add(new Product("113", "Gaming Laptop", "1", "2", 7, 1499.99));
//
//        // Adding a sample pricing rule
//        priceRules.add(new PriceRule("R1", "1", "1", 10, 5)); // 10% discount on Electronics -> Mobile Phones if quantity >= 5
//    }
//
//    public List<Product> getAllProducts() {
//        return products;
//    }
//
//    public void addPriceRule(PriceRule priceRule) {
//        priceRules.add(priceRule);
//    }
//
//    public List<PriceRule> getAllPriceRules() {
//        return priceRules;
    }
}
