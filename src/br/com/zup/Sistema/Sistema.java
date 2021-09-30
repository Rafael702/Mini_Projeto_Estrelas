package br.com.zup.Sistema;

import br.com.zup.CafeDaManha.CafeDaManha;
import br.com.zup.Almoco.Almoco;
import br.com.zup.RefeicoesDiarias.RefeicoesDiarias;
import br.com.zup.imc.Imc;
import br.com.zup.pessoa.Pessoa;
import src.br.com.zup.LancheDaTarde.LancheDaTarde;
import src.br.com.zup.Jantar.Jantar;


import src.br.com.zup.Cardapio.Cardapio;


import java.util.Scanner;

public class Sistema {

    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
        System.out.println("------------- BEM VINDOS AO DIETA SAUDAVEL -------------");
        System.out.println("Digite [1] se deseja adicionar as refeiçoes do dia");
        System.out.println("Digite [2] para ver cardapio");
        System.out.println("Digite [3] se deseja sair do Programa");
    }

    public static void criarRefeicoes() {
        Cardapio cardapio = new Cardapio();
        for (int i = 1; i <= 4; i++) {
            String mensagem = "Digite o nome do alimento: ";
            String nome;
            double qtdDeCalorias;

            if (i == 1) {
                nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:"," Café da manhã: "))).nextLine();
                qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                CafeDaManha cafeDaManha = new CafeDaManha(nome, qtdDeCalorias);
                cardapio.adicionarAlimentoNoCafedaManha(cafeDaManha);
            } else if (i == 2) {
                nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:"," Almoço: "))).nextLine();
                qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                Almoco almoco = new Almoco(nome, qtdDeCalorias);
                cardapio.adicionarAlimentoNoAlmoco(almoco);
            } else if (i == 3) {
                nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:"," Lanche da tarde: "))).nextLine();
                qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                LancheDaTarde lancheDaTarde = new LancheDaTarde(nome, qtdDeCalorias);
                cardapio.adicionarAlimentoNoLancheDaTarde(lancheDaTarde);
            } else if (i == 4) {
                nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:"," Jantar: "))).nextLine();
                qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                Jantar jantar = new Jantar(nome, qtdDeCalorias);
                cardapio.adicionarAlimentoNoJantar(jantar);
            }
        }
    }
    public static String alterarString(String mensagem){
        String string = mensagem;
        return string;
    }
    public static void imc() {
        String nomePessoa = dadosDeUsuario("\nNome: ").nextLine();
        double pesoDaPesoa = dadosDeUsuario("\nPeso: ").nextDouble();
        double alturaDaPessoa = dadosDeUsuario("\nAltura: ").nextDouble();
        Pessoa pessoa = new Pessoa(nomePessoa,pesoDaPesoa,alturaDaPessoa);
        Imc imc = new Imc(pessoa);
        imc.calculoImc();
        imc.exibirCalculo();
    }
}
