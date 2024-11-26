package org.senac.aula01.controller;

import org.senac.aula01.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> listarProdutos() {
        return Arrays.asList(
                new Produto() {{
                    setId(1);
                    setNome("Paleta Naked");
                    setDescricao("Paleta de maquiagem com tons neutros.");
                    setPreco(299.00);
                    setImagem("paleta-naked.jpg");
                }},
                new Produto() {{
                    setId(2);
                    setNome("Gel de Limpeza Neutrogena");
                    setDescricao("Gel para limpeza profunda da pele.");
                    setPreco(49.90);
                    setImagem("gel-limpeza-neutrogena.jpg");
                }},
                new Produto() {{
                    setId(3);
                    setNome("Colar da Vivara");
                    setDescricao("Elegante colar para qualquer ocasião.");
                    setPreco(450.00);
                    setImagem("colar-vivara.jpg");
                }}
        );
    }
}
