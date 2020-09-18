package br.com.ntedencia.estagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ntedencia.estagio.entities.User;

// poderia adicionar @Repository para a injeção do User repository.
//Porém por herdar de JpaRepository o uso não é necessário

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
