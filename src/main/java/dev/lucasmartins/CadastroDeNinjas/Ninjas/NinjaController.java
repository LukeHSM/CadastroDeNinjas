package dev.lucasmartins.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/buscar/{id}")
    public NinjaModel buscarPorID(@PathVariable Long id){
        return ninjaService.buscarNinjaPorID(id);
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado com sucesso!";
    }

    @PutMapping("/alterar")
    public String alterarNinja(){
        return "Ninja alterado com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deletarNinja(){  return "Ninja deletado com sucesso!";}

}
