package tn.dev.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.dev.backend.entities.ProductReview;

public interface ProductReviewRepository extends JpaRepository<ProductReview, Long> {

}
