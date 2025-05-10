package com.login;
import java.util.Scanner;
import com.data.DataDosen;
import com.data.DataMahasiswa;
import com.user.*;

public class Login {

    private DataDosen dataDosen = new DataDosen();
    private DataMahasiswa dataMahasiswa = new DataMahasiswa("0", "0", 0, 0, 0, 0, 0, 0, 0, 0);
    Scanner scanner = new Scanner(System.in);

    public void LoginMenu() {
        while (true) {
            System.out.println("1. Login Dosen");
            System.out.println("2. Login Mahasiswa");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            if (choice == 1) {
                System.out.println("====Login Dosen====");
                System.out.print("Username: ");
                String usernameDosen = scanner.nextLine();
                System.out.print("Password: ");
                String passwordDosen = scanner.nextLine();
                if (loginDosen(usernameDosen, passwordDosen)) {
                    System.out.println("Login berhasil!");
                    User dosen = new Dosen(usernameDosen, passwordDosen);
                    dosen.diplayMenu();
                } else {
                    System.out.println("Username atau password salah!");
                }
            }else if (choice == 2) {
                System.out.println("====Login Mahasiswa====");
                System.out.print("Username: ");
                String usernameMahasiswa = scanner.nextLine();
                System.out.print("Password: ");
                String passwordMahasiswa = scanner.nextLine();
                if (loginMahasiswa(usernameMahasiswa, passwordMahasiswa)) {
                    System.out.println("Login berhasil!");
                        User mahasiswa = new Mahasiswa(usernameMahasiswa, passwordMahasiswa);
                        mahasiswa.diplayMenu();
                    } else {
                        System.out.println("Username atau password salah!");
                }
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
        }
        
    }
    
    private boolean loginDosen(String inputUsername, String inputPassword) {
        return dataDosen.readUsername(inputUsername).equals(inputUsername) && dataDosen.readPassword(inputPassword).equals(inputPassword);
    }

    private boolean loginMahasiswa(String imputUsername, String inputPassword) {
        return dataMahasiswa.readUsername(imputUsername).equals(imputUsername) && dataMahasiswa.readPassword(inputPassword).equals(inputPassword);
    }

        
}
