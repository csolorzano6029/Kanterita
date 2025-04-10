package com.canterita.challenge.backend.test.model;

import javax.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Setter
@Table(name = "order_details")
public class DetailsEntity {

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
