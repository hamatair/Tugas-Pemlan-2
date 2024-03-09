package pemlan.case2a;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        DataMahasiswa data = new DataMahasiswa();
        boolean next = true;
        while (next) {
            System.out.print("Masukkan NIM      : ");
            String nim = scanner.nextLine();
            data.setNims(nim);

            System.out.print("Masukkan Nama     : ");
            String nama = scanner.nextLine();
            data.setNamas(nama);

            System.out.print("Masukkan Alamat   : ");
            String alamat = scanner.nextLine();
            data.setAlamats(alamat);

            System.out.print("Apakah anda ingin menambah data lagi? (y/n)");
            String tambah = scanner.nextLine();

            if (tambah.equals("n")) {
                next = false;
            }
        }
        System.out.println("=====================Data Mahasiswa==========================");
        System.out.printf("|%-15s |%-20s |%-20s|\n","NIM","Nama","Alamat");
        System.out.println("=============================================================");
        for (int i = 0; i < data.nims.size(); i++) {
            System.out.printf("|%-15s |%-20s |%-20s|\n",data.getNims(i),data.getNamas(i),data.getAlamats(i));
        }
        System.out.println("=============================================================");
    }
}