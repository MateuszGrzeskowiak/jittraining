import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ZadanieJIT zad = new ZadanieJIT();
        int [] tablica = zad.zadanie1(1000);
        for (int i = 0; i < 10000 ; i++) {
            System.out.println(
                    zad.zadanie2a(tablica)+ " ,"+ (zad.zadanie2b(tablica)));

        }

    }
}

