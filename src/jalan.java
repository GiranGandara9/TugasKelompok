/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class jalan {
    private static int pilih;
   
    
    public static void main(String[]args){
        Car move = new Car (220,0,0);
        Scanner in = new Scanner(System.in);
        while(!move.isStarted()){
            System.out.println("1. Nyalakan ");
            System.out.println("2. Berhenti ");
            System.out.println("3. Rem ");
            System.out.println("4. Ganti Gigi ");
            System.out.println("5. Gas ");
            System.out.println("6. Matikan ");
            System.out.println(" ");
            System.out.println("Kecepatan Mobil " + move.getKecaktual());
            System.out.print("Silahkan Pilih: ");
            pilih = in.nextInt();
            switch(pilih){
                case 1:
                    move.Start();
                    break;
                case 2:
                    move.stop();
                    break;
                case 3:
                    move.rem();
                    break;
                case 4:
                    System.out.print("Masukkan gigi: " );
                    int gigi = in.nextInt();
                    System.out.println("Sekarang ada di gigi: " +gigi);
                    move.gantiGigi(gigi);
                    break;
                case 5:
                    move.gas();
                    break;
               
            }
        }
    }
    
    
}
