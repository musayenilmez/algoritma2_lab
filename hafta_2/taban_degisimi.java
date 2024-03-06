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
Onaltı tabanına göre sayılar yazıldığında elde edilen sayının sahip olabileceği rakamlar 
{0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F} şeklinde olurlar. 
A rakamı on tabanında 10 sayısına eşittir; 
B rakamı on tabanında 11 sayısına eşittir; 
C rakamı on tabanında 12 sayısına eşittir; 
D rakamı on tabanında 13 sayısına eşittir; 
E rakamı on tabanında 14 ve 
F rakamı on tabanında 15 sayısına eşittir. 
Örneğin, 284 sayısı onaltı tabanında (11C)16 şeklinde olur. 
Buna göre kendisine parametre olarak gelen bir tamsayıyı ekrana onaltı tabanına göre yazan bir fonksiyon yazınız.

*/
public class taban_degisimi {
    
    public static String onAltiliTabandaYaz(int sayi) {
        String sb ="";
        // Sayı sıfırdan büyük olduğu sürece işlem yapılır
        while (sayi > 0) {
            // Sayının 16'lık tabandaki kalanı bulunur
            int kalan = sayi % 16; // 29%16 = 16+13 --> 1D
            // Kalan 10'dan büyükse A-F arasındaki harfe dönüştürülür
char kalanChar = (kalan < 10) ? (char)('0' + kalan) 
        : (char) ('A' + (kalan - 10));
            // Kalanı 16'lık tabanda yazmak için String'e eklenir
            sb=kalanChar+sb;
            // Sayıyı 16'ya böler ve döngü devam eder
            sayi /= 16;
        }       
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(onAltiliTabandaYaz(29));
    }

}
