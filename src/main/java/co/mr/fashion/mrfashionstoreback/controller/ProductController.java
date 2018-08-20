package co.mr.fashion.mrfashionstoreback.controller;

import co.mr.fashion.mrfashionstoreback.entities.Product;
import co.mr.fashion.mrfashionstoreback.repositories.OrderRepository;
import co.mr.fashion.mrfashionstoreback.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;

    // Get All Products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    // Create a new Order
    @PostMapping("/orders")
    public Product createNote(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

}
