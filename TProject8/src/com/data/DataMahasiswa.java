package com.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataMahasiswa extends Data{

    private int nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai7;
    private String username, password;
    private double ipk;
    
    public DataMahasiswa(String username, String password, int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int nilai6, int nilai7, double ipk) {
        this.username = username;
        this.password = password;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilai6 = nilai6;
        this.nilai7 = nilai7;
        this.ipk = ipk;
    }

    
    private FileReader fileReader;

    {
            try {
                fileReader = new FileReader(getData2());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }

    private BufferedReader reader = new BufferedReader(fileReader); 

    public String readUsername(String inputUsername) {
        
        try  {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+"); // split berdasarkan spasi
                if (parts.length >= 3) {
                    String readusername = parts[0] + " " + parts[1];
                    if (readusername == inputUsername) {
                        username = inputUsername;
                        break; // setelah ketemu, keluar loop
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return username;
    }

    public String readPassword(String inputPassword) {
        
        try  {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" "); // split berdasarkan spasi
                if (parts.length >= 3) {
                    String readpassword =  parts[1];
                    if (readpassword == inputPassword) {
                        password = inputPassword;
                        break; // setelah ketemu, keluar loop
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return password;
    }

}
