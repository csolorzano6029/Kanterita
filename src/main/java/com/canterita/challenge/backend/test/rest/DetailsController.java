package com.canterita.challenge.backend.test.rest;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;
import com.canterita.challenge.backend.test.service.IDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/orders")
public class DetailsController {
    
    @Autowired
	private IDetailsService orderDetailsService;

    @GetMapping(value = "/{idOrder}/details")
	@ResponseStatus(HttpStatus.OK)
	public ArrayList<DetailsEntity> getByIdOrder(@PathVariable("idOrder") Long id){
		return this.orderDetailsService.getByIdOrder(id);
	}

	@GetMapping(value = "/details")
	public ArrayList<DetailsEntity>showDetails(){
		return orderDetailsService.showDetails();
	}

	@PostMapping(value = "/{id}/details")
	public DetailsEntity saveDetails(@RequestBody OrderDetailsDto order, @PathVariable("id") Long id){
		return this.orderDetailsService.saveDetails(order,id);
	}
	@DeleteMapping(value = "/{id}/details")
	public String delete(@PathVariable("id") Long id){
		boolean ok = this.orderDetailsService.delete(id);
		if (ok){
			return "Detalle con id "+id+" eliminado";
		}else {
			return "No se pudo eliminar la orden con id "+id;
		}
	}

}
