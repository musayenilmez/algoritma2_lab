/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_2;

/**
 *
 * @author myenilmez
 */

//Parametre olarak gelen bir Stringin palindrom olup olmadığını bulan metod yazalım. 
public class palindrom {

//Rekürsif
public static boolean isPalindrom(String str) {
    
        if (str == null || str.length() <= 1) {
            return true;
          
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
            
        } else {
            // String'in ilk ve son karakterleri eşleşiyorsa, iç kısmı kontrol etmek için recursive çağrı yapılır
            
            // level, nazan, yapay, kabak, ada, kazak, neden, küçük, makam
            return isPalindrom(str.substring(1, str.length() - 1));
   
        }

}




    public static void main(String[] args) {
        String str = "yapay";
        if (isPalindrom(str)) {
            System.out.println(str + " bir palindromdur.");
        } else {
            System.out.println(str + " bir palindrom değildir.");
        }
    }
    
    //İteratif
    public static boolean isPalindrom2(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        // başlagıc= i  bitiş= j
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
