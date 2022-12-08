package ChristmasChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Day2 {
    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za każdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */
    public  static void main (String [] args)
    {

        String bagGifts [] = {"Perfume","Socks","Cup","Sweater","Hat","Tea","Coffe","Clock","Bag","Book","Wallet","Cream","Earnings"};

        for (int i=1; i <= 3; i++)
        {
            int SIZE = bagGifts.length-1;
            int gift=(int)Math.round(Math.random()*SIZE);
            System.out.println(bagGifts[gift]);

        }

    }
}
