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
public class Balok implements MenghitungRuang {
   int tinggi;
   int panjang;
   int lebar;
   Balok(int tinggi, int panjang, int lebar){
       this.panjang = panjang;
       this.lebar = lebar;
       
       this.tinggi = tinggi;   
   }
   @Override
   public void volume(){
       int volume;
      
       volume = this.panjang*this.lebar*this.tinggi;
       System.out.println("Volume balok = "+volume);
   }
    @Override
    public void luaspermukaan() {
        int lp = (this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi);
        System.out.println(" Luas Permukaan Balok = "+lp);
    }

    void luas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void keliling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
