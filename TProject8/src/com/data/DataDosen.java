package com.data;

import java.io.*;

public class DataDosen extends Data {
    

    private FileWriter fileWriter1;
    private FileWriter fileWriter2;
    private String username;
    private String password;
    private String scanUsername;
    private String scanPassword;

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
                fileReader1 = new FileReader(getData2());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    {
            try {
                fileReader2 = new FileReader(getData1());
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
            String line;
            while ((line = reader1.readLine()) != null) {
                String[] parts = line.split("\\s+"); // split berdasarkan spasi
                if (parts.length >= 3) {
                    String readusername = parts[0] + " " + parts[1];
                    if (readusername.equals(inputUsername)) {
                        this.scanUsername = inputUsername;
                        break; // setelah ketemu, keluar loop
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return scanUsername;
    }

    public String readPassword(String inputPassword) {
        
        try  {
            String line;
            while ((line = reader1.readLine()) != null) {
                String[] parts = line.split("\\s+"); // split berdasarkan spasi
                if (parts.length >= 3) {
                    String readpassword = parts[2];
                    if (readpassword.equals(inputPassword)) {
                        this.scanPassword = inputPassword;
                        break; // setelah ketemu, keluar loop
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return scanPassword;
    }
}
