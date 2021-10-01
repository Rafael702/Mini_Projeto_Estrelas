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

    public static String alterarString(String mensagem) {
        String string = mensagem;
        return string;
    }

    public static CafeDaManha criarCafe() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        CafeDaManha cafeDaManha = new CafeDaManha(nomeDoAlimento, qtdDeCaloria);
        return cafeDaManha;
    }

    public static Almoco criarAlmoco() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        Almoco almoco = new Almoco(nomeDoAlimento, qtdDeCaloria);
        return almoco;
    }

    public static LancheDaTarde criarLanche() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        LancheDaTarde lancheDaTarde = new LancheDaTarde(nomeDoAlimento, qtdDeCaloria);
        return lancheDaTarde;
    }

    public static Jantar criarJantar() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeição? ").nextLine();
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


        }
    }
}
