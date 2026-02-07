package com.example.CadastroFuncionarios.Funcinarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarTodos(){
        return funcionarioRepository.findAll();
    }





}
