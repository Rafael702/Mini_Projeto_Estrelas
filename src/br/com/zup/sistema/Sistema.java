package br.com.zup.sistema;

import br.com.zup.cardapio.Cardapio;
import br.com.zup.imc.Imc;
import br.com.zup.pessoa.Paciente;
import br.com.zup.pessoa.Pessoa;
import br.com.zup.refeicoesdiarias.RefeicoesDiarias;
import br.com.zup.refeicoesdiarias.TipoRefeicao;

import java.util.Scanner;


public class Sistema {

    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
        System.out.println("Digite [1] para cadastrar paciente:");
        System.out.println("Digite [2] para ver lista de pacientes:");
        System.out.println("Digite [3] se deseja sair do Programa:");
    }

    //menu secundario
    public static void menu2() {
        System.out.println("[1] Para cadastrar cardápio");
        System.out.println("[0] Para voltar o menu inicial!");
    }

    public static void menuRefeicoes(){
        System.out.println("--- Qual o tipo da Refeição? ---");
        System.out.println("[1] Cafe da manha");
        System.out.println("[2] Almoco");
        System.out.println("[3] Lanche da tarde");
        System.out.println("[4] Jantar");
    }

    public static RefeicoesDiarias criarRefeicao() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        RefeicoesDiarias refeicoesDiarias = new RefeicoesDiarias(nomeDoAlimento, qtdDeCaloria);
        return refeicoesDiarias;
    }

    public static Pessoa informacoesDoPaciente() {
        System.out.println("---------- Dados do paciente -----------");
        String nomePessoa = dadosDeUsuario("Nome do paciente: ").nextLine();
        double pesoDaPesoa = dadosDeUsuario("Peso do paciente: ").nextDouble();
        double alturaDaPessoa = dadosDeUsuario("Altura do paciente: ").nextDouble();
        Pessoa pessoa = new Pessoa(nomePessoa, pesoDaPesoa, alturaDaPessoa);

        return pessoa;
    }

    public static void run() {

        boolean menu = true;
        Cardapio cardapio = new Cardapio();
        RefeicoesDiarias refeicoesDiarias = null;
        Imc imc;
        Paciente novoPaciente = new Paciente();

        System.out.println("------------- BEM VINDOS AO TELANUTRI -------------");


        while (menu) {
            menu();
            int opcoes = dadosDeUsuario("Escolha sua opção").nextInt();

            if (opcoes == 1) {
                imc = new Imc(informacoesDoPaciente());
                imc.calculoImc();
                imc.faixasDePeso();

                novoPaciente.adicionarPaciente(imc);

                boolean menu2 = true;

                while (menu2) {
                    menu2();
                    int novaRefeicao = dadosDeUsuario("--------------------").nextInt();

                    if (novaRefeicao == 1) {

                        menuRefeicoes();
                        int opcaoRefeicao = dadosDeUsuario("--------------------").nextInt();
                        TipoRefeicao tipoRefeicao = RefeicoesDiarias.getTipoRefeicao(opcaoRefeicao);

                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimentos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {

                            RefeicoesDiarias refeicoes = criarRefeicao();
                            cardapio.adicionarRefeicao(refeicoes);
                            novoPaciente.adicionarCardapio(refeicoes);
                            refeicoes.setTipoRefeicao(tipoRefeicao);

                        }
                    }
                    if (novaRefeicao == 0) {
                        menu2 = false;
                    } else {
                        System.out.println("Digite um valor válido!");
                    }
                }
            } else if (opcoes == 2) {
                System.out.println(novoPaciente);

            } else if (opcoes == 3) {
                System.out.println("Voce saiu do menu!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido!");
            }
        }
        System.out.println("--- FIM DO PROGRAMA ---");
    }
}


