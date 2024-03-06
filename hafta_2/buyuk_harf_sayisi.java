/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_2;

/**
 *
 * @author myenilmez
 */

/*
Kendisine parametre olarak gelen String te geçen büyük harf sayısını rekürsif olarak bulan fonksiyonu yazalım.

*/
public class buyuk_harf_sayisi {
    
    public static int buyuk_harf_sayisi(String str){
    if(str.length()<1) return 0;
    else if(str.charAt(str.length()-1)>='A' && str.charAt(str.length()-1)<='Z')
        return 1+ buyuk_harf_sayisi(str.substring(0,str.length()-1));
    else return 0+ buyuk_harf_sayisi(str.substring(0,str.length()-1));
    }
    
    public static void main(String[] args) {
        System.out.println(buyuk_harf_sayisi("Bilgisayar Mühendisliği"));
        
    }
}
