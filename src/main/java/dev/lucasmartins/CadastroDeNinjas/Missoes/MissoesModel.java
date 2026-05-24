package dev.lucasmartins.CadastroDeNinjas.Missoes;

import dev.lucasmartins.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private rankMissao rank;
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nome, rankMissao rank, List<NinjaModel> ninjas) {
        this.nome = nome;
        this.rank = rank;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public rankMissao getRank() {
        return rank;
    }

    public void setRank(rankMissao rank) {
        this.rank = rank;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }

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