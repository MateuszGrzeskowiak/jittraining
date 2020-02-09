import java.util.Random;

public class ZadanieJIT {

    public static int wynik = 0;

    public int[] zadanie1(int dlugosc) {
        int[] losowaTablica = new int[dlugosc];
        Random random = new Random();
        for (int i = 0; i < losowaTablica.length; i++) {
            losowaTablica[i] = random.nextInt();


        }
        return losowaTablica;
    }

    public long zadanie2a(int [] tablica) {
        long start = System.nanoTime();
        int wynik = 0;

        for (int i = 0; i < tablica.length; i++) {

            wynik += tablica[i];
        }
        long end = System.nanoTime();

        return end - start;
    }

    public long zadanie2b(int [] tablica) {
        long start = System.nanoTime();


        for (int i = 0; i < tablica.length; i++) {

            wynik += tablica[i];
        }
        long end = System.nanoTime();

        return end - start;
    }



}
