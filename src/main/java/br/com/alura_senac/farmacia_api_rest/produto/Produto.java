package br.com.alura_senac.farmacia_api_rest.produto;

import br.com.alura_senac.farmacia_api_rest.fabricante.Fabricante;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Produto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String descricao;
    double preco;
    @ManyToOne
    Fabricante fabricante;

    public Produto(DadosCadastroProduto dadosCadastroProduto)
    {
        this.nome = dadosCadastroProduto.nome();
        this.descricao = dadosCadastroProduto.descricao();
        this.preco = dadosCadastroProduto.preco();
        this.fabricante = new Fabricante(dadosCadastroProduto.dadosCadastroFabricante());
    }
}
