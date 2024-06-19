package tn.dev.backend.services.servicesImp;

import tn.dev.backend.entities.ProductReview;

import java.util.List;
import java.util.Optional;

public interface IProductReview {

    ProductReview createProductReview(ProductReview productReview);

    List<ProductReview> getAllProductReviews();

    Optional<ProductReview> getProductReviewById(Long id);

    ProductReview updateProductReview(ProductReview productReview);

    void deleteProductReview(Long id);
}
