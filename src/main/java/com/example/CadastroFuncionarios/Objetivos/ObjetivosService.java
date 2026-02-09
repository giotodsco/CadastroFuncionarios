package com.example.CadastroFuncionarios.Objetivos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetivosService {

    @Autowired
    private ObjetivosRepository objetivosRepository;

    public List<ObjetivosModel> allObjects(){
        return objetivosRepository.findAll();
    }

    public ObjetivosModel listarObjects(Long id){
        Optional<ObjetivosModel> ninjaPerId = objetivosRepository.findById(id);
        return ninjaPerId.orElse(null);
    }
}
