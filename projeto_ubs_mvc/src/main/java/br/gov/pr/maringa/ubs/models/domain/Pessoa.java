package br.gov.pr.maringa.ubs.models.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private String telefone;

    private String email;

    private String dataNascimento;

    private String sexo;

    private String estadoCivil;

    private String nacionalidade;

    private String naturalidade;

    @OneToMany
    private List<Endereco> endereco;

}
