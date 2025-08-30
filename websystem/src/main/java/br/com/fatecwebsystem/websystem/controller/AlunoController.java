package br.com.fatecwebsystem.websystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.service.AlunoService;


@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno/formularioAluno";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        alunoService.saveAluno(aluno);
        return "redirect:/alunos/listar";
    }
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Aluno> alunos = alunoService.findAll();
        model.addAttribute("alunos", alunos);
        return "aluno/listaAluno";
    }
    
    @GetMapping("/excluir/{id}")
    public String deletar(@PathVariable Integer id) {
        alunoService.deleteAluno(id);
        return "redirect:/alunos/listar";
    }

    @GetMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Integer id, Model model){
        Aluno aluno = alunoService.findById(id);
        model.addAttribute("aluno", aluno);
        return "aluno/formularioAluno";
    }


}
