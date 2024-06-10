package dev.almaa.graphql_scalars.controller;

import dev.almaa.graphql_scalars.model.Product;
import dev.almaa.graphql_scalars.repository.ProductRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

// Controller for this application. Here is the function that will be called upon querying happen at graphQL endpoint
@Controller
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository){
        this.repository = repository;
    }

    @QueryMapping
    public List<Product> allProducts() {
        return repository.findAll();
    }
}
