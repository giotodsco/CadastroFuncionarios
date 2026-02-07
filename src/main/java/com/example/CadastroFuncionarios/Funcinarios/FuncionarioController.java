package com.example.CadastroFuncionarios.Funcinarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionariosService service;

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
    public List<FuncionarioModel> findFuncionariosAll(){
        return service.listarTodos();
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
