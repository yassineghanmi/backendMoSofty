package tn.dev.backend.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.dev.backend.entities.ProductReview;
import tn.dev.backend.services.servicesImp.IProductReview;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product-reviews")
@AllArgsConstructor
public class ProductReviewController {
    private final IProductReview productReviewService;

    @PostMapping
    public ResponseEntity<ProductReview> createProductReview(@RequestBody ProductReview productReview) {
        ProductReview newProductReview = productReviewService.createProductReview(productReview);
        return new ResponseEntity<>(newProductReview, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductReview>> getAllProductReviews() {
        List<ProductReview> productReviews = productReviewService.getAllProductReviews();
        return new ResponseEntity<>(productReviews, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductReview> getProductReviewById(@PathVariable Long id) {
        Optional<ProductReview> productReview = productReviewService.getProductReviewById(id);
        return productReview.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping
    public ResponseEntity<ProductReview> updateProductReview(@RequestBody ProductReview productReview) {
        ProductReview updatedProductReview = productReviewService.updateProductReview(productReview);
        return new ResponseEntity<>(updatedProductReview, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductReview(@PathVariable Long id) {
        productReviewService.deleteProductReview(id);
        return ResponseEntity.noContent().build();
    }

}
