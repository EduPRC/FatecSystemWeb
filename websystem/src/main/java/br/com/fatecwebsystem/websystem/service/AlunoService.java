package br.com.fatecwebsystem.websystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.repository.AlunoRepository;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno saveAluno(Aluno aluno) {

        return alunoRepository.save(aluno);
    }

    public List<Aluno> findAll() {

        return alunoRepository.findAll();
    }

    public void deleteAluno(Integer id) {

        alunoRepository.deleteById(id);
    }

    public Aluno findById(Integer id){
        return alunoRepository.findById(id).orElse(null);
    }
   

}
