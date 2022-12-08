package ChristmasChallenge;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Day3 {
    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
     * Jeżeli potrafisz, nie wpisuj drzewka bezpośrednio w printy - pokombinuj z pętlami.
     * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
     * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
     */
    public static void main (String [] args) {

        System.out.println("Program tworzacy różne typy choinek:");
        Scanner scan = new Scanner(System.in);
        int a = 0;
        do {
            try {
                System.out.print(
                        "Program 1 - Choinka\nProgram 2 - Choinka do góry nogami (odwrócona)\nProgram 3 - Choinka z liczbami\nProgram 4 - Choinka poszerzająca w dół\nProgram 5 - Choinka zwęrzająca w dół\nJeśli chcesz wyjść z programu podaj numer 6\nPodaj numer programu (1-5): ");
                a = scan.nextInt();
                System.out.print("\nPodaj ilość poziomów tworzących Choinke: ");
                int b = scan.nextInt();
                switch (a) {
                    case 1:
                        ordinaryChristmasTree(b);
                        break;
                    case 2:
                        upsideDownChristmasTree(b);
                        break;
                    case 3:
                        christmasTreeWithNumbers(b);
                        break;
                    case 4:
                        christmasTreeExtendingDownwards(b);
                        break;
                    case 5:
                        christmasTreeNarrowingDown(b);
                        break;
                    default:
                        System.out.println(a + " - Podano nieprawidlowa wartosc\n");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Nie wpisujemy liter!");
            } finally {
                scan.nextLine();
            }
        } while (a != 6);
    }

    private static void ordinaryChristmasTree(int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b * 2; j++) {
                if (j < (b - i) || j > (b + i))
                {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void upsideDownChristmasTree(int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b * 2; j++) {
                if (j <= i || (b * 2) - i <= j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void christmasTreeWithNumbers(int b) {
        for (int z = 0; z < b; z++) {
            for (int y = 1; y < b + 1; y++) {
                if (z >= y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
        for (int z = 0; z < b; z++) {
            for (int y = 1; y < b + 1; y++) {
                if (z + y <= b) {
                    System.out.print("*");
                } else {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }

    private static void christmasTreeExtendingDownwards(int b) {
        for (int z = 0; z < b; z++) {
            for (int y = 0; y < b; y++) {
                if (z >= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void christmasTreeNarrowingDown(int b) {
        for (int z = 0; z < b; z++) {
            for (int y = 0; y < b; y++) {
                if (z <= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}