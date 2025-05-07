package com.user;
import com.actions.*;
import com.login.Login;
import java.util.Scanner;

public class Dosen extends User implements reportNilai {

    private String username;
    private String password;
    private String clear = Color.CLEAR;
    private Scanner scanner = new Scanner(System.in);

    public Dosen(String username, String password){
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void loginMenu() {
        System.out.println("====Login Dosen====");
        System.out.print("Username : ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password : ");
        String inputPassword = scanner.nextLine();
    
        Login login = new Login(inputUsername, inputPassword);

        if (login.login(inputUsername, inputPassword)) {
            System.out.println(clear);
            diplayMenu();
        }else {
            System.out.println("Username atau password salah!");
            System.out.println("Silahkan coba lagi!");
        }
        
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

    public void manageNilai() {

    }

    public void viewNilai() {

    }

    public void ubahNilai() {

    }

    public void hapusNilai() {

    }
    


    
}
