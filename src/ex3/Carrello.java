package ex3;

import java.util.LinkedList;

public class Carrello {
    private Cliente clienteAssociato;
    private LinkedList<Articolo> elencoArticoli;


    public Carrello(Cliente c){
        this.clienteAssociato = c;
        elencoArticoli = new LinkedList<>();
    }

    public double totaleCostoArticoli(){
        double temp = 0;
        for (Articolo a: elencoArticoli) {
            temp += a.getPrezzo();
        }
        return temp;
    }

    public void addArticolo(Articolo a){
        elencoArticoli.add(a);
    }

    public void removeArticolo(long codideArticolo){
        int toRemove = -1;
        for(int i = 0; i < elencoArticoli.size(); i++){
            if(elencoArticoli.get(i).getCodideArticolo() == codideArticolo){
                toRemove = i;
                break;
            }
        }
        elencoArticoli.remove(toRemove);
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }


    public LinkedList<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

}
