

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
public class Kalkulator_FikaDwi_1817101410 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int jawab;
        do{
        Scanner komponen = new Scanner(System.in);
        System.out.println("Masukkan Pilihan :");
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian ");
        System.out.println("5. Keluar ");
        
        jawab = komponen.nextInt();
        
                switch (jawab)
        {
            case 1 :
            Pertambahan tam = new Pertambahan();
            tam.tambah();
            break;
            
            case 2 :
            Pengurangan kur = new Pengurangan();
            kur.kurang();
            break;
            
            case 3 :
            Perkalian kal = new Perkalian();
            kal.kali();
            break;
            
            case 4 :
            Pembagian bag = new Pembagian();
            bag.bagi();
            break;
            
            case 5 :
            System.out.print("Terima Kasih Sudah Menggunakan Aplikasi ini");
            System.exit(0);
            break;
              }
        
        }while (jawab>0 || jawab<6);
    }
     
}
