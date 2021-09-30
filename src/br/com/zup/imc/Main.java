package br.com.zup.imc;

import br.com.zup.Almoco.Almoco;
import br.com.zup.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa people = new Pessoa("Robson",30,1.90,50);
        Imc imc = new Imc(people);

        imc.calculoImc();
        imc.exibirCalculo();
        imc.faixasDePeso();

        br.com.zup.Almoco.Almoco almoco = new Almoco();


    }



}
