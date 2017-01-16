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
public class Questao16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o a: ");
        int a = scan.nextInt();
        
        if (a<0) {
            System.out.println("Não é equação do segundo grau.");
        } else {
            System.out.println("Digite o b: ");
            int b = scan.nextInt();
            
            System.out.println("Digite o c: ");
            int c = scan.nextInt();
            
            int delta = (b*b) - (4*a*c);
            
            if (delta<0) {
                System.out.println("Delta negativo! Não possui raízes reais");
            } else {
                double x1 = ((-b) + Math.sqrt(delta))/2*a;
                double x2 = ((-b)- Math.sqrt(delta))/2*a;
                
                if (delta==0) {
                    System.out.println("Delta igual a zero! Possui apenas uma raíz: "+x1);
                } else {
                    System.out.println("Delta positivo! Possuí duas raízes: x1="+x1+" e x2="+x2);
                }
            }
            
        }
        
        
    }
}
