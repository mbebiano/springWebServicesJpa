package br.com.ntedencia.estagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ntedencia.estagio.entities.User;
import br.com.ntedencia.estagio.services.UserService;

// recurso Web implementado por um controlador Rest
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	//Indicação de que o metodo responde o get do http
	@GetMapping
	
	public ResponseEntity<List<User>> findAll(){
		
		//instaciação mocada
		//User u = new User(1L, "Maria", "maria@gmail", "99999", "123456");
		
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
