package org.example;

import java.util.HashSet;

public class Satelite implements Astro{
    private String nombre;
    private double masa;
    private double diametro;
    private double rotacion;
    private double translacion;
    private double distanciaMedia;

    public Satelite(){

    }
    public Satelite(String nombre, double masa, double diametro, double rotacion, double translacion, double distanciaMedia){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = calcularDiametro(diametro);
        this.rotacion = calcularRotacion(rotacion);
        this.rotacion = translacion;
        this.distanciaMedia = distanciaMedia;

    }

    public String getNombre() {return nombre;}
    public double getDiametroMedio() {
        return diametro;
    }
    public double getRotacion() {return rotacion;}
    public double getTranslacion() {return translacion;}
    public double getDistanciaMedia() {return distanciaMedia;}
    public double getMasa() {return masa;}

    @Override
    public double calcularDiametro(double longitud){
        return longitud*Math.PI;
    };
    @Override
    public double calcularRotacion(double rotacion){
        return 2*Math.PI/rotacion;
    };
    @Override
    public String toString(){
        return "Nombre: " + this.nombre +
                "\nMasa: " + this.masa +
                "\nDiametro: " + this.diametro +
                "\nRotacion: " + this.rotacion +
                "\nTranslacion: " + this.translacion +
                "\nDistancia: " + this.distanciaMedia;
    }
}
