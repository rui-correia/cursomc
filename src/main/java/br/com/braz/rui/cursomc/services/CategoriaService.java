package br.com.braz.rui.cursomc.services;

import br.com.braz.rui.cursomc.domain.Categoria;
import br.com.braz.rui.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional <Categoria> categoria = repo.findById(id);
        return categoria.orElse(null);
    }
}
