package com.user;
import com.actions.*;
import com.login.Login;
import java.util.Scanner;

public class Mahasiswa extends User implements viewNilai{
    String username;
    String password;
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
    }

    public void viewNilai() {
        // Implementasi untuk melihat nilai
    }
}
