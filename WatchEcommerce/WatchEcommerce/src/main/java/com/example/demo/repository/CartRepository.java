package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.CartItems;
@EnableJpaRepositories
public interface CartRepository extends JpaRepository<CartItems,Integer> {

List<CartItems> findAllByCustomerEmail(String customerEmail);

 void deleteAllByCustomerEmail(String customerEmail);
}
