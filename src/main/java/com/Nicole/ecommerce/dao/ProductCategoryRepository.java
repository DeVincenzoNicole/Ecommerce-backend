package com.Nicole.ecommerce.dao;

import com.Nicole.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// Anotacion Spring Boot para el servidor de Angular
@CrossOrigin("https://angular-ecommerce-nicole.herokuapp.com")

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
