package br.com.alura_senac.farmacia_api_rest.controller;

import br.com.alura_senac.farmacia_api_rest.produto.DadosCadastroProduto;
import br.com.alura_senac.farmacia_api_rest.produto.Produto;
import br.com.alura_senac.farmacia_api_rest.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController
{
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroProduto dadosCadastroProduto)
    {
        produtoRepository.save(new Produto(dadosCadastroProduto));
    }
}
