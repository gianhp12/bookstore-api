package com.curso.angularspring.resources;

import com.curso.angularspring.domain.Livro;
import com.curso.angularspring.dto.LivroDTO;
import com.curso.angularspring.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/livros")
public class LivroResource {
    @Autowired
    LivroService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> findLivroById(@PathVariable Integer id){
        Livro livro = service.getLivroByID(id);
        return ResponseEntity.ok().body(livro);
    }
    @GetMapping()
    public ResponseEntity<List<LivroDTO>> findAll(){
        List<Livro> list = service.findAll();
        List<LivroDTO> listDTO = list.stream().map(obj -> new LivroDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    @PostMapping
    public ResponseEntity<Livro> create(@RequestParam(value = "categoria", defaultValue = "0") Integer id_cat,@Valid @RequestBody Livro obj){
        Livro newObj = service.create(id_cat,obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("livros/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<LivroDTO> update(@PathVariable Integer id,@Valid @RequestBody LivroDTO objDto){
        Livro newObj = service.update(id,objDto);
        return ResponseEntity.ok().body(new LivroDTO(newObj));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
