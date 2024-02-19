package Latihan2;
import java.util.Scanner;
public class PersegiPanjang {
    // Atribut kelas
    private double panjang; // Menyimpan nilai panjang persegi panjang
    private double lebar; // Menyimpan nilai lebar persegi panjang

    // Constructor untuk inisialisasi panjang dan lebar
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Fungsi untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Fungsi untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Metode untuk menampilkan nilai atribut panjang, lebar, luas, dan keliling
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang dan lebar
        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Menampilkan hasil
        persegiPanjang.tampil();

        scanner.close();
    }
}
