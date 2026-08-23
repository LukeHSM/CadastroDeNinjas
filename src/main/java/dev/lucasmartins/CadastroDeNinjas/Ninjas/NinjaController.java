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

    @GetMapping("/listar/{id}")
    public NinjaModel buscarPorID(@PathVariable Long id){
        return ninjaService.buscarNinjaPorID(id);
    }

    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    @PutMapping("/alterar")
    public String alterarNinja(){
        return "Ninja alterado com sucesso!";
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){  ninjaService.deletarNinja(id);}

}
