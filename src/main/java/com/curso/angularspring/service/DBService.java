package com.curso.angularspring.service;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.domain.Livro;
import com.curso.angularspring.repositories.CategoriaRepository;
import com.curso.angularspring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;
    public void instanciaBaseDeDados(){
        Categoria cat1 = new Categoria(null,"Informatica","Livro de Informática");
        Livro l1 = new Livro(null,"Clean Code","Robert Martin","Loren Ipsum",cat1);

        cat1.getLivros().addAll(Arrays.asList(l1));

        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));

    }
}
