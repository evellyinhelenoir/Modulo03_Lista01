package br.com.zup.Modulo03_Lista1.LevelUp;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Paises> continentes = new ArrayList<>();

        Paises pais1 = new Paises("Brasil", 86510000, 210000000);
        Paises pais2 = new Paises("Argentina", 50000, 60000);
        Paises pais3 = new Paises("Chile", 80000, 5);
        Paises pais4 = new Paises("Peru", 70, 90);

        continentes.add(pais1);
        continentes.add(pais2);
        continentes.add(pais3);
        continentes.add(pais4);

        boolean loop = true;
        while (loop) {
            System.out.println("Por favor, digite 1 para listar os paises.");
            System.out.println("Por favor, digite 2 para sair do menu.");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                for (Paises referencia : continentes) {
                    System.out.println("==================================");
                    System.out.println("O nome do pais é: "+ referencia.nome);
                    System.out.println("O tamanho do pais é: "+ referencia.tamanho);
                    System.out.println("O tamanho da população do pais é: "+ referencia.populacao);
                }
            }else if (opcao == 2) {
                System.out.println("Obrigada por usar o meu sistema.");
                loop = false;
            }else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

