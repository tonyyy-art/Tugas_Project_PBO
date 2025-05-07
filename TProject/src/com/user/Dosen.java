package com.user;
import com.actions.*;
import com.login.Login;
import java.util.Scanner;

public class Dosen extends User implements reportNilai {

    private String username;
    private String password;
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
            diplayMenu();
        }else {
            System.out.println("Username atau password salah!");
            System.out.println("Silahkan coba lagi!");
        }
        
    }
    

    @Override
    public void diplayMenu() {
        System.out.println("====Menu Dosen====");
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
