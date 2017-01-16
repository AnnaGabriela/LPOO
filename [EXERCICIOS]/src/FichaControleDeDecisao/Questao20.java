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
public class Questao20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");
        String resp1 = scan.next();
        
        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();
                
        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();   
                        
        System.out.println("Já trabalhou com a vítima?");
        String resp4 = scan.next(); 
                               
        System.out.println("Devia para a vítima?");
        String resp5 = scan.next(); 
     
        int cont = 1;
        
        if (resp1.equalsIgnoreCase("s")) {
            cont++;
        }
        
        if (resp2.equalsIgnoreCase("s")) {
            cont++;
        }
                
        if (resp3.equalsIgnoreCase("s")) {
            cont++;
        }
                
        if (resp4.equalsIgnoreCase("s")) {
            cont++;
        }     
        
        if (resp5.equalsIgnoreCase("s")) {
            cont++;
        }
        
        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Culpado");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}
