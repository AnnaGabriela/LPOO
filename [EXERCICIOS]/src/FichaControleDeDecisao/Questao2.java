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
public class Questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        int num1 = scan.nextInt();

        if (num1 > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

    }

}
