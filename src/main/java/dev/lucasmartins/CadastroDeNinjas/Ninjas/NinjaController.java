package dev.lucasmartins.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/buscar-por-id")
    public String buscarNinjaPorID(){
        return "Buscando ninja pelo ID...";
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
