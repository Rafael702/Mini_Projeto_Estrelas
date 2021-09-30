package br.com.zup.RefeicoesDiarias;

public class RefeicoesDiarias {

    private String nomeDoAlimento;
    private double qtdDeCaloria;

    public RefeicoesDiarias(){

    }
    public RefeicoesDiarias(String nomeDoAlimento, double qtdDeCaloria) {
        this.nomeDoAlimento = nomeDoAlimento;
        this.qtdDeCaloria = qtdDeCaloria;
    }

    public String getNomeDoAlimento() {
        return nomeDoAlimento;
    }

    public void setNomeDoAlimento(String nomeDoAlimento) {
        this.nomeDoAlimento = nomeDoAlimento;
    }

    public double getQtdDeCaloria() {
        return qtdDeCaloria;
    }

    public void setQtdDeCaloria(double qtdDeCaloria) {
        this.qtdDeCaloria = qtdDeCaloria;
    }

    // Método para adicionar caloria
    public double adicionarCaloria(double qtdDeCaloria){
        return this.qtdDeCaloria += qtdDeCaloria;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do alimento: " + nomeDoAlimento);
        dados.append("\nQuantidade de caloria: " + qtdDeCaloria);
        return dados.toString();
    }

}
