/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class faktoriyel {
    
    public static void main(String args[]) {
    int n_faktoriyel = faktoriyel_hesapla(5);
    System.out.println(n_faktoriyel);
  }

  //Rekürsif Faktöriyel Hesaplama Fonksiyonu
  public static int faktoriyel_hesapla(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * faktoriyel_hesapla(n - 1);
    }
  }
}
