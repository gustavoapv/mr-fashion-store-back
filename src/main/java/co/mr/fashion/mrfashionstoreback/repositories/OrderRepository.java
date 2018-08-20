package co.mr.fashion.mrfashionstoreback.repositories;

import co.mr.fashion.mrfashionstoreback.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
