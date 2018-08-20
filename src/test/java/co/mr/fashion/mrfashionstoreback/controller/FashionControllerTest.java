package co.mr.fashion.mrfashionstoreback.controller;

import co.mr.fashion.mrfashionstoreback.entities.Order;
import co.mr.fashion.mrfashionstoreback.entities.Product;
import co.mr.fashion.mrfashionstoreback.repositories.OrderRepository;
import co.mr.fashion.mrfashionstoreback.repositories.ProductRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FashionControllerTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Test
    @Ignore
    public void getAllProducts_AProductMustBeReturned(){
        // given
        Product shirt = new Product();
        shirt.setCategory("shirt");
        shirt.setDesc("Shirt");
        shirt.setImg("/myshirt1.jpg");
        shirt.setPrice(new BigDecimal(70.000));
        entityManager.persist(shirt);
        entityManager.flush();
        // when
        ArrayList found = (ArrayList) productRepository.findAll();
        // then
        assertThat(found.size())
                .isEqualTo(1);

    }

}
