package br.com.zup.cardapio;

import br.com.zup.apagar.cafedamanha.CafeDaManha;
import br.com.zup.refeicoesdiarias.RefeicoesDiarias;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<RefeicoesDiarias> refeicoesDiarias = new ArrayList<>();

    // Método construtor
    public Cardapio() {
    }

    // Método para adicionar alimentos
    public RefeicoesDiarias adicionarRefeicao(RefeicoesDiarias refeicao) {
        refeicoesDiarias.add(refeicao);
        return refeicao;

    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n *** Opções de refeição *** " + refeicoesDiarias);
        return dados.toString();
    }
}
