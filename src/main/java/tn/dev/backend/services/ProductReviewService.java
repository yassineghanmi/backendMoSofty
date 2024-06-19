package tn.dev.backend.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.dev.backend.entities.ProductReview;
import tn.dev.backend.repositories.ProductReviewRepository;
import tn.dev.backend.services.servicesImp.IProductReview;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ProductReviewService implements IProductReview {
    private final ProductReviewRepository productReviewRepository;


    @Override
    public ProductReview createProductReview(ProductReview productReview) {
        return productReviewRepository.save(productReview);
    }

    @Override
    public List<ProductReview> getAllProductReviews() {
        return productReviewRepository.findAll();
    }

    @Override
    public Optional<ProductReview> getProductReviewById(Long id) {
        return productReviewRepository.findById(id);
    }

    @Override
    public ProductReview updateProductReview(ProductReview productReview) {
        return productReviewRepository.save(productReview);
    }

    @Override
    public void deleteProductReview(Long id) {
        productReviewRepository.deleteById(id);
    }}
