/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class metin_boyutu {
    
    public static void main(String[] args) {
        
        String metin = "Merhaba";
        System.out.println("Metnin Boyutu ---> "+ boyut_hesapla(metin));
    }
    public static int boyut_hesapla(String metin) {
        
        if(metin.length()==0)
        return 0;
        else
            return 1 + boyut_hesapla(metin.substring(1, metin.length()));
        
        
    }
}
