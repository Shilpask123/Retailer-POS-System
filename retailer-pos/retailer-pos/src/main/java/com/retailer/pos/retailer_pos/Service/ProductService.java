package com.retailer.pos.retailer_pos.Service;

import  java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retailer.pos.retailer_pos.Entity.Product;
import com.retailer.pos.retailer_pos.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //save product
    public Product saveProduct(Product product){
        return  productRepository.save(product);
    }

    //Get All Product
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    //Get Product By Id
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    //Update Product
    public Product updateProduct(Long id, Product productDetails){
        Product product=productRepository.findById(id).orElse(null);

        if(product!=null) {
            product.setName(productDetails.getName());

            product.setPrice(productDetails.getPrice());

            product.setQuantity((productDetails.getQuantity()));

            return productRepository.save(product);
        }
        return null;

        }

        //Delete Product
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
