package com.Spring.e_com.Controller;

import com.Spring.e_com.Model.ProductModel;
import com.Spring.e_com.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping ("/api")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<ProductModel> toGetProduct()
    {
        return service.toGetProduct();
    }
    @GetMapping("/products/{id}")
    public ProductModel toGetProduct(@PathVariable int id )
    {
        return service.toGetProductByID(id);
    }


    @PostMapping("/products")
    public  ProductModel  addToCart( @ RequestBody  ProductModel model)
    {
        return service.addToCart(model);
    }
    @DeleteMapping("/products")
    public  void removeCart( @RequestBody ProductModel model){
        service.removeCart(model);

    }
@PutMapping("products")
    public ProductModel updateProduct(ProductModel model)
{
    return  service.updateProduct(model);
}
}
