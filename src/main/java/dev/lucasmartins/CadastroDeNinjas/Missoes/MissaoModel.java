package dev.lucasmartins.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.lucasmartins.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private rankMissao rank;

    @OneToMany(mappedBy = "missao")
    @JsonIgnore
    private List<NinjaModel> ninjas;

    enum rankMissao {
        S("Rank S: Missão de alto risco, geralmente envolvendo alvos extremamente perigosos ou tarefas que exigem habilidades excepcionais."),
        A("Rank A: Missão de risco moderado, envolvendo alvos de grande importância."),
        B("Rank B: Missão de risco baixo, envolvendo alvos de menor importância."),
        C("Rank C: Missão de risco muito baixo, envolvendo tarefas rotineiras."),
        D("Rank D: Missão de risco mínimo, envolvendo tarefas de apoio.");

        private final String descricao;

        rankMissao(String descricao) {
            this.descricao = descricao;
        }
    }


}