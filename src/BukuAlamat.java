/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BukuAlamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<String> nama = new ArrayList<>();
//        ArrayList<String> alamat = new ArrayList<>();
//        ArrayList<String> tlp = new ArrayList<>();
//        ArrayList<String> email = new ArrayList<>();
        ArrayList<Data> data = new ArrayList<>();
        boolean ngulang = true;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu Buku Alamat");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. View All Data");
            int pilih = scan.nextInt();
            switch(pilih){
                case 1:
                    Data d = new Data();
                    System.out.println("Masukan Nama : ");
                    d.setNama(scan.next());
                    System.out.println("Masukan Alamat : ");
                    d.setAlamat(scan.next());
                    System.out.println("Masukan Nomor Telepon : ");
                    d.setTelepon(scan.next());
                    System.out.println("Masukan Email : ");
                    d.setEmail(scan.next());
                    data.add(d);
                    break;
                case 2:
                    System.out.println("Masukan index (angka dimulai dari 1) untuk di update : ");
                    int up = scan.nextInt()-1;
                    Data da = new Data();
                    System.out.println("Masukan Nama : ");
                    da.setNama(scan.next());
                    System.out.println("Masukan Alamat : ");
                    da.setAlamat(scan.next());
                    System.out.println("Masukan Nomor Telepon : ");
                    da.setTelepon(scan.next());
                    System.out.println("Masukan Email : ");
                    da.setEmail(scan.next());
                    data.set(up, da);
                    break;
                case 3:
                    System.out.println("Masukan index (angka dimulai dari 1) untuk di delete : ");
                    int in = scan.nextInt() - 1;
                    data.remove(in);
                    System.out.println("Data index "+in+" telah di delete");
                    break;
                case 4:
                    System.out.println("No\tNama\t\tAlamat\t\t\tNo Telp\t\t\tE-mail");
                    for (int i = 0; i < data.size(); i++) {
                        System.out.println((i+1)+"\t"+data.get(i).getNama()+"\t\t"+data.get(i).getAlamat()+"\t\t\t"+data.get(i).getTelepon()+"\t\t\t"+data.get(i).getEmail());
                    }

                    break;
                default:
                    break;
            }
            System.out.println("Ingin main lagi ? (Y/N)");
            String ulang = scan.next();
            if(ulang.equals("Y") || ulang.equals("y")){
            }else{
                break;
            }
        }while(ngulang = true);
    }
    
}
