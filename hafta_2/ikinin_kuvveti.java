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
Bütün pozitif tamsayılar 2’ nin kuvvetlerinin toplamından oluşurlar. 
Örnek 45=2^5+2^3+2^2+2^0 şeklindedir. 
M gibi pozitif tamsayı alan bir fonksiyon yazınız ki bu fonksiyon M sayısını 2’ nin
kuvvetlerinin toplamı şeklinde yazsın.


*/
public class ikinin_kuvveti {
    
    public static String ikininkuvveti(int sayi){
        String S="";
        while(sayi>0){
            int i=0,ikikuvvet=1;
            while(true){
                ikikuvvet=2*ikikuvvet;
                if(ikikuvvet>sayi){ikikuvvet=ikikuvvet/2;break;}
                i++;
            }
            S=S+"2^"+i+"+";
            sayi=sayi-ikikuvvet;
        }
        return S;
    }
    public static void main(String[] args) {
        System.out.println(ikininkuvveti(12));
    }

}
