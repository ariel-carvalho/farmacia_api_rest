package br.com.alura_senac.farmacia_api_rest.fabricante;

import br.com.alura_senac.farmacia_api_rest.produto.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Fabricante
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    @OneToMany(mappedBy = "fabricante")
    private List<Produto> produto;
}
