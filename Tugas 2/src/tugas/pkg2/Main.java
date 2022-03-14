/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int rep;
        do{
            Scanner input =  new Scanner(System.in);
            System.out.println(" ========== ");
            System.out.println(" Menu ");
            System.out.println(" ========== ");
            System.out.println(" 1.Balok ");
            System.out.println(" 2.Tabung ");
            System.out.println(" 0. exit");
            System.out.print(" Pilih ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print(" Input Panjang : ");
                    int panjang = input.nextInt();
                    System.out.print(" Input Lebar : ");
                    int lebar = input.nextInt();
                    System.out.print(" Input Tinggi : ");
                    int tinggi = input.nextInt();
                    PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
                    Balok bidang = new Balok(panjang, lebar, tinggi);
                    persegi.luas();
                    persegi.keliling();
                    bidang.volume();
                    bidang.luaspermukaan();
                    break;
                case 2: System.out.print(" Input Jari - Jari : ");
                        double r = input.nextDouble();
                        System.out.print(" Input Tinggi : ");
                        double tinggi2 = input.nextDouble();
                        Lingkaran bangun = new Lingkaran(r);
                        Tabung Ruang = new Tabung(r, tinggi2);
                        bangun.luas();
                        bangun.keliling();
                        Ruang.volume();
                        Ruang.luaspermukaan();
                    break;
                case 0: System.exit(0);
                    break;
                default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                    break;
            }
            System.out.print(" Hitung Lagi ? [iya:1 | tidak:0] : " );
            rep = input.nextInt();
        }while(rep == 1);
        
    }
}


