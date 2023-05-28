package com.curso.angularspring.dto;

import com.curso.angularspring.domain.Categoria;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

public class CategoriaDTO implements Serializable {
    private Integer id;
    @NotEmpty(message = "Campo nome é requerido")
    @Length(min = 3,max = 100,message = "O campo nome deve ter entre 3 e 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo descrição é requerido")
    @Length(min = 3,max = 200,message = "O campo descrição deve ter entre 3 e 200 caracteres")
    private String descricao;

    public CategoriaDTO() {
        super();
    }

    public CategoriaDTO(Categoria obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
