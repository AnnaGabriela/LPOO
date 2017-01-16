/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaControleDeDecisao;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Questao5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            if (media == 10) {
                System.out.println("Média = " + media + "(Aprovado com Distinção)");
            } else {
                System.out.println("Média = " + media + "(Aprovado)");
            }
        } else {
            System.out.println("Média = " + media + "(Reprovado)");
        }

    }
}
