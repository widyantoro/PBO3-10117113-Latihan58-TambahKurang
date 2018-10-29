/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO310117113Latihan58TambahKurang;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan hasil penjumlahan dan pengurangan
 *            dua buah bilangan.  
 *            
 */
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah() {
        int z = getX() + getY();
        System.out.println("Hasil penjumlahan = " + z);
    }
}
