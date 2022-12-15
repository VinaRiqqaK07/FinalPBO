import java.util.Scanner;

public class Persegi implements BujurSangkar{
    interface sum{
        double add(double s);
    }

    public double luasBangun(double s){
        return s*s;
    }

    public sum kelilingBangun(){
        return (s) -> s*4; //lambda expression
    }
}

interface BujurSangkar{
    public double luasBangun(double s);
}