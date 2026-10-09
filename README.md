# Program Bangun Datar dan Bangun Ruang

Program Java sederhana untuk menampilkan informasi bentuk, lingkaran, bujur sangkar, dan silinder.

## Cara Menjalankan

Jalankan class `Main` dari VS Code. Program membuat satu object dari setiap class dan memanggil `printInfo()`.

## Konsep OOP

- **Encapsulation:** `BujurSangkar` dan `Silinder` menyimpan atributnya sebagai `private` dan menyediakan getter serta setter. Atribut `warna` pada `Bentuk` masih `public`.
- **Inheritance:** `Lingkaran` dan `BujurSangkar` mewarisi `Bentuk`. `Silinder` mewarisi `Lingkaran`.
- **Polymorphism:** `BujurSangkar` dan `Silinder` meng-override `printInfo()`. Pemanggilan method tersebut menampilkan informasi sesuai jenis object.

## Screenshot


![Hasil program](<SS/Screenshot 2026-10-09 204436.png>)
