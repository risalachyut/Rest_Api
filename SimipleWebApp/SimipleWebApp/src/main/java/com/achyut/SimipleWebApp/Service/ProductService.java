package com.achyut.SimipleWebApp.Service;

import com.achyut.SimipleWebApp.Model.Product;
import com.achyut.SimipleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1,"Mango",400),
//            new Product(2,"Orange",600),
//            new Product(3,"Apple",1000)
//            ));
    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }


//    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0; i<products.size(); i++){
//            if(products.get(i).getProdId()==prod.getProdId()){
//                products.set(index,prod);9
//            }
//        }
//
//    }

//    public void updateProduct(Product prod) {
//        int index= 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()== prod.getProdId()) {
//                products.set(index, prod);
//            }
//        }
//
//    }


}


