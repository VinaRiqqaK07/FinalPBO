public class BangunTrapesium extends Trapesium{
    public double luasTrapesium(double a, double b, double tinggi){
        double luas = ((a+b)*tinggi)/2;
        return luas;
    }

    public double kelilingTrapesium(double a, double b, double c, double d){
        double keliling = a+b+c+d;
        return keliling;
    }
}
