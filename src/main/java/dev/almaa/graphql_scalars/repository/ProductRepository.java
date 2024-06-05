package dev.almaa.graphql_scalars.repository;

import dev.almaa.graphql_scalars.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {
}
