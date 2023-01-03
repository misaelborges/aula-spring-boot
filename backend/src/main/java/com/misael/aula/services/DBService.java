package com.misael.aula.services;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misael.aula.Repositories.CategoriaRepository;
import com.misael.aula.Repositories.LivroRepository;
import com.misael.aula.domain.Categoria;
import com.misael.aula.domain.Livro;

@Service
public class DBService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;
    
    public void instanciaBaseDados() {
        Categoria categoria1 = new Categoria(null ,"Informatica", "Livro de TI");

	    Categoria categoria2 = new Categoria(null, "Ficção Cientifica", "Ficção Cientifica");
	
	    Categoria categoria3 = new Categoria(null, "Biografias", "Livro de Biografia");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsue", categoria1);

		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsun", categoria1);

		Livro l3 = new Livro(null, "The Time Machine", "H.G. Walls", "Lorem ipsun", categoria2);

		Livro l4 = new Livro(null, "The War Of The Worlds", "H.G. Walls", "Lorem ipsun", categoria2);

		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem ipsun", categoria2);

		categoria1.getLivros().addAll(Arrays.asList(l1, l2));
		categoria2.getLivros().addAll(Arrays.asList(l3, l4, l5));
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }
}
