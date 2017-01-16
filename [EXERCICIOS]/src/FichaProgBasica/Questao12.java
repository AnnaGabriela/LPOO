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
public class Questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("Peso ideal é "+pesoIdeal);
    }
}
