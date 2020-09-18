package br.com.ntedencia.estagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ntedencia.estagio.entities.Category;
import br.com.ntedencia.estagio.services.CategoryService;

// recurso Web implementado por um controlador Rest
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	//Indicação de que o metodo responde o get do http
	@GetMapping
	
	public ResponseEntity<List<Category>> findAll(){
		
		//instaciação mocada
		//Category u = new Category(1L, "Maria", "maria@gmail", "99999", "123456");
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
