import Pachet1.ClassB;
import Pachet2.PrimulProiect;

public class Main {
    public static void main(String[] args) {
        PrimulProiect proiect1 = new PrimulProiect(); //  apelarea constructorului din pachetul 2 (fara parametri)
        PrimulProiect proiect2 = new PrimulProiect(45);
        ClassB proiect3 = new ClassB();
        ClassB proiect4  = new ClassB(20);
    }
}