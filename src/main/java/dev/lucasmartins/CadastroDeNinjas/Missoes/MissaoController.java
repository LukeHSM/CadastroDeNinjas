package dev.lucasmartins.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @GetMapping("/listar")
    public List<MissaoModel> listarMissoes(){
        return missaoService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissaoModel buscarMissaoPorID(@PathVariable Long id){
        return missaoService.buscarPorId(id);
    }

    @PostMapping("/criar")
    public MissaoModel criarMissao(@RequestBody MissaoModel missao){
        return missaoService.criarMissao(missao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missaoService.deletarMissao(id);
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso!";
    }


}
