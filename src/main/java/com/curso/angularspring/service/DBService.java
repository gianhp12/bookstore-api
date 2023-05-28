package com.curso.angularspring.service;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.domain.Livro;
import com.curso.angularspring.repositories.CategoriaRepository;
import com.curso.angularspring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;
    public void instanciaBaseDeDados(){
        Categoria cat1 = new Categoria(null,"Informatica","Livro de Informática");
        Livro l1 = new Livro(null,"Clean Code","Robert Martin","Loren Ipsum",cat1);

        this.categoriaRepository.save(cat1);
        this.livroRepository.save(l1);

        System.out.println("Registros salvos co sucesso");

    }
}
