package pachet2;

import jdk.jshell.spi.SPIResolutionException;
import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Predicate;

public class PrimulProiect {

    public PrimulProiect() { //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: "); // sout
        int nr = scanner.nextInt();
        if (nr % 2 == 0) System.out.println("Numarul: " + nr + " este par");
        else System.out.println("Numarul: " + nr + " este impar");


    }

    public PrimulProiect(int a, int b, int c, int d) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu latimea primului dreptunghi: ");
        a = scanner.nextInt();
        System.out.println("Introdu lungimea primului dreptunghi: ");
        b = scanner.nextInt();
        int aria1 = a * b;
        System.out.print("Introdu latimea lui al doilea dreptunghi: ");
        c = scanner.nextInt();
        System.out.println("Introdu lungimea lui al doilea dreptunghi: ");
        d = scanner.nextInt();
        int aria2 = c * d;

        if (aria1 > aria2) System.out.println("Primul dreptunghi are aria mai mare: " + aria1);
        else System.out.println("Al doilea dreptunghi are aria mai mare: " + aria2);
    }

    public PrimulProiect(double a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        a = scanner.nextDouble();
        if (a > 0) System.out.println("pozitiv " + a);
        if (a < 0) System.out.println("negativ " + a);
        if (a == 0) System.out.println("zero " + a);
        if (a < 0) System.out.println("mic " + a);
        if (a > 1000000) System.out.println("mare " + a);
    }

    public PrimulProiect(int temp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti temperatura: ");
        temp = scanner.nextInt();
        if (temp < 10) System.out.println("Poartă o jachetă!");
        else if (temp >= 10 && temp <= 25) System.out.println("Este o zi frumoasă!");
        else System.out.println("Este foarte cald, rămâi hidratat!");

    }

    public PrimulProiect(double cumparaturi, String mesaj) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti suma totala de cumparaturi: ");
        cumparaturi = scanner.nextDouble();
        double PretFinal = (cumparaturi > 100) ? cumparaturi * 0.9 : cumparaturi;
        System.out.println("Pretul final este: " + PretFinal);
    }

    public PrimulProiect(int varsta, int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu varsta unei persoane: ");
        varsta = scanner.nextInt();
        if (varsta < 12) System.out.println("Preț bilet: 5$");
        else if (varsta >= 12 && varsta <= 60) System.out.println("Preț bilet: 7$");
        else System.out.println("Preț bilet: 7$");
    }

    public PrimulProiect(int an, String mesaj) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu anul: ");
        an = scanner.nextInt();
        if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0))
            System.out.println(an + " Este an bisect!");
        else System.out.println(an + " Nu este an bisect!");
    }

    public PrimulProiect(int punctajul, double punct) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu punctajul: ");
        punctajul = scanner.nextInt();
        if (punctajul >= 90) System.out.println("A");
        else if (punctajul >= 80 && punctajul <= 89) System.out.println("B");
        else if (punctajul >= 70 && punctajul <= 79) System.out.println("C");
        else if (punctajul >= 60 && punctajul <= 69) System.out.println("D");
        else System.out.println("F");
    }

    public PrimulProiect(boolean isStudent, int varsta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu varsta: ");
        varsta = scanner.nextInt();
        System.out.println("Esti student? (raspunde cu true / false): ");
        isStudent = scanner.nextBoolean();
        if (varsta <= 18) System.out.println("discount de 20%");
        else if (isStudent == true) System.out.println("discount de 20%");
        else System.out.println("Nu primesti nimic");
    }

    public PrimulProiect(String password) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu parola: ");
        password = scanner.nextLine();
        if (password.length() < 6) System.out.println("Parolă slabă");
        else if (password.length() < 12) System.out.println("Parolă moderat");
        else System.out.println("Parolă puternică");
    }
}