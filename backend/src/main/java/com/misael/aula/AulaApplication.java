package com.misael.aula;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.misael.aula.Repositories.CategoriaRepository;
import com.misael.aula.Repositories.LivroRepository;
import com.misael.aula.domain.Categoria;
import com.misael.aula.domain.Livro;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria = new Categoria(null ,"Informatica", "Livro de TI");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsue", categoria);

		categoria.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(categoria));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}

}
