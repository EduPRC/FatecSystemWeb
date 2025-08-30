package br.com.fatecwebsystem.websystem.controller;

import br.com.fatecwebsystem.websystem.entity.Curso;
import br.com.fatecwebsystem.websystem.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("curso", new Curso());
        return "curso/formularioCurso";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Curso curso) {
        cursoService.saveCurso(curso);
        return "redirect:/cursos/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Curso> cursos = cursoService.findAll();
        model.addAttribute("cursos", cursos);
        return "curso/listaCurso";
    }

    @GetMapping("/excluir/{id}")
    public String deletar(@PathVariable Integer id) {
        cursoService.deleteCurso(id);
        return "redirect:/cursos/listar";
    }

    @GetMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Integer id, Model model){
        Curso curso = cursoService.findById(id);
        model.addAttribute("curso", curso);
        return "curso/formularioCurso";
    }
}
