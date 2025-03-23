package pachet1;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassB {
    public static void ex1() {

        System.out.println(" Introduceți codul monedei (EUR, GBP, INR, AUD): ");
        Scanner scanner = new Scanner(System.in);
        String moneta = scanner.next().toUpperCase();
        System.out.println("Introduceti valoarea in USD: ");
        double valoareaUSD = scanner.nextDouble();
        double valoareaConvertita;

        double USD_TO_EUR = 0.85;
        double USD_TO_GBP = 0.75;
        double USD_TO_INR = 75.0;
        double USD_TO_AUD = 1.35;

        switch (moneta) {
            case "EUR":
                valoareaConvertita = valoareaUSD * USD_TO_EUR;
                System.out.println("Valoarea convertita: " + valoareaConvertita + " EUR");
                break;
            case "GBP":
                valoareaConvertita = valoareaUSD * USD_TO_GBP;
                System.out.println("Valoarea convertita: " + valoareaConvertita + " GBP");
                break;
            case "INR":
                valoareaConvertita = valoareaUSD * USD_TO_INR;
                System.out.println("Valoarea convertita: " + valoareaConvertita + " IRN");
                break;
            case "AUD":
                valoareaConvertita = valoareaUSD * USD_TO_AUD;
                System.out.println("Valoarea convertita: " + valoareaConvertita + " AUD");
                break;
            default:
                System.out.println("Moneda neaceptata!");

        }
        scanner.close();
    }

    public static void ex2() {
        System.out.println(" Introduceți un numar intreg pozitiv: ");
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        if (nr < 0) System.out.println("Va rog introduceti un nr pozitive!");
        else {
            int invers = 0;
            while (nr > 0) {
                int cifra = nr % 10; // extragem ultima cifra
                invers = invers * 10 + cifra; // construim nr inversat
                nr /= 10;
            }
            System.out.println("Inversul nr-ului este: " + invers);
        }

        scanner.close();
    }

    public static void ex3() {
        System.out.println(" Introduceți un numar: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Introdu al doilea nr: ");
        int b = scanner.nextInt();
        if (a > 0 && b > 0)
            System.out.println("Suma nr este: " + (a + b));
        else System.out.println("Numarul nu este pozitiv!");
        scanner.close();
    }

    public static void ex4() {
        int nr = 101;
        while (true) {
            if (nr % 7 == 0 && nr % 9 == 0) {
                System.out.println("Primul număr pozitiv mai mare decât 100, multiplu de 7 și 9, este: " + nr);
                break;
            }
            nr++;
        }

    }

    public static void ex5() {
        int parola = 12345;
        Scanner scanner = new Scanner(System.in);

        for (int p = 0; p < 3; p++) {
            System.out.println("Introduceti parola: ");
            int a = scanner.nextInt();
            if (a == parola) {
                System.out.println("Autentificat!");
                return;
            } else System.out.println("Parola gresita!");
        }
        System.out.println("Ati introdus de 3 ori. Accesul este blocat");
        scanner.close();
    }

    public static void ex6() {
        System.out.println("Celsius  Fahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            System.out.printf("%7d %12.1f%n", celsius, fahrenheit);
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("MENU");
            System.out.println("1. Adunarea a doua numere");
            System.out.println("2. Scaderea a doua numere");
            System.out.println("3. Inmultirea a doua numere");
            System.out.println("4. Inpartirea a doua numere");
            System.out.println("5. Iesi din program!");

            System.out.println("Alege o optiune din MENU:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introdu primul numar:");
                    int a = scanner.nextInt();
                    System.out.println("Introdu al doilea numar:");
                    int b = scanner.nextInt();
                    System.out.println("Suma a doua numere este: " + (a + b));
                    break;
                case 2:
                    System.out.println("Introdu primul numar:");
                    int c = scanner.nextInt();
                    System.out.println("Introdu al doilea numar:");
                    int d = scanner.nextInt();
                    System.out.println("Scaderea a doua numere este: " + (c - d));
                    break;
                case 3:
                    System.out.println("Introdu primul numar:");
                    int f = scanner.nextInt();
                    System.out.println("Introdu al doilea numar:");
                    int e = scanner.nextInt();
                    System.out.println("Inmultirea a doua numere este: " + (f * e));
                    break;
                case 4:
                    System.out.println("Introdu primul numar:");
                    int g = scanner.nextInt();
                    System.out.println("Introdu al doilea numar:");
                    int h = scanner.nextInt();
                    System.out.println("Impartirea a doua numere este: " + (g / h));
                    break;
                case 5:
                    System.out.println("Pa Pa");
                    break;
                default:
                    System.out.println("Optiune invalida");

            }
        } while (option != 5);
        scanner.close();
    }
}
