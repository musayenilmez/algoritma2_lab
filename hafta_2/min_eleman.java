/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class min_eleman {
    
   public static void main(String args[])
   {
      int dizi[] = {2, 13, 7, 10, 24, 19};
      int boyut = dizi.length;
      System.out.println(min_bul(dizi, boyut)); 
   }
   
       public static int min_bul(int dizi[], int boyut){
       if(boyut==1)
       return dizi[0];
       else
           return Math.min(dizi[boyut-1], min_bul(dizi, boyut-1));
   }
}
