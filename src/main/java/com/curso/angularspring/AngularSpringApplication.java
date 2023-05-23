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
public class AngularSpringApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	public static void main(String[] args) {
		SpringApplication.run(AngularSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informatica","Livro de Informática");
		Livro l1 = new Livro(null,"Clean Code","Robert Martin","Loren Ipsum",cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));


	}
}
