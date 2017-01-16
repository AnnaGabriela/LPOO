package br.acme.users;

import br.acme.location.*;


public class TesteLugar {
    public static void main(String[] args) {
        
        Lugar origem = new Lugar ("Casa", "Rua F Ambrosio Barros Leite, 152");
        Lugar destino = new Lugar ("Poli", "Rua Benfica");

        System.out.println(origem);
        System.out.println(destino);

    }
}
