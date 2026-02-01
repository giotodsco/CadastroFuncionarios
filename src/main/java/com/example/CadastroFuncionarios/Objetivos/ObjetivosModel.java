package com.example.CadastroFuncionarios.Objetivos;

import com.example.CadastroFuncionarios.Funcinarios.FuncionarioModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class ObjetivosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String descricao;

    @OneToMany(mappedBy = "objetivosModels")
    private List<FuncionarioModel> funcionarioModel;
}
