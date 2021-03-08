package com.Otchenash.WMS.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(generator = "sequence-generator")
//    @GenericGenerator(
//            name = "sequence-generator",
//            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//            parameters = {
//                    @Parameter(name = "sequence_name", value = "user_sequence"),
//                    @Parameter(name = "initial_value", value = "4"),
//                    @Parameter(name = "increment_size", value = "1")
//            }
//    )
    private Long id;
    private int userID;
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


    protected Product() {
    }

  /*  public Product(int userID, String name, int weight, String color, String supplier, String brand, int price, Enum type, Date createdDate) {
        this.userID = userID;
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.supplier = supplier;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.createdDate = createdDate;
    }*/

    public Product(int userID, String name, String color, Enum type) {
        this.userID = userID;
        this.name = name;
        this.color = color;
        this.type = type;
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

    public int getUserID() {
        return userID;
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
