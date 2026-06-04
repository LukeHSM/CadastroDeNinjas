package dev.lucasmartins.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissaoController {

    @GetMapping("/missoes")
    public String verMissoes(){
        return "Relações Ninja / Missões:";
    }
}
