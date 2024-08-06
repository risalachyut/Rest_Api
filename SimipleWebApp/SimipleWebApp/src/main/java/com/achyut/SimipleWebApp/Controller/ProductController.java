package com.achyut.SimipleWebApp.Controller;

import com.achyut.SimipleWebApp.Model.Product;
import com.achyut.SimipleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts()

    {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){  //PathVariable is used to math prodId of line 26 with prod Id of line 27
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){  // since we are sending a body from the client to the server we have to use @RequestBody annotation. this will try to match the data which we are sending and  put that in the prod object
        System.out.println(prod);
        service.addProduct(prod);

    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

//    @PutMapping("/products")
//    public void updateProduct(@RequestBody Product prod){
//        System.out.println(prod);
//        service.updateProduct(prod);
//    }



}
