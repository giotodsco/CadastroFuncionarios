package com.example.CadastroFuncionarios.Funcinarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {

    @GetMapping("/rotaB")
    public String rota(){
        return "Rota teste";
    }

}
