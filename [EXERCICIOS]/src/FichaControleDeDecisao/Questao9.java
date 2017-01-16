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
public class Questao9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo: ");
        int num2 = scan.nextInt();
        System.out.println("Entre com o terceiro: ");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
        } else if (num2 > num3) {
            if (num3 > num1) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }
        } else if (num2 > num1) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else {
            System.out.println(num3 + ", " + num1 + ", " + num2);
        }

    }
}
