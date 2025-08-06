package edu.igor;

public class Ponto{
    private double coordX;
    private double coordY;

    public Ponto(){
        this.coordX = 0;
        this.coordY = 0;
    }

    public Ponto(double umX, double umY){
        this.coordX = umX;
        this.coordY = umY;
    }

    @Override
    public String toString(){
        return "X: " + coordX + " Y: " + coordY + " Raio: ";
    }

    public void Mover(double x, double y){
        this.coordX = x;
        this.coordY = y;
    }

}