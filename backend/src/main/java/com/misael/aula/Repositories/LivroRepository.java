package com.misael.aula.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.misael.aula.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    
}
