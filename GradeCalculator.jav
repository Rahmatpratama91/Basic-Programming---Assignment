// Assignment 2 - basic programming

import java.util.Scanner; // import library scanner

public class KalkulatorNilai { // Buat class kalkulator penilaian

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nilai angka mata kuliah (0-100) : "); // Menginput nilai angka
        int nilai = scanner.nextInt(); // Buat variabel nilai angka

        // Menentukan Nilai Huruf
        
        String NilaiHuruf; //Buat variabel nilai huruf
        
       // Buat kondisi nilai huruf berdasarkan nilai angka
        if (nilai >= 80 && nilai <= 100) {
            NilaiHuruf = "A";
        } else if (nilai >= 70 && nilai <= 79) {
            NilaiHuruf = "B";
        } else if (nilai >= 60 && nilai <= 69) {
            NilaiHuruf= "C";
        } else if (nilai >= 40 && nilai <= 59) {
            NilaiHuruf = "D";
        } else if (nilai >= 0 && nilai <= 39) {
            NilaiHuruf = "E";
        } else {
            NilaiHuruf = "Tidak Valid";
        }

        // Output hasil
        System.out.println("Nilai Huruf : " + NilaiHuruf);

        scanner.close();
    
		   
		
	}

}
