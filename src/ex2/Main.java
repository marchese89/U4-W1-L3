package ex2;

public class Main {
    public static void main(String[] args) {
        Sim s = new Sim("0001112223");
        s.Chiama(new Chiamata("1234567890",1,20));
        s.Chiama(new Chiamata("1244447890",3,27));
        s.Chiama(new Chiamata("1255555890",6,23));
        s.Chiama(new Chiamata("1277767890",8,24));
        s.Chiama(new Chiamata("1234888890",4,21));
        System.out.println(s);
    }
}
