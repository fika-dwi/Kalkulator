/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_fikadwi_1817101410;
import java.util.Scanner;
/**
 *
 * @author pikachu
 */
public class Perkalian {
    double a,b,hasil;
    public Perkalian(){
    Scanner komponen = new Scanner(System.in);
    System.out.println("Masukkan bilangan pertama :");
    a = komponen.nextDouble();
    System.out.println("Masukkan bilangan kedua :");
    b = komponen.nextDouble();
    }
    public void kali(){
        hasil = a * b;
        System.out.println(a +" x "+ b + " = " + hasil);
    }
}
