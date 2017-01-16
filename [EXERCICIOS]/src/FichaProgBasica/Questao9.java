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
public class Questao9 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a temperatura em Farehnheit: ");
            double f = scan.nextDouble();
            double c = (5* (f-32)/9);
            System.out.println("A temperatura "+f+"F em Celcius é "+c+"C");
    }
}
