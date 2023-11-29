package ex1;

import java.text.DecimalFormat;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public double perimetro(){
        return (altezza+larghezza)*2;
    }

    public double area(){
        return altezza*larghezza;
    }

    public static void stampaRettangolo(Rettangolo r){
        DecimalFormat formatoDecimali = new DecimalFormat("#.##");
        System.out.println("area rettangolo: " + formatoDecimali.format(r.area()));
        System.out.println("perimetro rettangolo: "+ formatoDecimali.format(r.perimetro()));
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        DecimalFormat formatoDecimali = new DecimalFormat("#.##");
        System.out.println("primo rettangolo");
        stampaRettangolo(r1);
        System.out.println("secondo rettangolo");
        stampaRettangolo(r2);
        System.out.println("somma aree");
        System.out.println(formatoDecimali.format(r1.area()+r2.area()));
        System.out.println("somma perimetri");
        System.out.println(formatoDecimali.format(r1.perimetro()+r2.perimetro()));
    }
}
