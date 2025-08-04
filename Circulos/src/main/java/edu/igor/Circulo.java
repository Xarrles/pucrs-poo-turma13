package edu.igor;

public class Circulo{
    private double coordX;
    private double coordY;
    private double raio;

    public Circulo(){
        this.coordX = 0;
        this.coordY = 0;
        raio   = 1;
    }

    public Circulo(double umX, double umY, double umRaio){
        this.coordX = umX;
        this.coordY = umY;
        this.raio   = umRaio;
    }

    @Override
    public String toString(){
        return "X: " + coordX + " Y: " + coordY + " Raio: " + raio;
    }

    public void Zoom(double fator) {
        this.raio *= fator;
    }

    public void Mover(double x, double y){
        this.coordX = x;
        this.coordY = y;
    }

    public double Area(){
        double area = 3.14 * this.raio * this.raio;
        //System.out.print("Area do ciruclo é: " +  area);

        return area;
    }
}