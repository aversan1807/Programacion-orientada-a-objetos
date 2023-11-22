package Electrodoméstico;

public class Electrodoméstico {
   private int precioBase=100;

   private String color ="Blanco";

   private char consumoEnergético = 'F';

   private double peso = 5;

    public Electrodoméstico(int precioBase, String color, char consumoEnergético, double peso) {




        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergético = consumoEnergético;
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergético() {
        return consumoEnergético;
    }

    public void setConsumoEnergético(char consumoEnergético) {
        this.consumoEnergético = consumoEnergético;
    }

    public static void comprobarConsumoEnergetico(){

    }

    public static void comprobarColor(){

    }

    public static void precioFinal(){

    }
}
