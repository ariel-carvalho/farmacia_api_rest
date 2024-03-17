package br.com.alura_senac.farmacia_api_rest.DTO;

import br.com.alura_senac.farmacia_api_rest.modelo.Fabricante;
import br.com.alura_senac.farmacia_api_rest.modelo.Produto;

public record DadosListagemProduto(String nome, String descricao, double preco, Fabricante fabricante)
{
    public DadosListagemProduto(Produto produto)
    {
        this(produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getFabricante());
    }
}
