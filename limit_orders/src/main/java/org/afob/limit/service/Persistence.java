package org.afob.limit.service;

import org.afob.limit.model.Order;

import java.util.List;

public interface Persistence {

    public abstract void persist(Order order);

    List<Order> getAllOrders();
}
