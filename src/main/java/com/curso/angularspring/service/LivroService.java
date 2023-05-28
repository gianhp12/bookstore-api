package com.curso.angularspring.service;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.domain.Livro;
import com.curso.angularspring.dto.LivroDTO;
import com.curso.angularspring.repositories.LivroRepository;
import com.curso.angularspring.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;
    @Autowired
    private CategoriaService categoriaService;
    public Livro getLivroByID(Integer id){
        Optional<Livro> livro  = repository.findById(id);
        return livro.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo: " + Livro.class.getName()));
    }
    public List<Livro> findAll(){
        return repository.findAll();
    }
    public Livro create(Integer id_cat,Livro obj){
        obj.setId(null);
        Categoria cat = categoriaService.findByID(id_cat);
        obj.setCategoria(cat);
        return repository.save(obj);
    }
    public Livro update(Integer id, LivroDTO objDto) {
        Livro obj = getLivroByID(id);
        obj.setNome_autor(objDto.getNome_autor());
        obj.setTitulo(objDto.getTitulo());
        obj.setTexto(objDto.getTexto());
        return repository.save(obj);
    }
    public void delete(Integer id) {
        getLivroByID(id);
        repository.deleteById(id);
    }
}
