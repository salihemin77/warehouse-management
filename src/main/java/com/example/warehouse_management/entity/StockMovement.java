package com.example.warehouse_management.entity;

import com.example.warehouse_management.enums.Type;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "stock_movement")
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;
     @Positive
    @NotNull

    @Column(name = "quantity")
    private Integer quantity;
   @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
   @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
   @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public StockMovement() {
    }

    public StockMovement(Type type,Integer quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StockMovement{" +
                "id=" + id +
                ", type=" + type +
                ", quantity=" + quantity +
                ", user=" + user +
                ", warehouse=" + warehouse +
                ", product=" + product +
                '}';
    }
}
