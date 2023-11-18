// Lab1 - Zadanie4
import java.util.Scanner; // Potrzebna biblioteka do Scanner
public class NazwaKlasy {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Scanner do wczytywania danych z klawiatury
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię studenta: "); // Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia tekstu
        // Wczytujemy wprowadzony tekst do zmiennej
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko studenta: "); // Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia tekstu
        // Wczytujemy wprowadzony tekst do zmiennej
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj numer albumu studenta: "); // Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia tekstu
        // Wczytujemy wprowadzony tekst do zmiennej
        String numerAlbumu = scanner.nextLine();

        System.out.println("Podaj PESEL studenta: "); // Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia tekstu
        // Wczytujemy wprowadzony tekst do zmiennej
        String pesel = scanner.nextLine();

        // Wyświetlamy wprowadzone dane
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer albumu: " + numerAlbumu);
        System.out.println("Pesel: " + pesel);

        // Zamykamy obiekt Scanner, gdy już nie jest potrzebny
        scanner.close();
    }
}
// Test1
// Test2