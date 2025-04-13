package com.learning.springWebApp.Controller;

import com.learning.springWebApp.Model.Product;
import com.learning.springWebApp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  ProductController {


    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> Product() {
        return service.getProducts();
    }

    @GetMapping("products/{prodId}")
    public Product GetbyId(@PathVariable int prodId) {
        return service.GetbyId(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product itm) {
        service.addProduct(itm);
    }

    @PutMapping("/products")
    public void upadteProduct(@RequestBody Product upProduc) {
        service.upadtaProduct(upProduc);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProducts(@PathVariable int id) {
        service.deleteProduct(id);
    }


}
