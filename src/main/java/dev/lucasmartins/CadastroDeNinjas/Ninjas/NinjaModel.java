package dev.lucasmartins.CadastroDeNinjas.Ninjas;

import dev.lucasmartins.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ninja")
    private Long id;

    @Column(name = "nome_ninja")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade_ninja")
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;

}
