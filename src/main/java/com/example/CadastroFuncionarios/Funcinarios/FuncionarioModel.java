package com.example.CadastroFuncionarios.Funcinarios;

import com.example.CadastroFuncionarios.Objetivos.ObjetivosModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_funcionarios")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "tb_objetivos")
    private List<ObjetivosModel> objetivosModels;


}
