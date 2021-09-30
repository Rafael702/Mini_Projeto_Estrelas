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
        System.out.println("------------- BEM VINDOS AO DIETA SAUDAVEL -------------");
        System.out.println("Digite [1] se deseja adicionar as refeiçoes do dia");
        System.out.println("Digite [2] para ver cardapio");
        System.out.println("Digite [3] se deseja sair do Programa");
    }

    public static String adicioanrAlimentos(String mensagem) {
        String nome = dadosDeUsuario("Digite o alimento do " + mensagem + ":").nextLine();
        return nome;
    }

    public static Double adicioanrCaloria() {
        double qtdDeCalorias = dadosDeUsuario("Digite quantidade de calorias: ").nextDouble();
        return qtdDeCalorias;
    }

    public static void criarCardapio() {
        Cardapio cardapio = new Cardapio();
        RefeicoesDiarias refeicoesDiarias = new RefeicoesDiarias();
        for (int i = 1; i <= 4; i++) {
            int contador = 1;
            if (i == 1) {
                while (contador <= 3) {
                    CafeDaManha cafe = new CafeDaManha(adicioanrAlimentos("Café da Manhã"), adicioanrCaloria());
                    System.out.println(cardapio.adicionarAlimentoNoCafedaManha(cafe));
                    contador++;
                }
            } else if (i == 2) {
                while (contador <= 3) {
                    Almoco almoco = new Almoco(adicioanrAlimentos("Almoço"), adicioanrCaloria());
                    cardapio.adicionarAlimentoNoAlmoco(almoco);
                    contador++;
                }
            } else if (i == 3) {
                while (contador <= 3) {
                    LancheDaTarde lancheDaTarde = new LancheDaTarde(adicioanrAlimentos("Lanche da Tarde"),
                            adicioanrCaloria());
                    cardapio.adicionarAlimentoNoLancheDaTarde(lancheDaTarde);
                    contador++;
                }
            } else if (i == 4) {
                while (contador <= 3) {
                    Jantar jantar = new Jantar(adicioanrAlimentos("Jantar"), adicioanrCaloria());
                    cardapio.adicionarAlimentoNoJantar(jantar);
                    contador++;
                }
            }
        }
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
        imc();
        boolean menu = true;
        Cardapio cardapio = new Cardapio();
        while (menu) {

            menu();
            int opcao = dadosDeUsuario("Digite sua escolha").nextInt();
            if (opcao == 1) {
                criarCardapio();
                cardapio.toString();
            } else if (opcao == 2) {
                System.out.println(cardapio);
            } else if (opcao == 3) {
                System.out.println("Você saiu do programa!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido");
            }
        }
    }
}
