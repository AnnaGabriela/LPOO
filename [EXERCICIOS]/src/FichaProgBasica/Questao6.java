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
public class Questao6 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite o raio");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow (raio, 2);
        System.out.println("A área do círculo de raio "+raio+" é igual a "+area);
    }
}
