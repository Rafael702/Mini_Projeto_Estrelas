package br.com.zup.Almoco;

import br.com.zup.RefeicoesDiarias.RefeicoesDiarias;

public class Almoco extends RefeicoesDiarias {

    public Almoco(String nomeDoAlimento, double qtdDeCaloria) {
        super(nomeDoAlimento, qtdDeCaloria);
    }

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

    @Override
    public String toString() {
        return super.toString();
    }

}

