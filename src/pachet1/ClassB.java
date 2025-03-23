package pachet1;

import javax.xml.transform.Source;
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
}
