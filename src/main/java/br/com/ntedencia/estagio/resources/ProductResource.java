package br.com.ntedencia.estagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ntedencia.estagio.entities.Product;
import br.com.ntedencia.estagio.services.ProductService;

// recurso Web implementado por um controlador Rest
@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	//Indicação de que o metodo responde o get do http
	@GetMapping
	
	public ResponseEntity<List<Product>> findAll(){
		
		//instaciação mocada
		//Product u = new Product(1L, "Maria", "maria@gmail", "99999", "123456");
		
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
