package com.layouts.components;

import java.util.Scanner;

import com.controllers.DbController;
import com.layouts.Menu;

public class DeleteData {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Pilih Data yang Ingin Dihapus");
        System.out.println("--------------------------------");
        DbController.printDataProduk();
        System.out.println("--------------------------------");
        System.out.println("**Note: Inputlah Nama Produk Dengan Benar!");
        System.out.print("Pilih Nama Produk: ");
        String nama = sc.nextLine();
        System.out.println("================================");

        if (DbController.deleteData(nama)) {
            System.out.println("Delete Data Berhasil");
        } else {
            System.out.println("Delete Data Gagal");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
