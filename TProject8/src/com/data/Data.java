package com.data;
import java.io.*;

public class Data {

    private File data = new File("data.txt");

    public void dataWriter(){
        try {
            FileWriter dataWriter = new FileWriter(data, true);
            BufferedWriter writer = new BufferedWriter(dataWriter);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    } 
    
    
}
