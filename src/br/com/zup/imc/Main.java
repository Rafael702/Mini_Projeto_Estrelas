package br.com.zup.imc;

import br.com.zup.Almoco.Almoco;
import br.com.zup.pessoa.Pessoa;
import br.com.zup.RefeicoesDiarias.RefeicoesDiarias;

public class Main {
    public static void main(String[] args) {
        Pessoa people = new Pessoa("Robson",30,1.90,50);
        br.com.zup.imc.Imc imc = new br.com.zup.imc.Imc(people);

        imc.calculoImc();
        imc.exibirCalculo();
        imc.faixasDePeso();


    }



}
