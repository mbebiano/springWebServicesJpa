package br.com.ntedencia.estagio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ntedencia.estagio.entities.Category;
import br.com.ntedencia.estagio.repositories.CategoryRepository;

// Registrar o componente para que ele possa ser injetado pelo Spring @Component
// Uso do @Service se dá para que fique mais correta a semântica

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		// tipo optional retorna um erro ou o resultado, evitando as excessões
		Optional<Category> obj= repository.findById(id);
		return obj.get();
	}
}
