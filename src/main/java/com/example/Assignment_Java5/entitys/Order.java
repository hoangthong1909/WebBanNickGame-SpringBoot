package com.example.Assignment_Java5.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "total")
    private Double total;

    @Column(name = "datecreate")
    private LocalDate datecreate;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userDatHang;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderdetails;

}