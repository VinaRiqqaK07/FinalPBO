import java.util.Scanner;

//POLYMORPHISM - INHERITANCE
class KelilingSegitiga extends BangunDatar{
    static Scanner inputan = new Scanner(System.in);

    public void segitiga(){
        //DEKLARASI
        KelilingSegitiga object = new KelilingSegitiga();
        boolean loop = true;

        //PROGRAM
        while(loop){
            System.out.println("\nPilih jenis segitiga:\n1. Segitiga sama sisi\n2. Segitiga sama kaki\n3. Segitiga sembarang");
            System.out.print("Menu: "); int a = inputan.nextInt();
            
            switch (a) {
                case 1:
                    System.out.print("\nMasukkan sisi: "); object.setAlas(inputan.nextDouble());
                    double keli = object.getAlas()*3;
                    object.setKeliling(keli);
                    System.out.println("\nKeliling Segitiga: "+ object.getKeliling());
                    loop = false;
                    break;
            
                case 2:
                    System.out.print("\nMasukkan sisi alas: "); object.setAlas(inputan.nextDouble());
                    System.out.print("Masukkan sisi sama kaki: "); double kaki = inputan.nextDouble();
                    object.setKeliling(object.getAlas()+(2*kaki));
                    System.out.println("\nKeliling Segitiga: "+ object.getKeliling());
                    loop = false;
                    break;

                case 3:
                    System.out.println("\nMasukkan tiga sisi segitiga");
                    System.out.print("Sisi satu: "); double si1 = inputan.nextDouble();
                    System.out.print("Sisi dua: "); double si2 = inputan.nextDouble();
                    System.out.print("Sisi tiga: "); double si3 = inputan.nextDouble();
                    object.setKeliling(si1+si2+si3);
                    System.out.println("\nKeliling Segitiga: " + object.getKeliling());
                    loop = false;
                    break;

                default:
                    System.out.println("\nMenu Invalid. Silakan pilih kembali");
                    break;
            }
        }
    }
}

