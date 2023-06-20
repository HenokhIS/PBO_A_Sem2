package com.layouts;

import java.util.Scanner;

import com.layouts.components.DeleteData;
import com.layouts.components.EditData;
import com.layouts.components.InsertData;
import com.layouts.components.ReadData;

public class Menu {
    public static void showMenu() {
        System.out.println();
        System.out.println("================================");
        System.out.println("WELCOME TO DB PRODUK");
        System.out.println("================================");
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert Data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete Data");
        System.out.println("5.] Exit");
        System.out.println("================================");
        System.out.print("Pilih: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    ReadData.showReadData();
                    break;
                case 2:
                    InsertData.showInsertData();
                    break;
                case 3:
                    EditData.showEditData(null);
                    break;
                case 4:
                    DeleteData.showDeleteData();
                    break;
                case 5:
                    System.out.println("================================");
                    System.out.println("Terima Kasih");
                    System.out.println("--------------------------------");
                    System.exit(0);
                default:
                    System.out.println("================================");
                    System.out.println("PIlihan Tidak Tersedia");
                    System.out.println("--------------------------------");
                    showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Inputan Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        sc.close();
    }
}
