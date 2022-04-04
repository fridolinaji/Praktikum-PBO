/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Hewan implements Animal {
String jenis;
String namaHewan;
String bunyi;

public Hewan(String jenis, String namaHewan, String bunyi){
    this.jenis = jenis;
    this.namaHewan = namaHewan;
    this.bunyi = bunyi;
    
}



    @Override
    public String getName() {
        return jenis;
    }

    @Override
    public String getType() {
        return namaHewan;
    }

    @Override
    public String makeSound() {
        return bunyi;
      
    }

    
   
   

    


}
