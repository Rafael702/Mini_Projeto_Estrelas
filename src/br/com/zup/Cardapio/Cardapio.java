package br.com.zup.Cardapio;

import br.com.zup.Jantar.Jantar;
import br.com.zup.LancheDaTarde.LancheDaTarde;
import br.com.zup.Almoco.Almoco;
import br.com.zup.CafeDaManha.CafeDaManha;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    CafeDaManha cafe;
    private List<CafeDaManha> cafeDaManha = new ArrayList<>();
    private List<Almoco> almoco = new ArrayList<>();
    private List<LancheDaTarde> lancheDaTarde = new ArrayList<>();
    private List<Jantar> jantar = new ArrayList<>();

    // Método construtor
    public Cardapio() {
    }

    // Método para adicionar alimentos
    public CafeDaManha adicionarAlimentoNoCafedaManha(CafeDaManha adicionarRefeicao1) {
        cafeDaManha.add(adicionarRefeicao1);
        return adicionarRefeicao1;
    }

    public Almoco adicionarAlimentoNoAlmoco(Almoco adicionarRefeicao2) {
        almoco.add(adicionarRefeicao2);
        return adicionarRefeicao2;
    }

    public LancheDaTarde adicionarAlimentoNoLancheDaTarde(LancheDaTarde adicionarRefeicao4) {
        lancheDaTarde.add(adicionarRefeicao4);
        return adicionarRefeicao4;
    }

    public Jantar adicionarAlimentoNoJantar(Jantar adicionarRefeicao3) {
        jantar.add(adicionarRefeicao3);
        return adicionarRefeicao3;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n *** Opções para o Café da manhã *** " + cafeDaManha);
        dados.append("\n *** Opções para o almoco ***" + almoco);
        dados.append("\n *** Opções para o lanche da tarde ***" + lancheDaTarde);
        dados.append("\n *** Opções para o jantar *** " + jantar);
        return dados.toString();
    }
}
