package co.mr.fashion.mrfashionstoreback.repositories;

import co.mr.fashion.mrfashionstoreback.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
