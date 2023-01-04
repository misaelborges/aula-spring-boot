package com.misael.aula.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misael.aula.domain.Categoria;
import com.misael.aula.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        Categoria obj = categoriaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
