/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan42.Tabungan;
import java.util.Scanner;
/**
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Penarikan Uang
 */
public class Main {
    
    public static void main(String[] args) {
        int Saldo = 0;

        Scanner input = new Scanner(System.in);        
        System.out.println("=== Program Penarikan Uang ===");
        System.out.println("Masukan Saldo : ");
        Tabungan objTabungan = new Tabungan(input.nextInt());
        System.out.println("Jumlah Uang yang diambil : ");
        objTabungan.ambilUang(input.nextInt());
        System.out.println("Saldo anda sekarang : "+ objTabungan.ambilUang(Saldo));

    }
    
}
