package br.com.zup.imc;

import br.com.zup.Almoco.Almoco;
import br.com.zup.Sistema.Sistema;
import br.com.zup.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> almoco = new ArrayList<>();
        List<String> cafeDaManha = new ArrayList<>();
        List<String> janta = new ArrayList<>();
        List<String> lancheTarde = new ArrayList<>();

        String nome = "Ferdinando:";
        System.out.println(nome);
        System.out.println(Sistema.alteraString(nome).replace(":", " Afonso:"));



//        int contador =1;
//        while(contador <= 1){
//            String nome;
//            if(contador == 1) {
//                while (contador <= 3) {
//                    System.out.println("Digite uma comida:");
//                    nome = sc.nextLine();
//                    almoco.add(nome);
//                    contador++;
//                }
////            }else if(contador == 2){
////                cafeDaManha.add(nome);
//            }else if(contador == 3){
//                janta.add(nome);
//            }else if(contador == 4){
//                lancheTarde.add(nome);
//            }
//            }
//            contador++;
//        }
//
//        System.out.println(almoco);
//        System.out.println(cafeDaManha);
//        System.out.println(janta);
//        System.out.println(lancheTarde);
//
    }



}
