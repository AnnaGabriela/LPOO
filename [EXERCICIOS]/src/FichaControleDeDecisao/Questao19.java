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
public class Questao19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão");
        int escolha = scan.nextInt();
        int resultado = 0;
        boolean valida = true;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Digite uma opção válida");
                valida = false;
        }

        if (valida) {

            System.out.println("Resultado: " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("É par!");
            } else {
                System.out.println("É impar!");
            }

            if (resultado >= 0) {
                System.out.println("É positivo!");
            } else {
                System.out.println("É negativo!");
            }
        }
    }
}
