package edu.igor;

public abstract class Imovel {
    private String proprietario;
    private Double areaConstruido;

    public Imovel(String proprietario, double areaConstruido) {
        this.proprietario = proprietario;
        this.areaConstruido = areaConstruido;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Proprietario: " + this.proprietario + " Area Construido:" + this.areaConstruido;
    }
}
