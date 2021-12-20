package com.springrestapi.springrestapimysql.controllers;

import com.springrestapi.springrestapimysql.entities.Products;
import com.springrestapi.springrestapimysql.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Products addProduct(@RequestBody Products product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Products> addProducts(@RequestBody List<Products> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/productbyid/{id}")
    public Products findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/productbyname/{name}")
    public Products findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Products updateProduct(@RequestBody Products product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}
