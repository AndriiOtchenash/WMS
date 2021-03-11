package com.Otchenash.WMS.entities;

import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"id", "supplier"})
})

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String color;
    @Enumerated(EnumType.ORDINAL)
    private TypeOfProducts type;
    private String supplier;
    private Date createdDate;

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

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public TypeOfProducts getType() {
        return type;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

}
