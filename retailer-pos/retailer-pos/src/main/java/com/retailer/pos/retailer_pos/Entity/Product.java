package com.retailer.pos.retailer_pos.Entity;


import jakarta.persistence.*;
import lombok.*;

//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String name;
private double price;
private int quantity;

public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
