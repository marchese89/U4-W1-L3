package ex2;

public class Chiamata {
    private int minuti;
    private int secondi;

    private String numeroChiamato;

    public Chiamata(String numeroChiamato, int minuti, int secondi){
        this.numeroChiamato = numeroChiamato;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "minuti=" + minuti +
                ", secondi=" + secondi +
                ", numeroChiamato='" + numeroChiamato + '\'' +
                '}';
    }
}
