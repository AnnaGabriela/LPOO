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
public class Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro produto: ");
        int prod1 = scan.nextInt();
        System.out.println("Entre com o segundo produto: ");
        int prod2 = scan.nextInt();
        System.out.println("Entre com o terceiro produto: ");
        int prod3 = scan.nextInt();


        if (prod1 < prod2) {
            if (prod1 < prod3) {
                System.out.println("Produto 1 é melhor: " + prod1);
            } else {
                System.out.println("Produto 3 é melhor: " + prod3);
            }
        } else if (prod2 < prod3) {
            System.out.println("Produto 2 é melhor: " + prod2);
        } else {
            System.out.println("Produto 3 é melhor: " + prod3);
        }

    }
}
