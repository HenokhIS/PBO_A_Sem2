package com.layouts.components;

import java.util.Scanner;

import com.controllers.DbController;
import com.layouts.Menu;
import com.models.Produk;

public class EditData {
    public static void showEditData(String nama) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Pilih Data yang Ingin Diedit");
        System.out.println("================================");
        DbController.printDataProduk();
        System.out.println("================================");
        System.out.println("**Note: Inputlah Nama Produk Dengan Benar!");
        System.out.print("Pilih Nama Produk: ");
        nama = sc.nextLine();

        System.out.println("================================");
        System.out.println("Pilih Menu Update Data");
        System.out.println("================================");
        System.out.println("1. Update Nama");
        System.out.println("2. Update Harga");
        System.out.println("3. Update Stok");
        System.out.println("4. Back to Menu");

        System.out.println("================================");
        System.out.print("Pilihan: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    showEditNama(nama);
                    break;
                case 2:
                    showEditHarga(nama);
                    break;
                case 3:
                    showEditStok(nama);
                    break;
                case 4:
                    Menu.showMenu();
                    break;
                default:
                    System.out.println("================================");
                    System.out.println("Nama Produk atau Menu yang Dipilih Tidak Ada");
                    System.out.println("--------------------------------");
                    Menu.showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Nama Produk atau Menu yang Dipilih Tidak Ada");
            System.out.println("--------------------------------");
            Menu.showMenu();
        }
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditNama(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Nama Awal: " + produk.getNama());
        System.out.println("--------------------------------");
        System.out.print("Nama Baru: ");
        String namaBaru = sc.nextLine();
        DbController.updateNama(produk.getId(), namaBaru);

        System.out.println("================================");
        System.out.println("Data Nama Berhasil diUpdate");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Harga Awal: " + produk.getHarga());
        System.out.println("--------------------------------");
        System.out.print("Harga Baru: ");
        long hargaBaru = sc.nextLong();
        DbController.updateHarga(produk.getId(), hargaBaru);

        System.out.println("================================");
        System.out.println("Data Harga Berhasil diUpdate");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditStok(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Stok Awal: " + produk.getStok());
        System.out.println("--------------------------------");
        System.out.print("Stok Baru: ");
        int stokBaru = sc.nextInt();
        DbController.updateStok(produk.getId(), stokBaru);

        System.out.println("================================");
        System.out.println("Data Stok Berhasil diUpdate");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
