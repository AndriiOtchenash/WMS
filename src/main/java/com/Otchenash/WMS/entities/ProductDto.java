package com.Otchenash.WMS.entities;

import javax.persistence.*;
import java.util.Date;

public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String color;
    @Enumerated(EnumType.ORDINAL)
    public TypeOfProducts type;
    public String supplier;
    public Date createdDate;

}
