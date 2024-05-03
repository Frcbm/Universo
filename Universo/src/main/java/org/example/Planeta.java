package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Planeta implements Astro {
    private String nombre;
    private double masa;
    private double diametro;
    private double rotacion;
    private double translacion;
    private double distanciaMedia;
    private final ArrayList<Satelite> satelites;

    public Planeta(){
        this.satelites = new ArrayList<>();
    }
    public Planeta(String nombre, double masa, double diametro, double rotacion, double translacion, double distanciaMedia){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = calcularDiametro(diametro);
        this.rotacion = calcularRotacion(rotacion);
        this.rotacion = translacion;
        this.distanciaMedia = distanciaMedia;
        this.satelites = new ArrayList<>();
    }

    public boolean isEmpty(){
        return isEmpty();
    }
    public String getNombre() {return nombre;}
    public double getDiametroMedio() {
        return diametro;
    }
    public double getRotacion() {return rotacion;}
    public double getTranslacion() {return translacion;}
    public double getDistanciaMedia() {return distanciaMedia;}
    public double getMasa() {return masa;}
    public void add(Satelite s){
        satelites.add(s);
    }
    public boolean contains(Satelite s){
        return satelites.contains(s);
    }
    public void remove(Satelite s){satelites.remove(s);}
    public Satelite get(int i){return satelites.get(i);}
    public int size(){return satelites.size();}
    @Override
    public double calcularDiametro(double longitud){
        return longitud*Math.PI;
    };
    @Override
    public double calcularRotacion(double rotacion){
        return 2*Math.PI/rotacion;
    };
    public String verSatelites(){
        int i = 1;
        String st = "";
        for(Satelite s: satelites){
            st += ("Satelite " + i +": " + s + "\n");

            i++;
        }
        return st;
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre +
                "\nMasa: " + this.masa +
                "\nDiametro: " + this.diametro +
                "\nRotacion: " + this.rotacion +
                "\nTranslacion: " + this.translacion +
                "\nDistancia: " + this.distanciaMedia +
                verSatelites();
    }
}
