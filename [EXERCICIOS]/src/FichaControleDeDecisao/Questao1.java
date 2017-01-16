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
public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro valor: ");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo valor: ");
        int num2 = scan.nextInt();
        
        if (num1>num2) {
            System.out.println("O maior é: "+ num1);
        }
        else {
            System.out.println("O maior é: "+ num2);
        }
    }
}
