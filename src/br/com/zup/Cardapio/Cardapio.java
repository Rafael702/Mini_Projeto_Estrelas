package src.br.com.zup.Cardapio;

import src.br.com.zup.Jantar.Jantar;
import src.br.com.zup.LancheDaTarde.LancheDaTarde;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<br.com.zup.CafeDaManha.CafeDaManha> cafeDaManha = new ArrayList<>();
    private List<br.com.zup.Almoco.Almoco> almoco = new ArrayList<>();
    private List<LancheDaTarde> lancheDaTarde = new ArrayList<>();
    private List<Jantar> jantar = new ArrayList<>();
    private List<br.com.zup.RefeicoesDiarias.RefeicoesDiarias> refeicoesDiarias = new ArrayList<>();

    // Método construtor
    public Cardapio() {
    }

    // Métodos getters e setters


    // Método toString
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n Opções para o Café da manhã: " + cafeDaManha);
        dados.append("\n Opções para o almoco: " + almoco);
        dados.append("\n Opções para o lanche da tarde: " + lancheDaTarde);
        dados.append("\n Opções para o jantar: " + jantar);
        return dados.toString();
    }
}
