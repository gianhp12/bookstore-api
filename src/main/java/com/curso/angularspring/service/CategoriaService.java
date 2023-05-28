package com.curso.angularspring.service;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.dto.CategoriaDTO;
import com.curso.angularspring.repositories.CategoriaRepository;
import com.curso.angularspring.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;
    public Categoria findByID(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()));
    }
    public List<Categoria> findAll(){
        return repository.findAll();
    }
    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }

    public Categoria update(Integer id, CategoriaDTO objDto) {
        Categoria obj = findByID(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }
}
