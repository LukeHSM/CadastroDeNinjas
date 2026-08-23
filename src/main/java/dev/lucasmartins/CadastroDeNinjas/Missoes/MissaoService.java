package dev.lucasmartins.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    // Listar
    public List<MissaoModel> listarMissoes(){
        return missaoRepository.findAll();
    }

    // Listar por ID
    public MissaoModel buscarPorId(Long id){
        Optional<MissaoModel> missao = missaoRepository.findById(id);
        return missao.orElse(null);
    }

    // Criar
    public MissaoModel criarMissao(MissaoModel missao){
        return missaoRepository.save(missao);
    }

    // Deletar
    public void deletarMissao(Long id){
        missaoRepository.deleteById(id);
    }

    // Alterar
}
