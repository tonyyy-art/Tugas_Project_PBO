package com.user;
import com.actions.reportNilai;
import com.actions.Color;
import com.login.Login;
import com.data.Nilai;
import java.util.Scanner;

public class Dosen extends User implements reportNilai {

    private String username;
    private String password;
    private String nip = password;
    private Scanner scanner = new Scanner(System.in);

    public Dosen(String username, String password){
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void diplayMenu() {
        System.out.println("====Menu Dosen====");
        System.out.println("1. Manage Nilai");
        System.out.println("2. View Nilai");
        System.out.println("3. Ubah Nilai");
        System.out.println("4. Hapus Nilai");
        System.out.println("5. Logout");
        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                manageNilai();
                break;
            case 2:
                viewNilai();
                break;
            case 3:
                ubahNilai();
                break;
            case 4:
                hapusNilai();
                break;
            case 5:
                System.out.println("Logout berhasil!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                diplayMenu();
        }
    }

    public void setUsername(String username) {// Setter for username
        this.username = username;
    }

    public void setNip(String nip) {// Setter for nip
        this.nip = nip;
    }

    public String getNip() {// Getter for nip
        return nip;
    }

    public String getUsername() {// 
        return username;
    }

    public void manageNilai() {
        System.out.println("====Manage Nilai====");
        System.out.println("------Masukkan Nilai------");
        System.out.print("Nilai Matematika Diskrit: ");
        int nilai1 = scanner.nextInt();
        System.out.print("Nila PBO: ");
        int nilai2 = scanner.nextInt();
        System.out.print("Nilai Algoritma: ");
        int nilai3 = scanner.nextInt();
        System.out.print("Nilai Jaringan Komputer: ");
        int nilai4 = scanner.nextInt();
        System.out.print("Nilai Basis Data: ");
        int nilai5 = scanner.nextInt();
        System.out.print("Nilai Sistem Operasi: ");
        int nilai6 = scanner.nextInt();
        System.out.print("Nilai Pemrograman Web: ");
        int nilai7 = scanner.nextInt();

        Nilai nilai = new Nilai(nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai7);
        System.out.println("Nilai berhasil disimpan!");

    }

    public void viewNilai() {

    }

    public void ubahNilai() {

    }

    public void hapusNilai() {

    }
    


    
}
