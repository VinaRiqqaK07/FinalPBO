import java.util.Scanner;

public abstract class Trapesium {
    //abstract method
    public abstract double luasTrapesium(double a, double b, double tinggi);
    public abstract double kelilingTrapesium(double a, double b, double c, double d);

    //reguler method
    public double tinggiTrapesium(){
        double a, b, luas;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan dua sisi sejajar dan Luas");
        System.out.print("\na: "); a = keyboard.nextDouble();
        System.out.print("b: "); b = keyboard.nextDouble();
        System.out.print("Luas: "); luas = keyboard.nextDouble();

        return (2*luas)/(a+b);
    }
}

