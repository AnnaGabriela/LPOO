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
public class Questao10 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a temperatura em Celcius: ");
            double c = scan.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.println("A temperatura "+c+"C em Farenheit é "+f+"F");
    }
} 
