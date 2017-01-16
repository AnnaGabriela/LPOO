package br.acme.location;

public class Lugar {

    private String identificadorLugar;
    private String endereco;

    public Lugar(String identificadorLugar, String endereco) {
        this.identificadorLugar = identificadorLugar;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String dados = 
                "Identificador de Lugar: " + identificadorLugar + "; Endereço: " + endereco + ";";
        return dados;
    }

    public String getIdentificadorLugar() {
        return identificadorLugar;
    }

    public void setIdentificadorLugar(String identificadorLugar) {
        this.identificadorLugar = identificadorLugar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
