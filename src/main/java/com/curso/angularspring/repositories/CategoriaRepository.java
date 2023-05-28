package com.curso.angularspring.repositories;

import com.curso.angularspring.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
