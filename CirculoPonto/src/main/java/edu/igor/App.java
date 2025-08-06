package edu.igor;

public class App {
    public static void main(String[] args) {
        
        Ponto[] pontos = {
            new Ponto(2.0, 3.0),
            new Ponto(100.0, 3.3),
            new Ponto(1.0, 1.0)};

        Circulo[] circulos = {
            new Circulo(2.0, 3.0, 5.0),
            new Circulo(100.0, 3.3, 89.3),
            new Circulo(1.0, 1.0, 1.0)};

        for (int i= 0; i < circulos.length; i++){
            Circulo c1 = circulos[i];
            System.out.println("Ciruclo " + i + "\nMedida inicial:" + c1);
            double area = c1.Area();
            System.out.print("\nArea: " + area);
            c1.Zoom(2.0);             
            System.out.println("\nMedida apos dar zoom" + c1);  
            c1.Mover(10.0, 10.0);
            System.out.println("\nMedida apos mover" + c1);
        }
        
        for (int i= 0; i < pontos.length; i++){
            Ponto c1 = pontos[i];
            System.out.println("Ponto " + i + "\nMedida inicial:" + c1);
            c1.Mover(10.0, 10.0);
            System.out.println("\nMedida apos mover" + c1);
        }   
    }
}
