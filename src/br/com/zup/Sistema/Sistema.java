package br.com.zup.Sistema;

import br.com.zup.Almoco.Almoco;
import br.com.zup.CafeDaManha.CafeDaManha;
import br.com.zup.Cardapio.Cardapio;
import br.com.zup.Jantar.Jantar;
import br.com.zup.LancheDaTarde.LancheDaTarde;
import br.com.zup.RefeicoesDiarias.RefeicoesDiarias;
import br.com.zup.imc.Imc;
import br.com.zup.pessoa.Pessoa;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
        System.out.println("Digite [1] se deseja adicionar as refeiçoes do dia:");
        System.out.println("Digite [2] para ver cardapio:");
        System.out.println("Digite [3] se deseja sair do Programa:");
    }
    //menu secundario
    public static void menu2() {
        System.out.println("Em qual refeição deseja colocar esses alimentos");
        System.out.println("[1] Cafe da manha");
        System.out.println("[2] Almoco");
        System.out.println("[3] Lanche da tarde");
        System.out.println("[4] Jantar");
        System.out.println("[5] Para voltar o menu inicial!");
    }

    public static String alterarString(String mensagem) {
        String string = mensagem;
        return string;
    }

    public static CafeDaManha criarCafe() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para adicionar na refeição? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        CafeDaManha cafeDaManha = new CafeDaManha(nomeDoAlimento, qtdDeCaloria);
        return cafeDaManha;
    }

    public static Almoco criarAlmoco() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para adicionar na refeição? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        Almoco almoco = new Almoco(nomeDoAlimento, qtdDeCaloria);
        return almoco;
    }

    public static LancheDaTarde criarLanche() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para adicionar na refeição? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        LancheDaTarde lancheDaTarde = new LancheDaTarde(nomeDoAlimento, qtdDeCaloria);
        return lancheDaTarde;
    }

    public static Jantar criarJantar() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para adicionar na refeição? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        Jantar jantar = new Jantar(nomeDoAlimento, qtdDeCaloria);
        return jantar;
    }

    public static Pessoa informacoesDoPaciente() {
        System.out.println("---------- Dados de usuario -----------");
        String nomePessoa = dadosDeUsuario("Nome do paciente: ").nextLine();
        double pesoDaPesoa = dadosDeUsuario("Peso do paciente: ").nextDouble();
        double alturaDaPessoa = dadosDeUsuario("Altura do paciente: ").nextDouble();
        Pessoa pessoa = new Pessoa(nomePessoa, pesoDaPesoa, alturaDaPessoa);

        return pessoa;
    }

    public static void run() {
        Cardapio cardapio = new Cardapio();
        RefeicoesDiarias refeicoesDiarias = new RefeicoesDiarias();

        boolean menu = true;

        System.out.println("------------- BEM VINDOS AO DIETA SAUDAVEL -------------");
        Imc imc = new Imc(informacoesDoPaciente());

        imc.calculoImc();
        imc.faixasDePeso();
        while (menu) {
            menu();
            int opcoes = dadosDeUsuario("").nextInt();

            if (opcoes == 1) {
                boolean menu2 = true;
                while (menu2) {
                    menu2();
                    int opcoesDeUsuario = dadosDeUsuario("Qual sua escolha de refeição?").nextInt();

                    if (opcoesDeUsuario == 1) {
                        System.out.println("** Café da manhã **");
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimentos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            CafeDaManha cafeDaManha = criarCafe();
                            cardapio.adicionarAlimentoNoCafedaManha(cafeDaManha);
                            System.out.println("Total de Calorias: " + refeicoesDiarias.somarCaloria(cafeDaManha.getQtdDeCaloria()));
                        }
                    } else if (opcoesDeUsuario == 2) {
                        System.out.println("** Almoço **");
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimentos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            Almoco almoco = criarAlmoco();
                            cardapio.adicionarAlimentoNoAlmoco(almoco);
                            System.out.println("Total de Calorias: " + refeicoesDiarias.somarCaloria(almoco.getQtdDeCaloria()));

                        }
                    } else if (opcoesDeUsuario == 3) {
                        System.out.println("** Lanche da tarde **");
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimentos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            LancheDaTarde lancheDaTarde = criarLanche();
                            cardapio.adicionarAlimentoNoLancheDaTarde(lancheDaTarde);
                            System.out.println("Total de Calorias: " + refeicoesDiarias.somarCaloria(lancheDaTarde.getQtdDeCaloria()));

                        }
                    } else if (opcoesDeUsuario == 4) {
                        System.out.println("** Jantar **");
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimentos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            Jantar jantar = criarJantar();
                            cardapio.adicionarAlimentoNoJantar(jantar);
                            System.out.println("Total de Calorias: " + refeicoesDiarias.somarCaloria(jantar.getQtdDeCaloria()));
                        }
                    } else if (opcoesDeUsuario == 5) {
                        menu2 = false;
                    } else {
                        System.out.println("Digite um valor válido!");
                    }
                }
            } else if (opcoes == 2) {
                System.out.println(cardapio);
            } else if (opcoes == 3) {
                System.out.println("Voce saiu do programa!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido!");
            }
        }
    }
}


