package br.com.fatecwebsystem.websystem.repository;

import br.com.fatecwebsystem.websystem.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
