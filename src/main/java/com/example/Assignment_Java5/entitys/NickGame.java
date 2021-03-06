package com.example.Assignment_Java5.entitys;

import com.example.Assignment_Java5.entitys.NickEnum.NickPlanet;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nickgame")
public class NickGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "createdate")
    private Date createDate;

    @Column(name = "planet")
    private NickPlanet planet;

    @NotBlank(message = "UserName cannot be blank")
    @Column(name = "user", length = 50)
    private String user;

    @NotBlank(message = "Password cannot be blank")
    @Column(name = "password", length = 50)
    private String password;

    @NotNull(message = "Price cannot be null")
    @Min(10000)
    @Column(name = "price", precision = 10)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "server_id")
    private Server server;

    @Column(name = "`describe`", length = 250)
    private String describe;

    @Column(name = "image", length = 100)
    private String image;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category idCategory;

    @OneToMany(mappedBy = "nickGame")
    private List<OrderDetail> orderdetailList;
}