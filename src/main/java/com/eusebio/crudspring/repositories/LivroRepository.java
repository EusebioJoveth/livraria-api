package com.eusebio.crudspring.repositories;

import com.eusebio.crudspring.domain.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
}
