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
public class PersegiPanjang implements MenghitungBidang{

    int panjang;
    int lebar;
    
    PersegiPanjang(int panjang, int lebar) {
       this.panjang = panjang;
       this.lebar = lebar;
    }
    
    @Override
    public void luas(){
        int luas;
        
        luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang ="+luas);
    }
    @Override
    public void keliling(){
        int keliling;
        keliling = 2*(this.panjang+this.lebar);
        System.out.println(" Keliling Persegi Panjang = "+keliling);
    }
    
}
