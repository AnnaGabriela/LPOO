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
public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a qntd de metros");
        double metros = scan.nextDouble();
        
        double cm = metros * 100;
        
        System.out.println(metros +"m = "+ cm +"cm");
 
    }
}
