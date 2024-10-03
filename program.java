package tugasprogram;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //deklarasi variabel
         int pilihanSub = 0, jumlah;
        double total = 0, harga, diskon, uangBayar, uangKembalian;
        
        System.out.println("======================================================");
        System.out.println("KASIR WARUNG SEDERHANA");
        System.out.println("DAFTAR MENU : ");
        System.out.println("(1). SATE \n   - Sate Ayam : Rp 1.500 per Tusuk \n   - Sate Kambing : Rp 3.000 per Tusuk");
        System.out.println("\n(2). PECEL \n   - Lauk Ayam : Rp 13.000 per Porsi \n   - Lauk Empal : Rp 15.000 per Porsi");
        System.out.println("\n(3). PENYETAN \n   - Lauk Tahu/Tempe : Rp 5.000 per Porsi \n   - Lauk Telur : Rp 7.000 per Porsi \n   - Lauk Ayam : Rp 10.000 per Porsi");
        System.out.print("\n======================================================\n ");
        System.out.print("\nPilih menu sesuai nomor yang di sediakan (1/2/3)   : ");
        int pilihanMenu = sc.nextInt();
        //proses
        switch (pilihanMenu) {
             case 1: 
                  System.out.print("Pilih submenu sesai nomor yang di sediakan (1/2) : ");
                  pilihanSub = sc.nextInt();
                  
                  if(pilihanSub == 1){
                      harga = 1500;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }else if(pilihanSub == 2){
                      harga = 3000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }
                break;
               case 2:
                  System.out.print("Pilih submenu sesai nomor yang di sediakan (1/2) : ");
                  pilihanSub = sc.nextInt();
                  
                  if(pilihanSub == 1){
                      harga = 13000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }else if(pilihanSub == 2){
                      harga = 15000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }
                   break;
               case 3:
                    System.out.print("Pilih submenu sesuai nomor yang disediakan (1/2/3) : ");
                    pilihanSub = sc.nextInt();

                    switch(pilihanSub) {
                        case 1: 
                            harga = 5000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;
                        case 2:
                            harga = 7000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;
                        case 3:
                            harga = 10000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;

                        default:
                            System.out.println("Pilihan anda tidak valid");
                            return;
                    }
                    break;

                    default:
                    System.out.println("Pilihan anda tidak valid");
                    return;
        }
        //proses diskon + pembayaran
        System.out.print("\nApakah anda memiliki kartu member? (ada/tidak) : ");
        String member = sc.next();   
        
        if(member.equalsIgnoreCase("ada")){
            diskon = 0.05 * total;
            total -= diskon;
            System.out.println("Anda mendapatkan diskon senilai = Rp " + diskon);
            System.out.println("Total biaya yang harus dibayar = Rp " + total);
        }else if(member.equalsIgnoreCase("tidak")){
            System.out.println("Total biaya yang harus dibayar = Rp " + total);
        }
        
        System.out.print("\nMasukkan nominal pembayaran : ");
        uangBayar = sc.nextDouble();
        System.out.print("\n======================================================\n ");
        
        uangKembalian = uangBayar - total;
        
        System.out.println("\nUang  yang anda bayarkan senilai Rp " + uangBayar);
        System.out.println("Total pembelian anda senilai     Rp " + total);
        System.out.println("Total kembalian anda adalah      Rp " + uangKembalian);
        System.out.print("\n======================================================\n ");
        
    }
    
  } 

