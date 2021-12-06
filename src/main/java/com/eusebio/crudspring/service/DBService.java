package com.eusebio.crudspring.service;

import java.util.Arrays;

import com.eusebio.crudspring.domain.Categoria;
import com.eusebio.crudspring.domain.Livro;
import com.eusebio.crudspring.repositories.CategoriaRepository;
import com.eusebio.crudspring.repositories.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

    public void instancieaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informática", "Livros de Informática");
		Categoria cat2 = new Categoria(null, "Geologia", "Geologos Não gostam");
		Categoria cat3 = new Categoria(null, "Ficção cintífica", "Coisas do da imaginação");
		Categoria cat4= new Categoria(null, "História", "Quem pensa enriquece");

		Livro l1 = new Livro(null, "Angular", "Rui Caetano", "Lorem ipson", cat1);
		Livro l2 = new Livro(null, "Clean Code", "Eusebio Joveth", "Marco vambastem", cat2);
		Livro l3 = new Livro(null, "Do mil ao Milhão", "Robert Hill", "Lorem ipson", cat4);
		Livro l4 = new Livro(null, "Spring", "Loiane Gronner", "Lorem ipson", cat1);
		Livro l5 = new Livro(null, "Senhor dos anêis", "Hanry Potter", "Filme", cat3);
		Livro l6 = new Livro(null, "Pai Rico Pai Pobre", "Json Albert", "Livro motivacional", cat4);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.livroRepository.saveAll(Arrays.asList(l1, l2,l3,l4,l5,l6));

    }
    
}
