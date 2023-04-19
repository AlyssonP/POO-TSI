package tv;

public class Main {
    public static void main(String[] args) {
        ControleRemoto tv = new Televisor();
        tv.ligar();
        tv.aumentarVolume();
        System.out.println(tv.toString());
    }
}
