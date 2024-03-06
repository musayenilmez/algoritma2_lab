/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class asal_sayi {

  public static void main(String[] args) {

    int sayi = 35;
    boolean kontrol = asal_mi(sayi, sayi / 2);
    
    if (kontrol == true)
      System.out.println("Asal Sayı.");
    else
      System.out.println("Asal Sayı Değil.");
  }
  
  public static boolean asal_mi(int sayi, int i) {
    if (i != 1) {
      if (sayi % i != 0)
        return asal_mi(sayi, i - 1);
      return false;
    }
    return true;
  }
  
}
