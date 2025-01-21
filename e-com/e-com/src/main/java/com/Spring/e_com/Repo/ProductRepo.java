package com.Spring.e_com.Repo;

import com.Spring.e_com.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Integer> {
}
