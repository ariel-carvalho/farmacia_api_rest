package br.com.alura_senac.farmacia_api_rest.produto;


import br.com.alura_senac.farmacia_api_rest.fabricante.DadosCadastroFabricante;

public record DadosCadastroProduto
        (
                String nome,
                String descricao,
                double preco,
                DadosCadastroFabricante dadosCadastroFabricante
        ){}
