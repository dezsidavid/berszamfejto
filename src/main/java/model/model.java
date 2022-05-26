package model;

public class model {

    public String munkanapokszamol(String m) {
        return Integer.toString(Integer.parseInt(m));
    }
    public String ledolgozottszamol(String l) {
        return Integer.toString(Integer.parseInt(l));
    }
    public String bruttoszamol(String b, String m, String l) {
        return Integer.toString(Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l)));
    }
    public String szjaszamol(String b, String m, String l) {
        return Integer.toString((int) ((Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l))) * 0.15));
    }

    public String tbszamol(String b, String m, String l) {
        return Integer.toString((int) ((Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l))) * 0.185));
    }

    public String nettoszamol(String b, String m, String l) {
        return Integer.toString((int) ((Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l))) * 0.665));
    }

    public String szhaszamol(String b, String m, String l) {
        return Integer.toString((int) ((Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l))) * 0.155));
    }

    public String szkhszamol(String b, String m, String l) {
        return Integer.toString((int) ((Integer.parseInt(b) * (Integer.parseInt(m)/Integer.parseInt(l))) * 0.015));
    }
}
