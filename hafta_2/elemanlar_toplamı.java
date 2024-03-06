/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_2;

/**
 *
 * @author myenilmez
 */
//Bir dizideki elemanlar toplamını bulan rekürsif metodu yazalım
public class elemanlar_toplamı {
    
        public static int diziToplam(int[] dizi, int index) {
        // Dizi boşsa veya index geçerli değilse toplam 0'dır
        if (dizi == null || index < 0 || index >= dizi.length) {
            return 0;
        }   
        // Base case: index son elemana ulaştığında, son elemanı döndür
        if (index == dizi.length - 1) {
            return dizi[index];
        }
        
        // Recursive case: index'teki elemanı topla ve bir sonraki eleman için rekürsif çağrı yap
        return dizi[index] + diziToplam(dizi, index + 1);
    }
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int toplam = diziToplam(dizi, 0);
        System.out.println("Dizi Toplamı: " + toplam);
    }

}
