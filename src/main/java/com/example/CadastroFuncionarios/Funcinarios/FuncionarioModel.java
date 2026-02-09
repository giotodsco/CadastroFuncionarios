package com.example.CadastroFuncionarios.Funcinarios;

import com.example.CadastroFuncionarios.Objetivos.ObjetivosModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_funcionarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioModel {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String cargo;

    @ManyToOne
    @JoinColumn(name = "tb_objetivos")
    @JsonBackReference
    private ObjetivosModel objetivosModels;


}
