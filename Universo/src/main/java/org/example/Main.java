package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SistemaSolar sol = new SistemaSolar();
        int menu = menu();
        while(true){
            switch(menu){
                case 1: crearPlaneta(sol); break;
                case 2: borrarPlaneta(sol);
                case 3:

            }
        }
    }
    static int menu(){
        System.out.println("Elige una opción");
        System.out.println("1. Crear planeta");
        System.out.println("2. Eliminar planeta");
        System.out.println("3. Ver planeta");
        System.out.println("4. Ver Sistema Solar");
        return inputInt();
    }
    static Planeta crearPlaneta(SistemaSolar s){
        try{
            if(s.size() < 0) throw new NotFind("No existe ese sistema solar");
            System.out.println("Nombre del nuevo planeta: ");
            String nombre = validarNombre();
            System.out.println("Masa del nuevo planeta: ");
            double masa = inputDouble();
            System.out.println("Diametro de nuevo planeta: ");
            double diametro = inputDouble();
            System.out.println("Rotación del nuevo planeta:");
            double rotacion = inputDouble();
            System.out.println("Translación del nuevo planeta:");
            double translacion = inputDouble();
            System.out.println("Distancia media del nuevo planeta:");
            double distancia = inputDouble();
            Planeta p = new Planeta(nombre, masa, diametro, rotacion, translacion, distancia);
            s.add(p);
            return p;
        } catch (NotFind e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    static void borrarPlaneta(SistemaSolar a){
        try{
            System.out.println("Que planeta quieres eliminar");
            String s = validarNombre();
            Planeta p = new Planeta();
            for(int i = 0 ; i < a.size() ; i++){
                if(a.get(i).getNombre().equals(s)){
                    p = a.get(i);
                }
            }
            if(s.equals(p.getNombre())) throw new NotFind("Ese planeta no esta en nuestros registros");
            System.out.println("El planeta " + p.getNombre() + " ha dejado de considerarse planeta");
            a.remove(p);
        }catch(NotFind e){
            System.err.println(e.getMessage());
        }
    }

    static Satelite crearSatelite(SistemaSolar sol, Planeta p){
        try{

            if(sol.contains(p.getNombre())) throw new NotFind("No se encontro el planeta");
            System.out.println("Nombre del nuevo satelite: ");
            String nombre = validarNombre();
            System.out.println("Masa del nuevo satelite: ");
            double masa = inputDouble();
            System.out.println("Diametro de nuevo satelite: ");
            double diametro = inputDouble();
            System.out.println("Rotación del nuevo satelite:");
            double rotacion = inputDouble();
            System.out.println("Translación del nuevo satelite:");
            double translacion = inputDouble();
            System.out.println("Distancia media del nuevo satelite:");
            double distancia = inputDouble();
            Satelite s = new Satelite(nombre, masa, diametro, rotacion, translacion, distancia);
            p.add(s);
            return s;
        }catch (NotFind e){
            System.err.println(e.getMessage());
            return null;
        }
    }
    static String validarNombre(){
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        while(nombre.isEmpty()){
            System.out.println("Introduzca un nombre válido");
            nombre = sc.nextLine();
        }
        return nombre;
    }
    static int inputInt(){
        Scanner sc = new Scanner(System.in);
        do{
            try{

                return sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("No es un numero valido");
            }
        }while(true);
    }
    static double inputDouble(){
        Scanner sc = new Scanner(System.in);
        do{
            try{

                return sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("No es un numero valido");
            }
        }while(true);
    }
}