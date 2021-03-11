package com.Otchenash.WMS.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/*@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"productId", "serial"})
})*/
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long userId;
    private String name;
    private String color;
    private Enum type;

/*    private int id;

    private String name;
    private int weight;
    private String color;
    private String supplier;
    private String brand;
    private int price;

    private Date createdDate;*/


    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Long getuserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Enum getType() {
        return type;
    }
}
