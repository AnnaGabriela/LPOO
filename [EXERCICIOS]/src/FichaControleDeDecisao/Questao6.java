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
public class Questao6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo: ");
        int num2 = scan.nextInt();
        System.out.println("Entre com o terceiro: ");
        int num3 = scan.nextInt();
        
        if (num1 > num2) {
            if (num1>num3) {
            System.out.println("Número 1 é maior: "+num1);
            }
            else {
                System.out.println("Número 3 é maior: "+num3);
            }
        }
        else {
            if (num2>num3) {
                System.out.println("Número 2 é maior: "+num2);
            }
            else {
                System.out.println("Número 3 é maior: "+num3);
            }
        }
        
    }
}
