package com.learning.springWebApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Entity
@Data
public class Product {

    @Id

    private int productID;
    private String productName;
    private int productPrice;

    public Product() {}

    public Product(int productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + productPrice +
                '}';
    }

    @JsonProperty("productID")
    public int getProductID() {
        return productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setPrice(int price) {
        this.productPrice = productPrice;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }
    @JsonProperty("productPrice")
    public int getProductPrice() {
        return productPrice;
    }
}
