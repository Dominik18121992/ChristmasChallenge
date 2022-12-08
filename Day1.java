package ChristmasChallenge;

public class Day1 {
    /**
     * Wyzwanie Świąteczne @wswieciekodu
     * Dzień 1
     * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
     * Mikołaj startuje z punktu(1,1) spod stacji paliw ;)
     * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
     * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
     * Obliczony wynik wypisz na ekranie.
     *
     * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
     * Do obliczenia dystansu przygotuj odpowiednią funkcję.
     * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
     */
public static void  main (String [] args)
{
    int Ax = 1;
    int Ay = 1;
    int Bx = 4;
    int By = 5;
    int Cx = 11;
    int Cy = 5;

    double AB = Math.sqrt(Math.pow (Bx-Ax,2) + Math.pow (By-Ay,2)) ;
    System.out.println("Odleglosc AB: "+AB);

    double BC = Math.sqrt(Math.pow (Cx-Bx,2) + Math.pow (Cy-By,2)) ;
    System.out.println("Odleglosc BC: "+BC);

    double AC = AB + BC;
    System.out.println("Odleglosc AC: "+AC);

    double fuel = AC * 20/10;
    System.out.println("Ilość zuzytego paliwa to "+fuel+" litry");
}
}
