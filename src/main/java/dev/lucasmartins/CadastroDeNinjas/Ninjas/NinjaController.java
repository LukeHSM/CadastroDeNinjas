package dev.lucasmartins.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/listar")
    public String listarNinjas(){
        return "Lista de ninjas:";
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
