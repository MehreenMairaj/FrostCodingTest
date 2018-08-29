/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productdummy;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO class 
 * @author Mairaj
 */
public class Product {
    
@JsonProperty("imageUrl")
private String imageUrl;
@JsonProperty("name")
private String name;
@JsonProperty("description")
private String description;
@JsonProperty("stock")
private Integer stock;
@JsonProperty("price")
private Integer price;

@JsonProperty("imageUrl")
public String getImageUrl() {
return imageUrl;
}

@JsonProperty("imageUrl")
public void setImageUrl(String imageUrl) {
this.imageUrl = imageUrl;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("stock")
public Integer getStock() {
return stock;
}

@JsonProperty("stock")
public void setStock(Integer stock) {
this.stock = stock;
}

@JsonProperty("price")
public Integer getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(Integer price) {
this.price = price;
}

}


