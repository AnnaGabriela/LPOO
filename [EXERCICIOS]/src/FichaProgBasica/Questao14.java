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
public class Questao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tamanho do arquivo: ");
        double tam = scan.nextDouble();
        
        System.out.println("Velocidade da internet: ");
        double vel = scan.nextDouble();
        
        double tempo = tam/vel;
        
        System.out.println("Tempo de download: "+tempo);
        
    }
}
