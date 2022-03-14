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
public class Tabung extends Lingkaran implements MenghitungRuang {
    private final double tinggi;

Tabung(double r, double tinggi){
    super(r);
      this.tinggi = tinggi;

}

    @Override
    public void volume() {
        double volume = 3.14*super.r*super.r*this.tinggi;
    System.out.println(" Volume Tabung = "+volume);
    }

    @Override
    public void luaspermukaan() {
        double lp = 2*3.14*super.r*(this.tinggi+super.r);
    System.out.println(" Luas Permukaan Tabung = "+lp);
    }
    
}
