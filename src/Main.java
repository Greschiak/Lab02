import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner wprowadzanie = new Scanner(System.in);
        int NumerZadania;
        do{
            System.out.print("\n--------------------------------------------------------------------------\n");
            System.out.print("Wybierz numer zadania\n");
            System.out.print("1. Wyroznik delta i pierwiastki trojmianu kwadratowego\n");
            System.out.print("2. Kalkulator\n");
            System.out.print("5. Program wyświetlający liczby od 20-0, z wyłączeniem liczb {2,6,9,15,19\n");
            System.out.print("6. Petla nieskonczona\n");
            System.out.print("5. Podnoszenie do 3 potegi\n");
            System.out.print("7. Sortowanie\n");
            System.out.print("0. Zakoncz dzialanie programu\n");
            NumerZadania = wprowadzanie.nextInt();
            switch (NumerZadania) {
                case 1:
                    zadanie1.zadanie(wprowadzanie);
                    break;
                case 2:
                    zadanie2.zadanie();
                    break;
                case 5:
                    zadanie5.zadanie();
                    break;
                case 6:
                    zadanie6.zadanie(wprowadzanie);
                    break;
                case 7:
                    zadanie7.zadanie(wprowadzanie);
                    break;
                case 0:
                    System.out.println("koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania.");
                    break;
            }
        }while(NumerZadania !=0);


    }
}
class zadanie1 {
    public static void zadanie(Scanner wprowadzanie){
        System.out.print("Wprowadz a: ");
        double a = wprowadzanie.nextDouble();
        System.out.print("Wprowadz b: ");
        double b = wprowadzanie.nextDouble();
        System.out.print("Wprowadz c: ");
        double c = wprowadzanie.nextDouble();
        double Delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("Delta = " + Delta);

        if (Delta < 0) {
            System.out.println("Brak rozwiazan");
        } else if (Delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b - Math.sqrt(Delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(Delta)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }

    }

}
class zadanie2 {
    public static void zadanie(){
        run();

    }
    public static void run(){
        Menu();
        int wybor;
        do{
            wybor = WprowadzanieInt();
            switch (wybor){
                case 1:
                    Suma();
                    break;
                case 2:
                    Roznica();
                    break;
                case 3:
                    Iloczyn();
                    break;
                case 4:
                    Iloraz();
                    break;
                case 5:
                    Potega();
                    break;
                case 6:
                    Pierwiastek();
                    break;
                case 7:
                    funTryg();
                    break;
                default:
                    System.out.println("Wprowadz wybor jeszcze raz");
            }
            Menu();
        }while (wybor != 0);
        Close();


    }
    public static String WprowadzanieString(){
        Scanner wprowadzanie = new Scanner(System.in);
        String napis = wprowadzanie.next();
        return napis;
    }
    public static double WprowadzanieDouble(){
        Scanner wprowadzanie = new Scanner(System.in);
        double liczba = wprowadzanie.nextDouble();
        return liczba;
    }
    public static int WprowadzanieInt(){
        Scanner wprowadzanie = new Scanner(System.in);
        int liczba = wprowadzanie.nextInt();
        return liczba;
    }
    public static void Menu() {
        System.out.println("Wybierz operacje, ktore chcesz by program wykonal");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnozenie");
        System.out.println("4.Dzielenie");
        System.out.println("5.Potegowanie");
        System.out.println("6.Pierwiastkowanie");
        System.out.println("7.Funkcje trygonometryczne");
        System.out.println("0.Zakoncz dzialanie programu");
    }



    public static void Suma() {
        System.out.print("Wprowadz 1 liczbe: ");
        double a = WprowadzanieDouble();
        System.out.print("Wprowadz 2 liczbe: ");
        double b = WprowadzanieDouble();
        double wynik = a + b;
        System.out.print("Wynik: " + wynik+"\n");

    }

    public static void Roznica() {
        System.out.print("Wprowadz 1 liczbe: ");
        double a = WprowadzanieDouble();
        System.out.print("Wprowadz 2 liczbe: ");
        double b = WprowadzanieDouble();
        double wynik = a - b;
        System.out.print("Wynik: " + wynik+"\n");

    }

    public static void Iloczyn() {
        System.out.print("Wprowadz 1 liczbe: ");
        double a = WprowadzanieDouble();
        System.out.print("Wprowadz 2 liczbe: ");
        double b = WprowadzanieDouble();
        double wynik = a * b;
        System.out.print("Wynik: " + wynik+"\n");



    }

    public static void Iloraz() {
        System.out.print("Wprowadz 1 liczbe: ");
        double a = WprowadzanieDouble();
        System.out.print("Wprowadz 2 liczbe: ");
        double b = WprowadzanieDouble();
        if(b==0){
            System.out.println("Nie można dzielić przez 0."+"\n");
            return;
        }
        double wynik = a / b;
        System.out.print("Wynik: " + wynik+"\n");


    }

    public static void Potega() {
        System.out.print("Wprowadz liczbe: ");
        double a = WprowadzanieDouble();
        System.out.print("Wprowadz do ktorej potegi: ");
        double b = WprowadzanieDouble();
        double wynik = Math.pow(a,b);
        System.out.println("Wynik: " + wynik+"\n");
    }

    public static void Pierwiastek() {
        System.out.print("Wprowadz liczbe: ");
        double a = WprowadzanieDouble();
        double wynik = Math.sqrt(a);
        System.out.println("Wynik: " + wynik+"\n");
    }

    public static void funTryg() {
        System.out.print("Wprowadz kat w stopniach: ");
        double a = WprowadzanieDouble();
        double radians = Math.toRadians(a);
        double wynik = Math.sin(radians);
        System.out.println("Wynik: " + wynik+"\n");

    }
    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = WprowadzanieString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2) ) System.exit(0);
    }


}
class zadanie5 {
    public static void zadanie() {
        for (int i=20;i>=0;i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
class zadanie6 {
    public static void zadanie(Scanner wprowadzanie){
        for (;;) {
            System.out.print("Wprowadz liczbe: ");
            int liczba = wprowadzanie.nextInt();
            if (liczba < 0) {
                break;
            }
        }
    }
}
class zadanie7 {
    public static void zadanie(Scanner wprowadzanie) {
        System.out.print("Wprowadz ilosc liczb: ");
        int n = wprowadzanie.nextInt();
        int temp;
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Wprowadz liczbe: ");
            tablica[i] = wprowadzanie.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (tablica[j] > tablica[j+1]) {
                    temp = tablica[j];
                    tablica[j] = tablica[j+1];
                    tablica[j+1] =temp;
                }
            }
        }
        System.out.print("Posortowane liczby: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tablica[i] + " ");

        }

    }
}