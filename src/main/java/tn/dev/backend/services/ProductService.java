package tn.dev.backend.services;

import tn.dev.backend.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.dev.backend.repositories.ProductRepo;
import tn.dev.backend.services.servicesImp.IProductService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    private ProductRepo productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
