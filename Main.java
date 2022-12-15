import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //DEKLARASI
        BangunDatar objek = new BangunDatar();
        boolean masuk = true;
        boolean looping = true;

        //File Handling
        try {
            File segitigaFile = new File("D:\\FINAL_PBO\\segitiga.txt");
            if(segitigaFile.createNewFile()){
                System.out.println("File segitiga.txt telah terbuat");
            }else{
                System.out.println("File segitiga.txt sudah ada");
            }

            File lingkaranFile = new File("D:\\FINAL_PBO\\lingkaran.txt");
            if(lingkaranFile.createNewFile()){
                System.out.println("File lingkaran.txt telah terbuat");
            }else{
                System.out.println("File lingkaran.txt sudah ada");
            }

            File trapesiumFile = new File("D:\\FINAL_PBO\\trapesium.txt");
            if(trapesiumFile.createNewFile()){
                System.out.println("File trapesium.txt telah terbuat");
            }else{
                System.out.println("File trapesium.txt sudah ada");
            }

            File persegiFile = new File("D:\\FINAL_PBO\\persegi.txt");
            if(persegiFile.createNewFile()){
                System.out.println("File segitiga.txt telah terbuat");
            }else{
                System.out.println("File segitiga.txt sudah ada");
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Ada Error");
            e.printStackTrace();
        }

        //PROGRAM
        System.out.println("\n======PROGRAM BANGUN DATAR======");

        while(masuk){
            System.out.println("\nPilih Menu Bangun Datar:\n1. Segitiga\n2. Lingkaran\n3. Lainnya\n4. Keluar");
            System.out.print("Menu: "); int a = input.nextInt();

            switch (a) {
                case 1:
                    System.out.print("\nAlas: "); objek.setAlas(input.nextDouble());
                    System.out.print("Tinggi: "); objek.setTinggi(input.nextDouble());
                    objek.segitiga();
                   
                    BangunDatar kel = new KelilingSegitiga();
                    kel.segitiga();
                   
                    System.out.println("Luas Segitiga: " + objek.getLuas());

                    try {
                        Writer pensegitiga;
                        pensegitiga = new BufferedWriter(new FileWriter("segitiga.txt", true));
                        pensegitiga.append(objek.getLuas() + "\n");
                        pensegitiga.close();
                    } catch (IOException e) {
                        // TODO: handle exception
                        System.out.println("Ada Error");
                        e.printStackTrace();
                    }
                    masuk = false;
                    break;
        
                case 2:
                    //objek lingkaran
                    System.out.print("\nJari-jari: "); objek.setJari(input.nextDouble());
                    objek.lingkaran();
                    System.out.println("\nKeliling: " + objek.getKeliling());
                    System.out.println("Luas: " + objek.getLuas());

                    try {
                        Writer penlingkaran;
                        penlingkaran = new BufferedWriter(new FileWriter("lingkaran.txt", true));
                        penlingkaran.append(objek.getLuas() + "\n");
                        penlingkaran.close();
                    } catch (IOException e) {
                        // TODO: handle exception
                        System.out.println("Error");
                        e.printStackTrace();
                    }
                    masuk = false;
                    break;

                case 3:
                    looping = true;
                    while(looping){
                        System.out.println("\nMenu Lainnya:\n5. Trapesium\n6. Persegi\n7. Kembali\n8. Keluar");
                        System.out.print("Menu: "); int menu = input.nextInt();

                        switch (menu) {
                            case 5:
                                BangunTrapesium traps = new BangunTrapesium();
                                ArrayList<Double> sTraps = new ArrayList<Double>();
                                System.out.println("\nMasukkan dua sisi sejajar dan tinggi");
                                System.out.print("Sisi satu: "); double s = input.nextDouble(); sTraps.add(s);
                                System.out.print("Sisi dua: "); s = input.nextDouble(); sTraps.add(s);
                                System.out.print("Tinggi: "); double tinggitrap = input.nextDouble();

                                System.out.println("\nMasukkan dua sisi yang lain");
                                System.out.print("Sisi tiga: "); s = input.nextDouble(); sTraps.add(s);
                                System.out.print("Sisi empat: "); s = input.nextDouble(); sTraps.add(s);
                                
                                System.out.println("\nKeliling Trapesium: " + traps.kelilingTrapesium(sTraps.get(0), sTraps.get(1), sTraps.get(2), sTraps.get((3))));
                                System.out.println("Luas Trapesium: " + traps.luasTrapesium(sTraps.get(0), sTraps.get(1), tinggitrap));

                                try {
                                    Writer pentrapesium;
                                    pentrapesium = new BufferedWriter(new FileWriter("trapesium.txt", true));
                                    pentrapesium.append(traps.luasTrapesium(sTraps.get(0), sTraps.get(1), tinggitrap) + "\n");
                                    pentrapesium.close();
                                } catch (IOException e) {
                                    // TODO: handle exception
                                    System.out.println("Error");
                                    e.printStackTrace();
                                }
                                looping = false;
                                masuk = false;
                                break;

                            case 6:
                                Persegi persegi = new Persegi();
                                System.out.print("\nMasukkan sisi: "); double sisi = input.nextDouble();
                                System.out.println("\nKeliling Persegi: "+ persegi.kelilingBangun().add(sisi));
                                System.out.println("Luas Persegi: "+ persegi.luasBangun(sisi));

                                try {
                                    Writer penpersegi;
                                    penpersegi = new BufferedWriter(new FileWriter("persegi.txt", true));
                                    penpersegi.append(persegi.luasBangun(sisi) + "\n");
                                    penpersegi.close();
                                } catch (IOException e) {
                                    // TODO: handle exception
                                    System.out.println("Error");
                                    e.printStackTrace();
                                }
                                looping = false;
                                masuk = false;
                                break;
                        
                            case 7:
                                looping = false;
                                break;
                            
                            case 8:
                                looping = false;
                                masuk = false;
                                break;
                            default:
                                System.out.println("Menu Invalid. Silakan memilih kembali");
                                break;
                        }

                    
                    }
                    
                    break;
                
                case 4:
                    masuk = false;
                    break;

                default:
                    System.out.println("Menu Invalid. Silakan memilih kembali");
                    break;
            }

        }
        System.out.println("\n======PROGRAM EXIT======");
    }
}
