package com.Spring.e_com.Service;

import com.Spring.e_com.Model.ProductModel;
import com.Spring.e_com.Repo.ProductRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    ProductRepo repo;

    public List<ProductModel> toGetProduct() {
        return repo.findAll();
    }

    public ProductModel toGetProductByID(int id) {
        return entityManager.find(ProductModel.class, id);
    }

    public ProductModel addToCart(ProductModel model) {
        return repo.save(model);
    }

    public void removeCart(ProductModel model) {
        repo.delete(model);
    }

    public ProductModel updateProduct(ProductModel model) {
        int id = model.getProdId();

        // Fetch the product from the database
        Optional<ProductModel> optionalProduct = repo.findById(id);

        if (optionalProduct.isPresent()) {
            ProductModel existingProduct = optionalProduct.get();

            // Update the existing product with the new values
            existingProduct.setProdName(model.getProdName());
            existingProduct.setProdDesc(model.getProdDesc());
            existingProduct.setProdPrice(model.getProdPrice());
            existingProduct.setProdCat(model.getProdCat());
            existingProduct.setProdDate(model.getProdDate());
            existingProduct.setProdAvail(model.isProdAvail());
            existingProduct.setProdQuantity(model.getProdQuantity());
            return  existingProduct ;
            // Save the updated product

        } else {

            return null;
        }

    }
}
