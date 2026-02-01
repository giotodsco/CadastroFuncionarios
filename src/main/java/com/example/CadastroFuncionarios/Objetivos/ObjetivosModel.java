package com.example.CadastroFuncionarios.Objetivos;

import com.example.CadastroFuncionarios.Funcinarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_objetivos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObjetivosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String descricao;

    @OneToMany(mappedBy = "objetivosModels")
    private List<FuncionarioModel> funcionarioModel;
}
