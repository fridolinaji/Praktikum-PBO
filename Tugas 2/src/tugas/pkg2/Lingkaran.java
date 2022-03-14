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
public class Lingkaran implements MenghitungBidang {
   double r;

    Lingkaran(double r){
        this.r = r;
    }

    @Override
    public void luas() {
        
        double luas = 3.14*this.r*this.r;
        System.out.println(" Luas Lingkaran = "+luas);
    }

    @Override
    public void keliling() {
        
        double keliling = 2*3.14*this.r;
        System.out.println(" Keliling Lingkaran = "+keliling);
    }
}
