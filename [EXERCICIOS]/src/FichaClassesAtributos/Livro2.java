/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaClassesAtributos;

/**
 *
 * @author Anna
 */
public class Livro2 {
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.nome = "Anna eh top";
        livro.autor = "Anna";
        livro.anoLancamento = 2015;
        
        System.out.println("Nome do livro: "+livro.nome);
    }
}
