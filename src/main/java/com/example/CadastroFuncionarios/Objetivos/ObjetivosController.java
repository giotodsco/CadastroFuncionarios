package com.example.CadastroFuncionarios.Objetivos;


import com.example.CadastroFuncionarios.Funcinarios.FuncionarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("objetivos")
public class ObjetivosController {

    @Autowired
    private ObjetivosService service;

    //  CREATE
    @PostMapping("/createObj")
    public String createObj(){
        return "create";
    }

    // READ
    @GetMapping("/find/all")
    public List<ObjetivosModel> getAllObj(){
        return service.allObjects();
    }
    // READ PER ID
    @GetMapping("/find/{id}")
    public ObjetivosModel getIdObj(@PathVariable Long id){
        return service.listarObjects(id);
    }

    // UPDATE
    @PutMapping("/alterarObj")
    public String alterarObj(){
        return "alterarObj";
    }

    // DELETE
    @DeleteMapping("/deleteObj")
    public String deleteObj(){
        return "delete";
    }
}
