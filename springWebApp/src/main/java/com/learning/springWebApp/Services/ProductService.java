package com.learning.springWebApp.Services;

import com.learning.springWebApp.Model.Product;
import com.learning.springWebApp.Repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductsRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"IPhone",95000) ,
//            new Product(102,"Samsung",89999),
//            new Product(103,"Realme",29990)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product GetbyId(int prodId) {

//        for(Product p : products) {
//            if(p.getProductID() == prodId) {
//                return p;
//            }
//        }
//        return null;
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product pro) {
        repo.save(pro);
    }

    public void upadtaProduct(Product pro) {
        repo.save(pro);
//        int ind = 0;
//        for(int i = 0 ; i < products.size() ; i++) {
//            if(products.get(i).getProductID() == pro.getProductID()) {
//                ind = i;
//            }
//        }
//        products.set(ind,pro);
    }

    public void deleteProduct(int id) {
//        int ind = 0;
//        for(int i = 0 ; i < products.size() ; i++) {
//            if(products.get(i).getProductID() == id) {
//                ind = i;
//            }
//        }
//
//        products.remove(ind);
        repo.deleteById(id);
    }

}
