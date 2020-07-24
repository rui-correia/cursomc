package br.com.braz.rui.cursomc.repositories;

import br.com.braz.rui.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
