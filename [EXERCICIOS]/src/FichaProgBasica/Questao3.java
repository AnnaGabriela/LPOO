/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaProgBasica;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo numero");
        int num2 = scan.nextInt();
        int resultado = num1 + num2;
        System.out.println("A soma dos números é " + resultado);
    }
}
