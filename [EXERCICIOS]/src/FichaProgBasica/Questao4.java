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
public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota");
        double num1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota");
        double num2 = scan.nextDouble();
        System.out.println("Entre com a terceira nota");
        double num3 = scan.nextDouble();
        System.out.println("Entre com a quarta nota");
        double num4 = scan.nextDouble();       
        double media = (num1 + num2 + num3 + num4) / 4;
        
        System.out.println("A média é: " + media);
    }
}
