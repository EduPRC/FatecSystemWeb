package br.com.fatecwebsystem.websystem.service;

import br.com.fatecwebsystem.websystem.entity.Curso;
import br.com.fatecwebsystem.websystem.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso saveCurso(Curso curso) {

        return cursoRepository.save(curso);
    }

    public List<Curso> findAll() {

        return cursoRepository.findAll();
    }

    public void deleteCurso(Integer id) {

        cursoRepository.deleteById(id);
    }

    public Curso findById(Integer id){
        return cursoRepository.findById(id).orElse(null);
    }
}
