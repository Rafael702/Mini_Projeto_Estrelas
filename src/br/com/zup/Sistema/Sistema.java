package br.com.zup.Sistema;

import java.util.Scanner;

public class Sistema {
    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }




}
