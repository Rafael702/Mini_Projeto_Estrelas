package br.com.zup.Jantar;

public class Jantar extends br.com.zup.RefeicoesDiarias.RefeicoesDiarias {

    // Método construtor
    public Jantar() {
    }

    public Jantar(String nomeDoAlimento, double qtdDeCaloria) {
        super(nomeDoAlimento, qtdDeCaloria);
    }

    // Métodos getters e setters
    @Override
    public String getNomeDoAlimento() {
        return super.getNomeDoAlimento();
    }

    @Override
    public void setNomeDoAlimento(String nomeDoAlimento) {
        super.setNomeDoAlimento(nomeDoAlimento);
    }

    @Override
    public double getQtdDeCaloria() {
        return super.getQtdDeCaloria();
    }

    @Override
    public void setQtdDeCaloria(double qtdDeCaloria) {
        super.setQtdDeCaloria(qtdDeCaloria);
    }
}
