package com.example.CadastroFuncionarios.Funcinarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarTodos(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel listarPorId(Long id){
        Optional<FuncionarioModel> funcionarioModel = funcionarioRepository.findById(id);
        return funcionarioModel.orElse(null);
    }

    public FuncionarioModel criarFuncionario(FuncionarioModel funcionarioModel){
        return funcionarioRepository.save(funcionarioModel);
    }







}
