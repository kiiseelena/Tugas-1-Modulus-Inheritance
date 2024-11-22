/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author kiee
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.setPertambahan(10, 2);
        System.out.println("Hasil dari Pertambahan = " + mtk.getPertambahan());

        mtk.setPengurangan(12, 5);
        System.out.println("Hasil dari Pengurangan = " + mtk.getPengurangan());

        mtk.setPerkalian(14, 4);
        System.out.println("Hasil dari Perkalian   = " + mtk.getPerkalian());

        mtk.setPembagian(16, 2);
        System.out.println("Hasil dari Pembagian   = " + mtk.getPembagian());

        mtk.setModulus(10, 3);
        System.out.println("Hasil dari Modulus     = " + mtk.getModulus());
    }
}
