package ChristmasChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day5 {
    /**
     * Pomóż Mikołajowi w rozwożeniu prezentów!
     * Posortuj listę adresów dzieci po miastach alfabetycznie,
     * tak, żeby Mikołaj mógł wygodnie zaplanować plan podróży.
     * Posortowaną listę adresów wypisz na ekranie.
     * To bardzo proste zadanie! Więc dodatkowym plusem będzie
     * wykonanie sortowania w jednej linijce. :D
     */
    public static void main (String [] args)
    {
        List<String> cities = Arrays.asList("Dublin","Londyn","Warsaw","Cracow","Zagrzeb","Paris","Berlin");

        Collections.sort(cities);
        System.out.println("Sortowanie Alfabetycznie: " + cities);
    }
}
