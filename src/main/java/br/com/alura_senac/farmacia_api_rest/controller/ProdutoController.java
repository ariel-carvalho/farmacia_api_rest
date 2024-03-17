package br.com.alura_senac.farmacia_api_rest.controller;

import br.com.alura_senac.farmacia_api_rest.DTO.DadosAtualizacaoProduto;
import br.com.alura_senac.farmacia_api_rest.DTO.DadosCadastroProduto;
import br.com.alura_senac.farmacia_api_rest.DTO.DadosListagemProduto;
import br.com.alura_senac.farmacia_api_rest.repository.ProdutoRepository;
import br.com.alura_senac.farmacia_api_rest.modelo.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController
{
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody @Valid DadosCadastroProduto dadosCadastroProduto)
    {
        produtoRepository.save(new Produto(dadosCadastroProduto));
    }

    @GetMapping
    public Page<DadosListagemProduto> listar(@PageableDefault(size = 1, sort = {"nome"}) Pageable paginacao)
    {
        return produtoRepository.findAll(paginacao).map(DadosListagemProduto::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoProduto dadosAtualizacaoProduto)
    {
        var produto = produtoRepository.getReferenceById(dadosAtualizacaoProduto.id());
        produto.atualizarInformacoes(dadosAtualizacaoProduto);
    }
}
