package br.com.ntedencia.estagio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ntedencia.estagio.entities.User;

// recurso Web implementado por um controlador Rest
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//Indicação de que o metodo responde o get do http
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail", "99999", "123456");
		return ResponseEntity.ok().body(u);
	}
}