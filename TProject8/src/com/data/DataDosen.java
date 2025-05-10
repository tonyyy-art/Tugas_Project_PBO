package com.data;

import java.io.*;

public class DataDosen extends Data {
    

    private FileWriter fileWriter1;
    private FileWriter fileWriter2;
    private String username;
    private String password;

    public DataDosen(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    {
        try {
            fileWriter1 = new FileWriter(getData1(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    {
        try {
            fileWriter2 = new FileWriter(getData2(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedWriter Writer1 = new BufferedWriter(fileWriter1);
    private BufferedWriter Writer2 = new BufferedWriter(fileWriter2);
    
    private FileReader fileReader1;
    private FileReader fileReader2;

    {
            try {
                fileReader1 = new FileReader(getData1());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    {
            try {
                fileReader2 = new FileReader(getData2());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }

    private BufferedReader reader1 = new BufferedReader(fileReader1);
    private BufferedReader reader2 = new BufferedReader(fileReader2); 

    public void writeDataDosen(String username, String password) {
        try{
               Writer1.write(username + " " + password );
               Writer1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readUsername(String inputUsername) {
        try  {
            reader1 = new BufferedReader(new FileReader(getData1()));
            String line; // Baca baris pertama
            while ((line = reader1.readLine()) != null) {
                String[] parts = line.trim().split("\\s+(?=\\d+$)"); // Pisahkan sebelum angka di akhir
                if (parts.length == 2) {
                    if (parts[0].trim().equals(inputUsername)) {
                        this.username = inputUsername;
                        break;
                    }
                }
            } 
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return username;
    }

   public String readPassword(String inputPassword) {
        try {
            // Reset reader1 to the beginning of the file
            reader1 = new BufferedReader(new FileReader(getData1()));
            String line;
            while ((line = reader1.readLine()) != null) {
                String[] tokens = line.trim().split("\\s+");
                if (tokens.length >= 2) {
                    String password = tokens[tokens.length - 1]; // Ambil token terakhir sebagai password
                    if (password.equals(inputPassword)) {
                        this.password = inputPassword;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return password;
    }
}
 