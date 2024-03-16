package br.com.alura_senac.farmacia_api_rest.produto;

import jakarta.persistence.*;

import br.com.alura_senac.farmacia_api_rest.fabricante.Fabricante;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
}
