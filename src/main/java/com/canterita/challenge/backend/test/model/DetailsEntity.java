package com.canterita.challenge.backend.test.model;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Setter
@Table(name = "DETAILS_ENTITY")
public class DetailsEntity {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "idOrder")
	private Long idOrder;
	
	@Column(name = "detail")
	private String detail;

	@Column(name = "amount")
	private Double amount;

    @Column(name = "unitPrice")
	private Double unitPrice;

    @Column(name = "totalDetail")
	private Double totalDetail;

}
