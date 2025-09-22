package edu.igor;

public class Residencial {

    private int areaTerreno;

    public Residencial(int areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public String toString(){
        return "Area do Terreno: " + this.areaTerreno;
    }
    
}
