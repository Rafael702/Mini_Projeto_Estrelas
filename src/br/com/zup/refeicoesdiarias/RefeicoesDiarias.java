package br.com.zup.refeicoesdiarias;

import br.com.zup.imc.Imc;

import java.util.Scanner;

import static br.com.zup.refeicoesdiarias.TipoRefeicao.*;

public class RefeicoesDiarias extends Imc {

    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private String nomeDoAlimento;
    private double qtdDeCaloria;
    TipoRefeicao tipoRefeicao;

    public RefeicoesDiarias() {

    }

    public RefeicoesDiarias(String refeicao) {
        this.tipoRefeicao = valueOf(refeicao);
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
    public double somarCaloria(double qtdDeCaloria) {
        return this.qtdDeCaloria += qtdDeCaloria;
    }

    public static TipoRefeicao getTipoRefeicao(int opcao) {

        switch (opcao) {
            case 1:
                System.out.println("--- Café da manhã ---");
                return TipoRefeicao.DESJEJUM;

            case 2:
                System.out.println("--- Almoço ---");
                return TipoRefeicao.ALMOCO;

            case 3:
                System.out.println("--- Lanche da Tarde ---");
                return TipoRefeicao.LANCHE;

            case 4:
                System.out.println("--- Jantar ---");
                return TipoRefeicao.JANTAR;

            default:
                throw new IllegalArgumentException("Opção inválida ");
        }
    }

    public void setTipoRefeicao(TipoRefeicao tipoRefeicao){
        this.tipoRefeicao = tipoRefeicao;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n--- Cardápio do " + tipoRefeicao.toString() + " ---");
        dados.append("\nNome do alimento: " + nomeDoAlimento);
        dados.append("\nQuantidade de caloria: " + qtdDeCaloria);
        return dados.toString();
    }
}
