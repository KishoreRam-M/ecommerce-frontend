package com.Spring.e_com.Data;

import com.Spring.e_com.Model.ProductModel;
import com.Spring.e_com.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public void run(String... args) throws Exception {
        // Create an ArrayList of product instances for Electronics category
        ArrayList<ProductModel> products = new ArrayList<>();

        // Add product instances for Electronics category
        products.add(new ProductModel(1, "Wireless Headphones", "High-quality wireless headphones with noise cancellation", new BigDecimal("99.99"), "Electronics", new Date(), true, 50));
        products.add(new ProductModel(2, "Smartphone", "Latest model smartphone with a 6.5-inch display", new BigDecimal("699.99"), "Electronics", new Date(), true, 200));
        products.add(new ProductModel(3, "Laptop", "15-inch laptop with high performance and battery life", new BigDecimal("1200.00"), "Electronics", new Date(), true, 150));
        products.add(new ProductModel(4, "Smartwatch", "Smartwatch with fitness tracking and notifications", new BigDecimal("199.99"), "Electronics", new Date(), true, 100));
        products.add(new ProductModel(5, "Bluetooth Speaker", "Portable Bluetooth speaker with waterproof design", new BigDecimal("49.99"), "Electronics", new Date(), true, 300));
        products.add(new ProductModel(6, "Camera", "DSLR camera with 24MP sensor and 4K video recording", new BigDecimal("850.00"), "Electronics", new Date(), true, 75));
        products.add(new ProductModel(7, "Gaming Console", "Next-gen gaming console with high definition graphics", new BigDecimal("499.99"), "Electronics", new Date(), true, 50));
        products.add(new ProductModel(8, "Television", "50-inch 4K UHD Smart TV with HDR support", new BigDecimal("799.99"), "Electronics", new Date(), true, 80));
        products.add(new ProductModel(9, "AirPods", "True wireless earbuds with active noise cancellation", new BigDecimal("249.99"), "Electronics", new Date(), true, 150));
        products.add(new ProductModel(10, "VR Headset", "Virtual Reality headset with immersive experience", new BigDecimal("399.99"), "Electronics", new Date(), true, 60));

        // Add product instances for Furniture category
        products.add(new ProductModel(11, "Ergonomic Chair", "Ergonomic office chair with lumbar support", new BigDecimal("250.00"), "Furniture", new Date(), true, 100));
        products.add(new ProductModel(12, "Dining Table", "Wooden dining table with 6 chairs", new BigDecimal("500.00"), "Furniture", new Date(), true, 30));
        products.add(new ProductModel(13, "Sofa", "Comfortable sofa with adjustable recliners", new BigDecimal("899.99"), "Furniture", new Date(), true, 20));
        products.add(new ProductModel(14, "Bookshelf", "Wooden bookshelf with adjustable shelves", new BigDecimal("120.00"), "Furniture", new Date(), true, 80));
        products.add(new ProductModel(15, "Coffee Table", "Glass coffee table with sleek metal legs", new BigDecimal("150.00"), "Furniture", new Date(), true, 40));
        products.add(new ProductModel(16, "Bed Frame", "King-size bed frame with storage drawers", new BigDecimal("700.00"), "Furniture", new Date(), true, 25));
        products.add(new ProductModel(17, "Desk", "Wooden office desk with multiple drawers", new BigDecimal("250.00"), "Furniture", new Date(), true, 50));
        products.add(new ProductModel(18, "Armchair", "Modern armchair with a soft cushion", new BigDecimal("200.00"), "Furniture", new Date(), true, 60));
        products.add(new ProductModel(19, "Wardrobe", "Large wooden wardrobe with hanging space", new BigDecimal("450.00"), "Furniture", new Date(), true, 30));
        products.add(new ProductModel(20, "Dresser", "Wooden dresser with multiple drawers and mirror", new BigDecimal("300.00"), "Furniture", new Date(), true, 70));

        // Add product instances for Clothing category
        products.add(new ProductModel(21, "T-Shirt", "Cotton t-shirt with a round neck and short sleeves", new BigDecimal("19.99"), "Clothing", new Date(), true, 150));
        products.add(new ProductModel(22, "Jeans", "Slim fit denim jeans with a stretchable waistband", new BigDecimal("49.99"), "Clothing", new Date(), true, 100));
        products.add(new ProductModel(23, "Jacket", "Winter jacket with insulation and waterproof finish", new BigDecimal("89.99"), "Clothing", new Date(), true, 80));
        products.add(new ProductModel(24, "Sweater", "Soft wool sweater with ribbed cuffs and hem", new BigDecimal("39.99"), "Clothing", new Date(), true, 120));
        products.add(new ProductModel(25, "Sneakers", "Comfortable running sneakers with high breathability", new BigDecimal("69.99"), "Clothing", new Date(), true, 150));
        products.add(new ProductModel(26, "Dress", "Elegant dress with floral print and adjustable straps", new BigDecimal("79.99"), "Clothing", new Date(), true, 50));
        products.add(new ProductModel(27, "Hat", "Cotton hat with adjustable strap for all sizes", new BigDecimal("15.99"), "Clothing", new Date(), true, 200));
        products.add(new ProductModel(28, "Scarf", "Warm knitted scarf in multiple colors", new BigDecimal("24.99"), "Clothing", new Date(), true, 90));
        products.add(new ProductModel(29, "Socks", "Pack of 5 pairs of cotton socks in various colors", new BigDecimal("10.99"), "Clothing", new Date(), true, 300));
        products.add(new ProductModel(30, "Shorts", "Summer shorts with an elastic waistband", new BigDecimal("29.99"), "Clothing", new Date(), true, 150));

        // Save all products to the database using the ProductRepo
        productRepo.saveAll(products);

        System.out.println("All products have been loaded into the database!");
    }
}
