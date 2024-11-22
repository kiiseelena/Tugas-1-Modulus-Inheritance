/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author kiee
 */
public class MatematikaBeraksi {
    public static void main(String[] args){ 
        Matematika hasil  = new Matematika ();
        hasil.setPertambahan(9, 4);
        System.out.println("Hasil dari Pertambahan = " + hasil.getPertambahan());
        hasil.setPengurangan(9, 7);
        System.out.println("Hasil dari Pengurangan = " + hasil.getPengurangan());
        hasil.setPerkalian(8, 3);
        System.out.println("Hasil dari Perkalian   = " + hasil.getPerkalian());
        hasil.setPembagian(9, 3);
        System.out.println("Hasil dari Pembagian   = " + hasil.getPembagian());
    }
}
