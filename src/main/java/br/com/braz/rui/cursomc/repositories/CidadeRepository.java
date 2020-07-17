package br.com.braz.rui.cursomc.repositories;

import br.com.braz.rui.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
