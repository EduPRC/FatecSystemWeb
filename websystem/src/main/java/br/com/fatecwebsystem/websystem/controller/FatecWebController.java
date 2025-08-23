package br.com.fatecwebsystem.websystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/fatecweb")
public class FatecWebController {

    @GetMapping
    public String index(Model model) {
        return "/index";
    }
    

}
