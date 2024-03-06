/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class fibonacci {
    
    public static void main (String args[]) {
    for(int i=1; i<=7; i++){ 
      System.out.print(fibonacci(i) +" , "); 
    }
    System.out.println();
  }


  //Rekürsif Olarak Fibonacci Dizisi Oluşturma Fonksiyonu
  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
