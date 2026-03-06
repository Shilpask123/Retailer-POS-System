
//Create a repository for Product entity with ID type Long and give me all CRUD operations automatically.
package com.retailer.pos.retailer_pos.Repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import com.retailer.pos.retailer_pos.Entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
}
