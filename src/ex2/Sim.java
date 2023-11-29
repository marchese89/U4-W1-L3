package ex2;

import java.util.LinkedList;

public class Sim {
    private String numero;
    private double credito;
    LinkedList<Chiamata> ultimeCinqueChiamate;

    public Sim(String numero){
        this.numero = numero;
        this.credito = 0;
        this.ultimeCinqueChiamate = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numero='" + numero + '\'' +
                ", credito=" + credito +
                ", ultimeCinqueChiamate=" + ultimeCinqueChiamate +
                '}';
    }

    public void chiama(Chiamata c){
        this.ultimeCinqueChiamate.add(c);
    }
}
