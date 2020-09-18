package br.com.ntedencia.estagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ntedencia.estagio.entities.Product;

// poderia adicionar @Repository para a injeção do User repository.
//Porém por herdar de JpaRepository o uso não é necessário

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
