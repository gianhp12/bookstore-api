package com.curso.angularspring.service;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;
    public Categoria findByID(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
