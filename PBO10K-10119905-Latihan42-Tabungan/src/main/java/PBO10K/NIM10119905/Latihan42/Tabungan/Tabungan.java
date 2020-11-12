/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan42.Tabungan;
/**
 *
 * @author aruma
 */
public class Tabungan {
    
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    
    public int ambilUang(int Jumlah){
        this.saldo = saldo;
        saldo = saldo-Jumlah;
         return saldo;
    }
}
