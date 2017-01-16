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
public class Questao15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int lado1 = scan.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = scan.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = scan.nextInt();

        if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado1 + lado3 > lado2) {
            if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma triângulo!");
        }
    }
}
