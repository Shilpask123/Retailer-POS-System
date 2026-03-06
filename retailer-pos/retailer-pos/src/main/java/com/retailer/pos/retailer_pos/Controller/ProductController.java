package com.retailer.pos.retailer_pos.Controller;

import java.util.List;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.retailer.pos.retailer_pos.Entity.Product;
import com.retailer.pos.retailer_pos.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    //POST
    @PostMapping
    public Product saveProduct(@RequestBody Product product){

        return productService.saveProduct(product);
    }

    //GET ALL
    @GetMapping
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    //GET BY ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {

        return productService.getProductById(id);
    }

    //UPDATE
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){

        return productService.updateProduct(id, product);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }
}
