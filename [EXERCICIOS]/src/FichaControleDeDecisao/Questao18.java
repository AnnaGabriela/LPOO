/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaControleDeDecisao;

import java.util.Scanner;

/**
 *
 * @author aninh
 */
public class Questao18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
    }
}
