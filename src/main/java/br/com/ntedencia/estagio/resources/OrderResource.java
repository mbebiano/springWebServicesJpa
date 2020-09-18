package br.com.ntedencia.estagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ntedencia.estagio.entities.Order;
import br.com.ntedencia.estagio.services.OrderService;

// recurso Web implementado por um controlador Rest
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	//Indicação de que o metodo responde o get do http
	@GetMapping
	
	public ResponseEntity<List<Order>> findAll(){
		
		//instaciação mocada
		//Order u = new Order(1L, "Maria", "maria@gmail", "99999", "123456");
		
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
