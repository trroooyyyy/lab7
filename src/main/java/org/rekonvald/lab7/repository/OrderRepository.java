package org.rekonvald.lab7.repository;

import org.rekonvald.lab7.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}