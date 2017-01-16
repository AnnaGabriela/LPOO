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
public class Questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do lado: ");
        double lado = scan.nextDouble();
        double area = Math.pow (lado, 2);
        System.out.println("A área do quadrado é "+area+" e o dobro é "+(area*2));
    }
}
