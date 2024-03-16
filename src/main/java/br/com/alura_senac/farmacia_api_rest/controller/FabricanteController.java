package br.com.alura_senac.farmacia_api_rest.controller;

import br.com.alura_senac.farmacia_api_rest.fabricante.DadosCadastroFabricante;
import br.com.alura_senac.farmacia_api_rest.fabricante.Fabricante;
import br.com.alura_senac.farmacia_api_rest.fabricante.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fabricantes")
public class FabricanteController
{
    @Autowired
    private FabricanteRepository fabricanteRepository;

    @PostMapping
    public void cadastrarFabricante(@RequestBody DadosCadastroFabricante dadosCadastroFabricante)
    {
        fabricanteRepository.save(new Fabricante(dadosCadastroFabricante));
    }
}
