package com.eusebio.crudspring;

import java.util.Arrays;

import com.eusebio.crudspring.domain.Categoria;
import com.eusebio.crudspring.domain.Livro;
import com.eusebio.crudspring.repositories.CategoriaRepository;
import com.eusebio.crudspring.repositories.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de Informática");

		Livro l1 = new Livro(null, "Angular", "Rui Caetano", "Lorem ipson", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
		
	}

}
