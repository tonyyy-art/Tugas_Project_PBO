package com.data;
import java.io.*;

public class Data {

    private File data = new File("data.txt");
    private int nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai7;
    private double ipk;

    private FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter(data, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedWriter Writer = new BufferedWriter(fileWriter);
    
    private FileReader fileReader;

    {
            try {
                fileReader = new FileReader(data);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }

    private BufferedReader reader = new BufferedReader(fileReader); 


    public Data(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int nilai6, int nilai7) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilai6 = nilai6;
        this.nilai7 = nilai7;
    }

   

    public void writeData() {

    }

    
    
}
