package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class SistemaSolar {
    private final ArrayList<Planeta> sol;
    public SistemaSolar() {
        sol = new ArrayList<>();
    }
    public String getSol() {
        String s = "";
        int i = 1;
        for (Planeta p : sol) {
            s += "Planeta " + i + ": " + p + "\n";
        }
        return s;
    }
    public void add (Planeta p) {sol.add(p);}
    public void remove(Planeta p) {sol.remove(p);}
    public Planeta get(int i) {return sol.get(i);}
    public boolean contains(String p) {
        for(Planeta p1 : sol) {
            if(p.getNombre().equals(p1.getNombre())) {
                return true;
            }
        }
        return false;
    }
    public int size() {return sol.size();}
}
