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

    public static void criarCardapio() {
        Cardapio cardapio = new Cardapio();
        RefeicoesDiarias refeicoesDiarias = new RefeicoesDiarias();
        for (int i = 1; i <= 4; i++) {
            String mensagem = "Digite o nome do alimento: ";
            String nome;
            double qtdDeCalorias;
            int qtdDeAlimentos = dadosDeUsuario("Quantos alimentos deseja adicionar na refeição: ").nextInt();
            int opcao2 = 1;

            if (i == 1) {
                while ( opcao2 <= qtdDeAlimentos) {
                    nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:", " Café da manhã: "))).nextLine();
                    qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                    CafeDaManha cafeDaManha = new CafeDaManha(nome, qtdDeCalorias);
                    cardapio.adicionarAlimentoNoCafedaManha(cafeDaManha);
                    opcao2++;
                }

            } else if (i == 2) {
                while (opcao2 < qtdDeAlimentos) {
                    nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:", " Almoço: "))).nextLine();
                    qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                    Almoco almoco = new Almoco(nome, qtdDeCalorias);
                    cardapio.adicionarAlimentoNoAlmoco(almoco);
                    opcao2++;
                }
            } else if (i == 3) {

                while (opcao2 < qtdDeAlimentos){
                    nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:", " Lanche da tarde: "))).nextLine();
                    qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                    LancheDaTarde lancheDaTarde = new LancheDaTarde(nome, qtdDeCalorias);
                    cardapio.adicionarAlimentoNoLancheDaTarde(lancheDaTarde);
                    opcao2++;
                }
            } else if (i == 4) {
                while (opcao2 < qtdDeAlimentos) {
                    nome = dadosDeUsuario(alterarString((mensagem).replace("nome do alimento:", " Jantar: "))).nextLine();
                    qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
                    Jantar jantar = new Jantar(nome, qtdDeCalorias);
                    cardapio.adicionarAlimentoNoJantar(jantar);
                    opcao2++;
                }
            }
        }
        System.out.println("Total de Calorias: " + refeicoesDiarias.somarCaloria(refeicoesDiarias.getQtdDeCaloria()));
    }

    public static String alterarString(String mensagem) {
        String string = mensagem;
        return string;
    }

    public static void imc() {
        String nomePessoa = dadosDeUsuario("\nNome: ").nextLine();
        double pesoDaPesoa = dadosDeUsuario("\nPeso: ").nextDouble();
        double alturaDaPessoa = dadosDeUsuario("\nAltura: ").nextDouble();
        Pessoa pessoa = new Pessoa(nomePessoa, pesoDaPesoa, alturaDaPessoa);
        Imc imc = new Imc(pessoa);
        imc.calculoImc();
        imc.exibirCalculo();
    }

    public static void run() {
        //imc();
        boolean menu = true;
        Cardapio cardapio = new Cardapio();
        RefeicoesDiarias refeicoesDiarias = new RefeicoesDiarias();
        while (menu) {

            menu();
            int opcao = dadosDeUsuario("Digite sua escolha").nextInt();
            if (opcao == 1) {
                criarCardapio();
            }
            else if (opcao == 2) {
                System.out.println(cardapio);
            }
            else if(opcao == 3){
                System.out.println("Você saiu do programa!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido");
            }
        }
    }
}
