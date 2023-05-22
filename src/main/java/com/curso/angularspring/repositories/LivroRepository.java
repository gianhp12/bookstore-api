package com.curso.angularspring.repositories;

import com.curso.angularspring.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Integer> {
}
