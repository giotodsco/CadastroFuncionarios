package com.example.CadastroFuncionarios.Funcinarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    // Adicionar Funcionario (CREATE)
    @PostMapping("/create")
    public String createFuncionario(){
        return "create";
    }

    // Procurar Funcionario por ID (READ)
    @GetMapping ("/findid")
    public String findFuncionarioId(){
        return "find";
    }


    // Mostrar Funcionarios (READ)
    @GetMapping ("/all")
    public String findFuncionariosAll(){
        return "all";
    }

    // Alterar dados dos Funcionarios (UPTADE)
    @PutMapping ("/alterar")
    public String alterarFuncionario(){
        return "alterar";
    }

    // Deletar Funcionario (DELETE)

    @DeleteMapping("/delete")
    public  String deleteFuncionario(){
        return "delete";
    }

}
