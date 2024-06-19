package tn.dev.backend.services.servicesImp;

import tn.dev.backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
