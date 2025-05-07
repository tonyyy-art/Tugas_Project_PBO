package com.user;
import com.actions.viewNilai;
import com.login.Login;
import java.util.Scanner;

public class Mahasiswa extends User implements viewNilai{
    String username;
    String password;
    String nim = password;
    Scanner scanner = new Scanner(System.in);

    public Mahasiswa(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void loginMenu() {
        // Implementasi login menu untuk Mahasiswa
        System.out.println("====Login Mahasiswa====");
        System.out.print("Username : ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password : ");
        String inputPassword = scanner.nextLine();
    
        Login login = new Login(inputUsername, inputPassword);

        if (login.login(inputUsername, inputPassword)) {
            diplayMenu();
        }else {
            System.out.println("Username atau password salah!");
            System.out.println("Silahkan coba lagi!");
        }
    }

    @Override
    public void diplayMenu() {
        // Implementasi display menu untuk Mahasiswa
        System.out.println("====Menu Mahasiswa====");
        System.out.println("1. View Nilai");
        System.out.println("2. Logout");
        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewNilai();
                break;
            case 2:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                diplayMenu();
        }
    }

    public void viewNilai() {
        // Implementasi untuk melihat nilai
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}
