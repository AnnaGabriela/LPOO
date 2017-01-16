/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaClassesMetodos;

/**
 *
 * @author Anna
 */
public class Lampada {

    String modelo;
    String tensao;
    String cor;
    String tipoLuz;
    String[] tipos;
    int potencia;
    int garantia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada tá ligada");
        } else {
            System.out.println("Lâmpada tá desligada");
        }
    }
}
