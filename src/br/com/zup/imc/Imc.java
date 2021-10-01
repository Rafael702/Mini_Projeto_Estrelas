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

    public double calculoImc(){
        double calculo = Math.round(pessoa.getPeso() / (pessoa.getAltura()* pessoa.getAltura()));
        return calculo;
    }

    private final double ABAIXO_DO_PESO = 18.5;
    private final double PESO_NORMAL = 24.9;

    public void faixasDePeso(){
        if(calculoImc() < ABAIXO_DO_PESO){
            System.out.println("Abaixo do Peso");
        }else if(calculoImc() <= PESO_NORMAL){
            System.out.println("Dentro do peso ideal");
        }else {
            System.out.println("SobrePeso");
        }
    }

}
