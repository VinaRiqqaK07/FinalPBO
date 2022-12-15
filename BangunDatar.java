public class BangunDatar {
    //DEKLARASI
    protected double alas;
    protected double tinggi;
    private double jari;
    protected double luas;
    protected double keliling;
    static final double pi = 3.14;

    //ENCAPSULATION
    public void setAlas(double alasi){
        this.alas = alasi;
    }
    public double getAlas(){
        return this.alas;
    }

    public void setTinggi(double height){
        this.tinggi = height;
    }
    public double getTinggi(){
        return this.tinggi;
    }

    public void setJari(double jarijari){
        this.jari = jarijari;
    }
    public double getJari(){
        return this.jari;
    }

    public void setLuas(double l){
        this.luas = l;
    }
    public double getLuas(){
        return this.luas;
    }

    public void setKeliling(double kel){
        this.keliling = kel;
    }
    public double getKeliling(){
        return this.keliling;
    }

    //METHOD
    public void segitiga(){
        this.luas = (this.alas*this.tinggi)/2; 
    }

    public void lingkaran(){
        this.luas = pi * this.jari * this.jari;
        this.keliling = 2*pi*this.jari;
    }
}

