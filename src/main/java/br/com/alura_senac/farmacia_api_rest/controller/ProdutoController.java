package br.com.alura_senac.farmacia_api_rest.controller;

import br.com.alura_senac.farmacia_api_rest.produto.DadosCadastroProduto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController
{
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroProduto dadosCadastroProduto)
    {
        System.out.println(dadosCadastroProduto);
    }
}
