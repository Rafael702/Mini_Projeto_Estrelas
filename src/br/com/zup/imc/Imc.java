package br.com.zup.imc;

import br.com.zup.pessoa.Pessoa;

public class Imc {
    private Pessoa pessoa;

    public Imc() {
    }

    public Imc(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double calculoImc(){
        double calculo = pessoa.getPeso() / (pessoa.getAltura()* pessoa.getAltura());
        return calculo;
    }

    public void exibirCalculo(){
        System.out.print("O imc é: ");
        System.out.println(Math.round(calculoImc()));
    }

    private final double ABAIXO_DO_PESO = 18.5;
    private final double PESO_NORMAL = 24.9;

    public void faixasDePeso(){
        if(calculoImc() < ABAIXO_DO_PESO){
            System.out.println("Abaixo do Peso");
        }else if(calculoImc() <= PESO_NORMAL){
            System.out.println("Peso Normal");
        }else {
            System.out.println("SobrePeso");
        }
    }

}
