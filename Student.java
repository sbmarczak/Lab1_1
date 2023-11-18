// Lab1 - Zadanie3
class Student { //Klasa "Student" wraz z polami klas
    String imie;
    String nazwisko;
    String numerAlbumu;
    String pesel;

    // Konstruktor do klasy Student
    Student(String imie, String nazwisko, String numerAlbumu, String pesel) {
        //inicjalizacja pól obiektu klasy Student
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
        this.pesel = pesel;
    }
    // Metoda, dzięki której wyświetlimy informacje o studencie
    void wyswietlInformacjeOStudencie(){
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer albumu: " + numerAlbumu);
        System.out.println("Pesel: " + pesel);
    }
    // Główna metoda MAIN programu
    public static void main(String[] args)
    {
        // Tworzymy nowy obiekt klasy Student
        Student student = new Student("Marek", "Mostowiak","2131", "22020303615");
        // Wyświetlamy informacje o studencie za pomocą metody: wyswietlInformacjeOStudencie()
        student.wyswietlInformacjeOStudencie();
    }
}
