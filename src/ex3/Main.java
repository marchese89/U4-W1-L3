package ex3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articolo a1 = new Articolo(1,"aaa",4.5,3);
        Cliente c = new Cliente(22,"AAA","BBB","email",new Date());
        Carrello carrello = new Carrello(c);
        carrello.addArticolo(a1);
         System.out.println("totale articoli: "+carrello.totaleCostoArticoli());
    }
}
