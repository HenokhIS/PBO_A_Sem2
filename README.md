# App.java
didalam App.java terdapat objek main method, main method ini berisikan Menu.showMenu() yang memanggil metode static dari class Menu

Memanggil Menu.showMenu() berfungsi untuk mengeprint list yang berisi untuk Read Data, Insert Data, Delete Data, Edit Data, dan juga untuk keluar dari program yang sedang looping.

# com
terdapat beberapa package yaitu:
1. config
2. controllers
3. layouts
4. models

## 1. config
DbConnect: Merupakan class yang menghubungkan Java dengan MySQL (phpmyadmin)

## 2. controllers
DbController: Class ini berfungsi sebagai penghubung antara koneksi database (DbConnect) dan layouts, dengan method-method untuk mengontrol operasi CRUD dan memindahkan data.

## 3. layouts
Terdapat package lagi didalam package layouts yang bernama components dan berisikan DeleteData.java, EditData.java, InsertData.java, dan ReadData.java. lalu di luar package components terdapat file Menu.java

### 3.1 components
1. DeleteData.java : Class untuk menampilkan print output menu hapus data yang ada di database dari class Menu.
2. EditData.java : Class yang berisikan menu lagi, yaitu:
Edit nama produk
Edit harga produk
Edit stok produk
Fungsinya adalah untuk meng-update/mengubah data yang ada di database.
3. InsertData: Class yang berfungsi untuk menginput data produk baru dan memasukkannya ke database.
4. ReadData: Class yang berperan untuk menampilkan semua produk yang ada di database.

### 3.2 menu
Menu: Class ini berada di luar package/folder components dan bertanggung jawab untuk menampilkan menu secara keseluruhan dan memanggil method-method static dari class components sesuai dengan input yang diminta dari pengguna.

## 4. models
Produk: Model Java dengan atribut yang mencerminkan kolom-kolom tb_produk di database. Dalam class DbController, terdapat method getProdukByNama(String nama) yang akan mengembalikan instance model Produk ini.