package com.misael.aula.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misael.aula.Repositories.CategoriaRepository;
import com.misael.aula.domain.Categoria;
import com.misael.aula.services.exceptions.ObjectNotFountException;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Long id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFountException("Objeto não encontrado! Id: " + id + ", tipo: " + Categoria.class.getName()));
    }
}
