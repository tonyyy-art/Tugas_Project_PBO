package com.login;
import com.data.DataDosen;
import com.data.DataMahasiswa;

public class Login {

    private DataDosen dataDosen;
    private DataMahasiswa dataMahasiswa;

    public void LoginMenu() {
        while (true) {
            System.out.println("1. Login Dosen");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Exit");
        }
        
    }
    
    public boolean loginDosen(String imputUsername, String inputPassword) {
        dataDosen = new DataDosen(imputUsername, inputPassword);
        return dataDosen.readUsername(imputUsername).equals(imputUsername) && dataDosen.readPassword(inputPassword).equals(inputPassword);
    }

        
}
