/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan31perkenalanmahasiswa;

/**
 *
 * @author 
 * Nama     : Muhammad Rakha Firdaus
 * NIM      : 10118059
 * Kelas    : IF-2
 */
public class PBO210118059Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama = "Rakha";
        mhs.nim = "10118059";       
        mhs.perkenalkanDiri();
        
        mhs.nama = "Bagus";
        mhs.nim = "10118080";        
        mhs.perkenalkanDiri();
                
    }
    
}
