package com.canterita.challenge.backend.test.model;

import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Setter
@Table(name = "order_details")
public class OrderDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "detail")
    private String detail;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Column(name = "total_detail")
    private Double totalDetail;

    @Column(name = "status")
    private String status;

    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;

}
