package ex3;

public class Articolo {
    private long codideArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int disponibili;

    public Articolo(long codideArticolo,String descrizioneArticolo, double prezzo, int disponibili){
        this.codideArticolo = codideArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.disponibili = disponibili;
    }

    public long getCodideArticolo() {
        return codideArticolo;
    }

    public void setCodideArticolo(long codideArticolo) {
        this.codideArticolo = codideArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getDisponibili() {
        return disponibili;
    }

    public void setDisponibili(int disponibili) {
        this.disponibili = disponibili;
    }
}
