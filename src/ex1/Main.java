package ex1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(3,4);
        Rettangolo r2 = new Rettangolo(5,6);
        Rettangolo.stampaRettangolo(r1);
        Rettangolo.stampaRettangolo(r2);
        Rettangolo.stampaDueRettangoli(r1,r2);
    }
}