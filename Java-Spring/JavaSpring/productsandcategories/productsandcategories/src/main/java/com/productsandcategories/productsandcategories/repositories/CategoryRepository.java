package com.productsandcategories.productsandcategories.repositories;

import com.productsandcategories.productsandcategories.models.Category;
import com.productsandcategories.productsandcategories.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
    List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);



}
