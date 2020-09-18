package br.com.ntedencia.estagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ntedencia.estagio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
