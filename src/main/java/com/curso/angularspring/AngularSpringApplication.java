package com.curso.angularspring;

import com.curso.angularspring.domain.Categoria;
import com.curso.angularspring.domain.Livro;
import com.curso.angularspring.repositories.CategoriaRepository;
import com.curso.angularspring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AngularSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(AngularSpringApplication.class, args);
	}
}
