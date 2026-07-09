package dev.lucasmartins.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository será uma abstração para fazer as Queries no banco de dados
// o tipo é Long porque é o tipo do atributo 'id' da MissaoModel
public interface MissoesRepository extends JpaRepository<MissaoModel, Long> {
}
