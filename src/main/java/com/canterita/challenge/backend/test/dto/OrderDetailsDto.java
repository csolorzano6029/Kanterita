package com.canterita.challenge.backend.test.dto;

import lombok.*;

@AllArgsConstructor
@Data
public class OrderDetailsDto {

	private Long id;
	
	private Long idOrder;

	private String detail;
	
	private Double amount;

	private Double unitPrice;

	private Double totalDetail;
	
}
