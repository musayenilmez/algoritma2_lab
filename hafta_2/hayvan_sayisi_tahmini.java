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
Bir çiftlikte tavuk, inek ve koyunların olduğu biliniyor. 
Hayvanların ayak sayıları toplamı 24 olduğuna göre 
hayvan sayılarını tahmin eden metodu yazınız
*/
public class hayvan_sayisi_tahmini {
    
    public static void  tahmin(int sayi){
        for (int i = 1; i < sayi; i++) {// tavuk ayakları
            for (int j = 1; j < sayi; j++) {// inek ayakları
                for (int k = 1; k < sayi; k++) {// koyun ayakları
                    
                    if(2*i+4*j+4*k==sayi)
                        System.out.println(i+","+j+","+k);
                }}}}
    public static void main(String[] args) {
        tahmin(16);
    }

}
