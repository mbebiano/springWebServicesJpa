package br.com.ntedencia.estagio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ntedencia.estagio.entities.Product;
import br.com.ntedencia.estagio.repositories.ProductRepository;

// Registrar o componente para que ele possa ser injetado pelo Spring @Component
// Uso do @Service se dá para que fique mais correta a semântica

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		// tipo optional retorna um erro ou o resultado, evitando as excessões
		Optional<Product> obj= repository.findById(id);
		return obj.get();
	}
}
