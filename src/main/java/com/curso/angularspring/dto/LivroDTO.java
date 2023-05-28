package com.curso.angularspring.dto;

import com.curso.angularspring.domain.Livro;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

public class LivroDTO implements Serializable {
    @NotEmpty(message = "O campo titulo não pode ser vazio")
    @Length(min = 3,max = 50,message = "O campo titulo deve ter entre 3 a 50 caracteres")
    private String titulo;
    @NotEmpty(message = "O campo nome_autor não pode ser vazio")
    @Length(min = 3,max = 50,message = "O campo nome_autor deve ter entre 3 a 50 caracteres")
    private String nome_autor;
    @NotEmpty(message = "O campo texto não pode ser vazio")
    @Length(min = 10,max = 2000000,message = "O campo texto deve ter entre 3 a 2.000.000 caracteres")
    private String texto;

    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        this.titulo = obj.getTitulo();
        this.nome_autor = obj.getNome_autor();
        this.texto = obj.getTexto();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
