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
Kendisine parametre olarak gelen sayının rakamları toplamını rekürsif olarak bulan fonksiyonu yazalım.

*/
public class rakamlar_toplamı {
    
    public static int rakam_topla(int sayi){
    if(sayi%10==0) return sayi;
    else return sayi%10 + rakam_topla(sayi/10);
    }
    public static void main(String[] args) {
        System.out.println("Sayının rakamları toplamı = "+rakam_topla(345));
    }
}
