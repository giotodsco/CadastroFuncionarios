package com.example.CadastroFuncionarios.Objetivos;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("objetivos")
public class ObjetivosController {

    //  CREATE
    @PostMapping("/createObj")
    public String createObj(){
        return "create";
    }

    // READ
    @GetMapping("/getAllObj")
    public String getAllObj(){
        return "getAllObj";
    }
    // READ PER ID
    @GetMapping("/getIdObj")
    public String getIdObj(){
        return "getIdObj";
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
