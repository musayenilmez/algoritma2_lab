/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta_1_recursive_functions;

/**
 *
 * @author myenilmez
 */
public class kare_alma {

    public static void main(String[] args) {
        int sayi = 9;
        System.out.println("Sayının Karesi ---> " + kare_al(sayi));

    }

    public static int kare_al(int sayi) {
        if (sayi == 0) {
            return 0;
        } else {
            return ((kare_al(sayi - 1) + (2 * sayi) - 1));
        }
    }

}
