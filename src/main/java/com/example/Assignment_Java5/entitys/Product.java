package com.example.Assignment_Java5.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String productName;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "type")
    private ProductType type;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category idCategory;
}